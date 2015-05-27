/**
 * Express configuration
 */

'use strict';

var express = require('express');
var favicon = require('static-favicon');
var morgan = require('morgan');
var compression = require('compression');
var bodyParser = require('body-parser');
var methodOverride = require('method-override');
var cookieParser = require('cookie-parser');
var errorHandler = require('errorhandler');
var path = require('path');
var config = require('./environment');
var passport = require('passport');
var exphbs  = require('express-handlebars');
var fs = require('fs');

module.exports = function(app) {
  var env = app.get('env');

   app.set('views', config.root + '/server/views');
  app.engine('html', require('ejs').renderFile);
  app.set('view engine', 'html');

  app.use(compression());
  app.use(bodyParser.urlencoded({ extended: true }));
  app.use(bodyParser.json());// get information from html forms
  app.use(methodOverride());
  app.use(cookieParser());// read cookies (needed for auth)
  // required for passport

  app.use(passport.initialize());
  app.use(passport.session()); // persistent login sessions
    
 morgan.token('body', function(req, res){ return  req.params; })
// morgan.token('body', function(req, res){ return req.body; })
    
  if ('production' === env) {
    app.use(favicon(path.join(config.root, 'public', 'favicon.ico')));
    app.use(express.static(path.join(config.root, 'public')));
    app.set('appPath', config.root + '/public');
    app.use(morgan(':body :method :url :response-time'));
//    app.use(morgan('dev'));
  }

  if ('development' === env || 'test' === env) {
    app.use(require('connect-livereload')());
    app.use(express.static(path.join(config.root, '.tmp')));
    app.use(express.static(path.join(config.root, 'client')));
    app.set('appPath', 'client');
    app.use(morgan(':body :method :url :response-time'));
//    app.use(morgan('dev'));
    app.use(errorHandler()); // Error handler - has to be last
  }
    
// var accessLogStream = fs.createWriteStream(__dirname + '/access.log', {flags: 'a'})
//
//// setup the logger
//app.use(morgan('combined', {stream: accessLogStream}))
};