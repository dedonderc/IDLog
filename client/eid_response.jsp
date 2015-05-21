<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="be.fedict.eid.applet.service.Identity"%>
<%@page import="be.fedict.eid.applet.service.Address"%>
<!doctype html>
<html class="no-js" lang="">
    <head>
        <meta charset="utf-8">
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>webapp</title>
        <!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
        <!-- build:css styles/vendor.css -->
        <!-- bower:css -->
        <!-- endbower -->
        <!-- endbuild -->
        <!-- build:css styles/main.css -->
        <link rel="stylesheet" href="styles/main.css">
        <!-- endbuild -->
        <!-- build:js scripts/vendor/modernizr.js -->
        <script src="/bower_components/modernizr/modernizr.js"></script>
        <!-- endbuild -->
    </head>
    <body>
        <!--[if lt IE 10]>
            <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
        <![endif]-->
        <div class="container">
            <nav class="navbar navbar-default">
                <div class="container-fluid">
                    <!-- Brand and toggle get grouped for better mobile display -->
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        </button>
                        <a class="navbar-brand" href="#">Brand</a>
                    </div>
                    <!-- Collect the nav links, forms, and other content for toggling -->
                    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                        <ul class="nav navbar-nav">
                            <li><a href="index.html">Home</a></li>
                            <li><a href="input.html">input</a></li>
                            <li><a href="eid_input.html">input</a></li>
                        </ul>
                        <form class="navbar-form navbar-left" role="search">
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="Search">
                            </div>
                            <button type="submit" class="btn btn-default">Submit</button>
                        </form>
                        <ul class="nav navbar-nav">
                            <li><a href="login.html">login/logout</a></li>
                        </ul>
                        </div><!-- /.navbar-collapse -->
                        </div><!-- /.container-fluid -->
                    </nav>
                    <div class="jumbotron">
                        <div class="">
                            <img class="center-block img-circle" alt="140x140" src="photo.jpg" style="width: 140px; height: 140px;">
                        </div>
                    </div>
                    <div class="row" id="applet">
                    </div>
                    <div class="row">
                        <form class="form-horizontal">
                            <div class="form-group">
                                <label class="col-sm-3 control-label" for="idNaam">Naam</label>
                                <div class="col-sm-8">
                                    <input type="text" class="form-control" id="idNaam" placeholder="Naam" value="<%=((Identity) session.getAttribute("eid.identity")).firstName%> <%=((Identity) session.getAttribute("eid.identity")).middleName%><%=((Identity) session.getAttribute("eid.identity")).name%>">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label" for="idNatNum">Rijksregisternummer</label>
                                <div class="col-sm-8">
                                    <input type="text" class="form-control" id="idNatNum" placeholder="Rijksregisternummer" value="<%=((Identity) session.getAttribute("eid.identity")).nationalNumber%>">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label" for="idDate">Geboortedatum</label>
                                <div class="col-sm-8"><input type="date" class="form-control" id="idDatePlace" placeholder="Geboortedatum" value="<%=((Identity) session.getAttribute("eid.identity")).dateOfBirth
                            .getTime()%>"></div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label" for="idPlace">Plaats</label>
                                <div class="col-sm-8"><input type="text" class="form-control" id="idPlace" placeholder="Plaats" value="<%=((Identity) session.getAttribute("eid.identity")).placeOfBirth%>"></div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label" for="idNat">Nationaliteit</label>
                                <div class="col-sm-8">
                                    <input type="text" class="form-control" id="idNat" placeholder="Nationaliteit" value="<%=((Identity) session.getAttribute("eid.identity")).nationality%>">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label" for="idAdress">Adres</label>
                                <div class="col-sm-8">
                                    <input type="text" class="form-control" id="idAdress" placeholder="Adres" value="<%=((Address) session.getAttribute("eid.address")).streetAndNumber%> <%=((Address) session.getAttribute("eid.address")).zip%> <%=((Address) session.getAttribute("eid.address")).municipality%>">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label" for="idCNr">Kaartnummer</label>
                                <div class="col-sm-8">
                                    <input type="text" class="form-control" id="idCNr" placeholder="Kaartnummer" value="<%=((Identity) session.getAttribute("eid.identity")).cardNumber%>">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label" for="idValFrom">Geldigheid van</label>
                                <div class="col-sm-8">
                                    <input type="text" class="form-control" id="idValFrom" placeholder="Geldigheid van" value="<%=((Identity) session.getAttribute("eid.identity")).cardValidityDateBegin
                                    .getTime()%>">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label" for="idValTill">Geldigheid tot</label>
                                <div class="col-sm-8">
                                    <input type="text" class="form-control" id="idValTill" placeholder="Geldigheid tot" value="<%=((Identity) session.getAttribute("eid.identity")).cardValidityDateEnd
                                    .getTime()%>">
                                </div>
                            </div>
                            <button type="submit" class="btn btn-default">Submit</button>

                            <button type="button"  id="btnReadId" class="btn btn-success">Lees E-Id</button>
                        </form>
                        <!-- <form role="form">
                            <div class="row">
                                    <div class="col-xs-6 col-sm-6 col-md-6">
                                            <div class="form-group">
                                                    <input type="text" name="first_name" id="first_name" class="form-control input-sm" placeholder="First Name">
                                            </div>
                                    </div>
                                    <div class="col-xs-6 col-sm-6 col-md-6">
                                            <div class="form-group">
                                                    <input type="text" name="last_name" id="last_name" class="form-control input-sm" placeholder="Last Name">
                                            </div>
                                    </div>
                            </div>
                            <div class="form-group">
                                    <input type="email" name="email" id="email" class="form-control input-sm" placeholder="Email Address">
                            </div>
                            <div class="row">
                                    <div class="col-xs-6 col-sm-6 col-md-6">
                                            <div class="form-group">
                                                    <input type="password" name="password" id="password" class="form-control input-sm" placeholder="Password">
                                            </div>
                                    </div>
                                    <div class="col-xs-6 col-sm-6 col-md-6">
                                            <div class="form-group">
                                                    <input type="password" name="password_confirmation" id="password_confirmation" class="form-control input-sm" placeholder="Confirm Password">
                                            </div>
                                    </div>
                            </div>
                        
                            <input type="submit" value="Register" class="btn btn-info btn-block">
                        </form> -->
                    </div>
                    <div class="footer">
                        <p> IDLog team</p>
                    </div>
                </div>
                <!-- Google Analytics: change UA-XXXXX-X to be your site's ID. -->
                <script>
                                                    (function(b,o,i,l,e,r){b.GoogleAnalyticsObject=l;b[l]||(b[l]=
                                                    function(){(b[l].q=b[l].q||[]).push(arguments)});b[l].l=+new Date;
                                                    e=o.createElement(i);r=o.getElementsByTagName(i)[0];
                                                    e.src='//www.google-analytics.com/analytics.js';
                                                    r.parentNode.insertBefore(e,r)}(window,document,'script','ga'));
                                                    ga('create','UA-XXXXX-X');ga('send','pageview');
                </script>
                <!-- build:js scripts/vendor.js -->
                <!-- bower:js -->
                <script src="/bower_components/jquery/dist/jquery.js"></script>
                <!-- endbower -->
                <!-- endbuild -->
                <!-- build:js scripts/plugins.js -->
                <script src="/bower_components/bootstrap-sass-official/assets/javascripts/bootstrap/affix.js"></script>
                <script src="/bower_components/bootstrap-sass-official/assets/javascripts/bootstrap/alert.js"></script>
                <script src="/bower_components/bootstrap-sass-official/assets/javascripts/bootstrap/dropdown.js"></script>
                <script src="/bower_components/bootstrap-sass-official/assets/javascripts/bootstrap/tooltip.js"></script>
                <script src="/bower_components/bootstrap-sass-official/assets/javascripts/bootstrap/modal.js"></script>
                <script src="/bower_components/bootstrap-sass-official/assets/javascripts/bootstrap/transition.js"></script>
                <script src="/bower_components/bootstrap-sass-official/assets/javascripts/bootstrap/button.js"></script>
                <script src="/bower_components/bootstrap-sass-official/assets/javascripts/bootstrap/popover.js"></script>
                <script src="/bower_components/bootstrap-sass-official/assets/javascripts/bootstrap/carousel.js"></script>
                <script src="/bower_components/bootstrap-sass-official/assets/javascripts/bootstrap/scrollspy.js"></script>
                <script src="/bower_components/bootstrap-sass-official/assets/javascripts/bootstrap/collapse.js"></script>
                <script src="/bower_components/bootstrap-sass-official/assets/javascripts/bootstrap/tab.js"></script>
                <!-- endbuild -->
                <!-- build:js scripts/main.js -->
                <script src="scripts/main.js"></script>
                <!-- endbuild -->
                <script src="scripts/deployJava_mod.js"></script>

                <script type="text/javascript">
                $("#btnReadId").on('click', function(){
                    function docWriteWrapper(func) {
                        var writeTo = document.createElement('del'),
                            oldwrite = document.write,
                            content = '';
                        writeTo.id = "me";
                        document.write = function(text) {
                            content += text;
                        }
                        func();
                        writeTo.innerHTML += content;
                        document.write = oldwrite;
                        document.body.appendChild(writeTo);
                    }
                    docWriteWrapper(function () {
                        var attributes = {
                            code :'be.fedict.eid.applet.Applet.class',
                            archive :'/lib/eid-applet-package-1.1.3.jar',
                            width :400,
                            height :300
                            };
                        var parameters = {
                            TargetPage :'eid_response.jsp',
                            AppletService : 'applet-service',
                            BackgroundColor : '#ffffff'
                            };
                        var version = '1.6';
                        deployJava.runApplet(attributes, parameters, "1.6");
                    });

                });

                var eidData = {
                    name : "<%=((Identity) session.getAttribute("eid.identity")).name%>"
                };
                </script>
            </body>
        </html>