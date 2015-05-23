/**
 * Main application routes
 */

'use strict';

var errors = require('./components/errors');
var auth = require('./auth/auth.service');
module.exports = function(app, passport) {

// normal routes ===============================================================

  // Insert routes below
  app.use('/api/eids', require('./api/eid'));
  app.use('/api/users', require('./api/user'));

  app.use('/auth', require('./auth'));
  
  // All undefined asset or api routes should return a 404
  app.route('/:url(api|auth|components|app|bower_components|assets)/*')
   .get(errors[404]);
    
    
    // All other routes should redirect to the index.html
    app.route('/input')
    .get(auth.isAuthenticated(), function(req, res) {
      res.sendfile(app.get('appPath') + '/input.html');
    });
    app.route('/list')
    .get(auth.isAuthenticated(), function(req, res) {
      res.sendfile(app.get('appPath') + '/eid_list.html');
    });
    
//     app.route('/input')
//    .get(auth.isAuthenticated(),function(req, res) {
//      res.sendfile(app.get('appPath') + '/input.html');
//    });


    // PROFILE SECTION =========================
    app.get('/login', function(req, res) {
        res.sendfile(app.get('appPath') + '/login.html');
    });

    // LOGOUT ==============================
    app.get('/logout', function(req, res) {
        req.logout();
        res.sendfile(app.get('appPath') + '/login.html');
    });
    
    
  // All other routes should redirect to the index.html
  app.route('/*')
    .get(function(req, res) {
      res.sendfile(app.get('appPath') + '/login.html');
    });

    
    
   

// =============================================================================
// AUTHENTICATE (FIRST LOGIN) ==================================================
// =============================================================================

//    // locally --------------------------------
//        // LOGIN ===============================
//        // show the login form
//        app.get('/login', function(req, res) {
//            res.render('login.ejs', { message: req.flash('loginMessage') });
//        });
//
//        // process the login form
//        app.post('/login', passport.authenticate('local-login', {
//            successRedirect : '/profile', // redirect to the secure profile section
//            failureRedirect : '/login', // redirect back to the signup page if there is an error
//            failureFlash : true // allow flash messages
//        }));
//
//        // SIGNUP =================================
//        // show the signup form
//        app.get('/signup', function(req, res) {
//            res.render('signup.ejs', { message: req.flash('signupMessage') });
//        });
//
//        // process the signup form
//        app.post('/signup', passport.authenticate('local-signup', {
//            successRedirect : '/profile', // redirect to the secure profile section
//            failureRedirect : '/signup', // redirect back to the signup page if there is an error
//            failureFlash : true // allow flash messages
//        }));
//
//
//// =============================================================================
//// AUTHORIZE (ALREADY LOGGED IN / CONNECTING OTHER SOCIAL ACCOUNT) =============
//// =============================================================================
//
//    // locally --------------------------------
//        app.get('/connect/local', function(req, res) {
//            res.render('connect-local.ejs', { message: req.flash('loginMessage') });
//        });
//        app.post('/connect/local', passport.authenticate('local-signup', {
//            successRedirect : '/profile', // redirect to the secure profile section
//            failureRedirect : '/connect/local', // redirect back to the signup page if there is an error
//            failureFlash : true // allow flash messages
//        }));
//
// 
//// =============================================================================
//// UNLINK ACCOUNTS =============================================================
//// =============================================================================
//// used to unlink accounts. for social accounts, just remove the token
//// for local account, remove email and password
//// user account will stay active in case they want to reconnect in the future
//
//    // local -----------------------------------
//    app.get('/unlink/local', isLoggedIn, function(req, res) {
//        var user            = req.user;
//        user.local.email    = undefined;
//        user.local.password = undefined;
//        user.save(function(err) {
//            res.redirect('/profile');
//        });
//    });
//
//
//
//};
//
//// route middleware to ensure user is logged in
//function isLoggedIn(req, res, next) {
//    if (req.isAuthenticated())
//        return next();
//
//    res.redirect('/');
}
