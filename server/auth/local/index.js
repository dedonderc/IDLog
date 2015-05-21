'use strict';

var express = require('express');
var passport = require('passport');
var auth = require('../auth.service');
var errors = require('../../components/errors');

var router = express.Router();

router.post('/', function (req, res, next) {
    passport.authenticate('local', function (err, user, info) {
        var error = err || info;
        if (error) {
//          return errors[401](req,res,error);
            return res.send(401)
        }
        if (!user) {
          return errors[404](req,res,{
                message: 'Something went wrong, please try again.'
            });
        }

        var token = auth.signToken(user._id, user.role);
         res.json({token: token});
//        res.cookie('token', token);
//        res.redirect('/input')
    })(req, res, next)
});

module.exports = router;