/**
 * Using Rails-like standard naming convention for endpoints.
 * GET     /eids              ->  index
 * POST    /eids              ->  create
 * GET     /eids/:id          ->  show
 * PUT     /eids/:id          ->  update
 * DELETE  /eids/:id          ->  destroy
 */

'use strict';

var _ = require('lodash');
var Eid = require('./eid.model');

// Get list of eids
function index (req, res) {
    Eid.find(function (err, eids) {
        if (err) {
            return handleError(res, err);
        }
        return res.json(200, eids);
    });
};

// Get a single eid
function show (req, res) {
    Eid.findById(req.params.id, function (err, eid) {
        if (err) {
            return handleError(res, err);
        }
        if (!eid) {
            return res.send(404);
        }
        return res.json(eid);
    });
};

// Creates a new eid in the DB.
 function create (req, res) {
     var query  = Eid.where({ nationalNumber: req.params.nationalNumber });
     query.findOne(function (err, eid) {
      if (err){
          
      }
      if (eid) {
        var updated = _.merge(eid, req.body);
        updated.save(function (err) {
            if (err) {
                return handleError(res, err);
            }
            return res.json(200, eid);
        });   
      }else{
        Eid.create(req.body, function (err, eid) {
            if (err) {
                return handleError(res, err);
            }
            return res.json(201, eid);
        });
    
      }
})};

// Updates an existing eid in the DB.
 function update (req, res) {
//    if (req.body._id) {
//        delete req.body._id;
//    }
    Eid.findById(req.body._id, function (err, eid) {
        if (err) {
            return handleError(res, err);
        }
        if (!eid) {
            return res.send(404);
        }
        var updated = _.merge(eid, req.body);
        updated.save(function (err) {
            if (err) {
                return handleError(res, err);
            }
            return res.json(200, eid);
        });
    });
};

// Deletes a eid from the DB.
 function destroy (req, res) {
    Eid.findById(req.params.id, function (err, eid) {
        if (err) {
            return handleError(res, err);
        }
        if (!eid) {
            return res.send(404);
        }
        eid.remove(function (err) {
            if (err) {
                return handleError(res, err);
            }
            return res.send(204);
        });
    });
};

function handleError(res, err) {
    return res.send(500, err);
}

exports.update = update;
exports.destroy = destroy;
exports.create = create;
exports.show = show;
exports.index = index;