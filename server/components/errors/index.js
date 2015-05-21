/**
 * Error responses
 */

'use strict';

module.exports[404] = function pageNotFound(req, res,message) {
  var viewFilePath = '404';
  var statusCode = 404;
  var result = {
    status: statusCode
  };

  res.status(result.status);
  res.render(viewFilePath, message);
};
module.exports[401] = function unAuthorized(req, res,message) {
  var viewFilePath = '401';
  var statusCode = 401;
  var result = {
    status: statusCode
  };

  res.status(result.status);
  res.render(viewFilePath, message);

};