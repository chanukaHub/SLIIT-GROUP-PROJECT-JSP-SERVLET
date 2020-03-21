<%--
  Created by IntelliJ IDEA.
  User: Rivindu Chamath
  Date: 04-Mar-20
  Time: 6:41 AM
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html >
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Employee Management</title>
    <link rel="icon" type="image/png" href="../../images/icons/title.png"/>
    <!-- Bootstrap -->
    <link href="../../vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="../../vendors/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <!-- NProgress -->
    <link href="../../vendors/nprogress/nprogress.css" rel="stylesheet">

    <!-- Custom Theme Style -->
    <link href="../../build/css/custom.min.css" rel="stylesheet">
</head>

<body style="cursor: pointer" class="nav-md">

<div class="pos-f-t">
    <div class="collapse" id="navbarToggleExternalContent">
        <div class="bg-dark p-4">
            <nav class="navbar navbar-expand-lg navbar-light bg-dark">
                <a style="cursor: pointer" class="navbar-brand" href="Dashboard">Employee Management</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse"
                        data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                        aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav mr-auto">
                        <li class="nav-item active">
                            <a style="cursor: pointer !important;" class="nav-link" href="Dashboard">Home <span
                                    class="sr-only">(current)</span></a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Link</a>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                               data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                Dropdown
                            </a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <a class="dropdown-item" href="#">Action</a>
                                <a class="dropdown-item" href="#">Another action</a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="index">Something else here</a>
                            </div>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="index">Log Out</a>
                        </li>
                    </ul>
                    <form class="form-inline my-2 my-lg-0">
                        <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                        <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                    </form>
                </div>
            </nav>
        </div>
    </div>
    <nav class="navbar navbar-dark bg-dark">
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarToggleExternalContent"
                aria-controls="navbarToggleExternalContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
    </nav>
</div>

<c:choose>

    <%--<c:when test="${mode=='MODE_HOME' }">--%>
    <%--<div class="container" id="homediv">--%>
    <%--<div class="jumbotron text-center">--%>
    <%--<h1>Welcome to Tecno-tab</h1>--%>
    <%--<h3>Subscribe my channel to support me</h3>--%>
    <%--</div>--%>
    <%--</div>--%>

    <%--</c:when>--%>
    <c:when test="${mode=='MODE_REGISTER' }">
        <!-- page content -->

        <div class="">
            <div class="">

                <div class="x_panel">
                    <div class="x_title">
                        <h2>Home >>
                            <small><a style="color: #007bff;cursor:hand"
                                      onMouseOver="this.style.color='red'; this.style.fontWeight='bold'"
                                      onMouseOut="this.style.color='#00F'; this.style.fontWeight='normal'"
                                      href="/Dashboard">click here</a></small>
                        </h2>
                        <ul class="nav navbar-right panel_toolbox">
                            <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                            </li>
                            <li><a class="close-link"><i class="fa fa-close"></i></a>
                            </li>
                        </ul>
                        <div class="clearfix"></div>
                    </div>

                    <div class="x_content">
                        <form class="form-horizontal" method="POST" action="Dashboards">
                            <span class="section">Manage Employee
                            <span style="float: right">

                        <input type="checkbox" name="admin" value="${true }"><span style="font-size: 70%">isAdmin</span><BR>


                            </span>
                            </span>

                                <%--Name--%>
                            <div class="field item form-group">
                                <label class="col-form-label col-md-3 col-sm-3  label-align">Name<span
                                        class="required">*</span></label>
                                <div class="col-md-6 col-sm-6">
                                    <input class="form-control" data-validate-length-range="6"
                                           data-validate-words="2" name="name"
                                           placeholder="ex. John f. Kennedy" required="required"
                                           value="${employee.name }"/>
                                </div>
                            </div>

                                <%--NIC No--%>
                            <div class="field item form-group">
                                <label class="col-form-label col-md-3 col-sm-3  label-align">NIC No<span
                                        class="required">*</span></label>
                                <div class="col-md-6 col-sm-6">
                                    <input class="form-control" class='optional' name="idNo"
                                           data-validate-words="1"required="required"
                                           value="${employee.idNo }"/></div>
                            </div>

                                <%--<input type="hidden" name="id" value="${employee.id }" />--%>
                                <%--Email--%>
                            <div class="field item form-group">
                                <label class="col-form-label col-md-3 col-sm-3  label-align">email<span
                                        class="required">*</span></label>
                                <div class="col-md-6 col-sm-6">
                                    <input class="form-control" name="email" class='email' required="required"
                                           type="email"/></div>
                            </div>
                            <div class="field item form-group">
                                <label class="col-form-label col-md-3 col-sm-3  label-align">Confirm email
                                    address<span
                                            class="required">*</span></label>
                                <div class="col-md-6 col-sm-6">
                                    <input class="form-control" type="email" class='email' name="confirm_email"
                                           data-validate-linked='email' required='required' value="${employee.email }"/>
                                </div>
                            </div>

                                <%--Occupation--%>
                            <div class="field item form-group">
                                <label class="col-form-label col-md-3 col-sm-3  label-align">Occupation<span
                                        class="required">*</span></label>
                                <div class="col-md-6 col-sm-6">
                                    <input class="form-control" class='optional' name="occupation"
                                           type="text" value="${employee.occupation}"/></div>
                            </div>

                                <%--Registered Date--%>
                            <div class="field item form-group">
                                <label class="col-form-label col-md-3 col-sm-3  label-align">Registered
                                    Date<span
                                            class="required">*</span></label>
                                <div class="col-md-6 col-sm-6">
                                    <input class="form-control" class='date' type="date" name="date"
                                           required='required' value="${employee.date }"></div>
                            </div>


                                <%--Password--%>
                            <div class="field item form-group">
                                <label class="col-form-label col-md-3 col-sm-3  label-align">Password<span
                                        class="required">*</span></label>
                                <div class="col-md-6 col-sm-6">
                                    <input class="form-control" type="password" name="password"
                                           data-validate-length="6,8"
                                           required='required' value="${employee.password }"/></div>
                            </div>

                                <%--Salary--%>
                            <div class="field item form-group">
                                <label class="col-form-label col-md-3 col-sm-3  label-align">Salary<span
                                        class="required">*</span></label>
                                <div class="col-md-6 col-sm-6">
                                    <input class="form-control" type="number" class='tel' name="salary"
                                           required='required'
                                           data-validate-length-range="1,15" value="${employee.salary }"/></div>
                            </div>

                                <%--Telephone--%>
                            <div class="field item form-group">
                                <label class="col-form-label col-md-3 col-sm-3  label-align">Telephone<span
                                        class="required">*</span></label>
                                <div class="col-md-6 col-sm-6">
                                    <input class="form-control" type="number" name="mobileNumber"
                                           required='required'
                                           data-validate-length-range="1,10" value="${employee.mobileNumber }"/></div>
                            </div>

                                <%--Date--%>
                                <%--Registered Date--%>
                            <div class="field item form-group">
                                <label class="col-form-label col-md-3 col-sm-3  label-align">Date Of Birth<span
                                        class="required">*</span></label>
                                <div class="col-md-6 col-sm-6">
                                    <input class="form-control" class='date' type="date" name="dateOfBirth"
                                           required='required' value="${employee.dateOfBirth }"></div>
                            </div>


                            <div class="item form-group">
                                <label class="col-form-label col-md-3 col-sm-3 label-align">Gender</label>
                                <div class="col-md-6 col-sm-6 ">
                                    <div id="gender1" class="btn-group" data-toggle="buttons">
                                        <label class="btn btn-secondary" data-toggle-class="btn-primary"
                                               data-toggle-passive-class="btn-default">
                                            <input type="radio" name="gender" value="male" class="join-btn"
                                                   value="${employee.gender }">
                                            &nbsp; Male &nbsp;
                                        </label>
                                        <label class="btn btn-primary" data-toggle-class="btn-primary"
                                               data-toggle-passive-class="btn-default">
                                            <input type="radio" name="gender" value="female" class="join-btn"
                                                   value="${employee.gender }">
                                            Female
                                        </label>
                                    </div>
                                </div>
                            </div>

                                <%--Picture--%>
                            <div class="field item form-group">

                                <label class="col-form-label col-md-3 col-sm-3  label-align">
                                    <a class="" title="Insert picture (or just drag & drop)" id=""><i
                                            class="fa fa-picture-o"></i></a><span
                                        class="required"> *</span></label>
                                <div class="col-md-6 col-sm-6">
                                    <input type="file" value="${employee.pic }" name="pic" data-role="magic-overlay"
                                           data-target="#pictureBtn"
                                           data-edit="insertImage"/></div>
                            </div>
                                <%--Address--%>
                                <%--Registered Date--%>
                            <div class="field item form-group">
                                <label class="col-form-label col-md-3 col-sm-3  label-align">Address<span
                                        class="required">*</span></label>
                                <div class="col-md-6 col-sm-6">
                                    <input class="form-control" class='date' type="text" name="address"
                                           required='required' value="${employee.address }"></div>
                            </div>
                            <div class="ln_solid">
                                <div class="form-group">
                                    <div class="col-md-6 offset-md-3">
                                        <button type='submit' class="btn btn-primary" value="Register">Submit</button>
                                        <button type='reset' class="btn btn-success">Reset</button>
                                    </div>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>

    </c:when>
    <c:when test="${mode=='MODE_UPDATE' }">
        <!-- page content -->

        <div class="">
            <div class="">

                <div class="x_panel">
                    <div class="x_title">
                        <h2>Home >>
                            <small><a style="color: #007bff;cursor:hand"
                                      onMouseOver="this.style.color='red'; this.style.fontWeight='bold'"
                                      onMouseOut="this.style.color='#00F'; this.style.fontWeight='normal'"
                                      href="Dashboard">click here</a></small>
                        </h2>
                        <ul class="nav navbar-right panel_toolbox">
                            <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                            </li>
                            <li><a class="close-link"><i class="fa fa-close"></i></a>
                            </li>
                        </ul>
                        <div class="clearfix"></div>
                    </div>
                    <div class="x_content">
                        <form class="form-horizontal" method="POST" action="Dashboards">
                             <span class="section">Manage Employee
                            <span style="float: right">

                        <input type="checkbox" name="admin" value="${true }"><span style="font-size: 70%">isAdmin</span><BR>


                            </span>
                            </span>

                                <%--Name--%>
                            <div class="field item form-group">
                                <label class="col-form-label col-md-3 col-sm-3  label-align">Name<span
                                        class="required">*</span></label>
                                <div class="col-md-6 col-sm-6">
                                    <input class="form-control" data-validate-length-range="6"
                                           data-validate-words="2" name="name"
                                           placeholder="ex. John f. Kennedy" required="required"
                                           value="${employee.name }"/>
                                </div>
                            </div>

                                <%--NIC No--%>
                            <div class="field item form-group">
                                <label class="col-form-label col-md-3 col-sm-3  label-align">NIC No<span
                                        class="required">*</span></label>
                                <div class="col-md-6 col-sm-6">
                                    <input class="form-control" class='optional' name="idNo"
                                           data-validate-words="1"required="required"
                                           value="${employee.idNo }"/></div>
                            </div>

                                <%--<input type="hidden" name="id" value="${employee.id }" />--%>
                                <%--Email--%>
                            <div class="field item form-group">
                                <label class="col-form-label col-md-3 col-sm-3  label-align">email<span
                                        class="required">*</span></label>
                                <div class="col-md-6 col-sm-6">
                                    <input class="form-control" name="email" class='email' required="required"
                                           type="email"/></div>
                            </div>
                            <div class="field item form-group">
                                <label class="col-form-label col-md-3 col-sm-3  label-align">Confirm email
                                    address<span
                                            class="required">*</span></label>
                                <div class="col-md-6 col-sm-6">
                                    <input class="form-control" type="email" class='email' name="confirm_email"
                                           data-validate-linked='email' required='required' value="${employee.email }"/>
                                </div>
                            </div>

                                <%--Occupation--%>
                            <div class="field item form-group">
                                <label class="col-form-label col-md-3 col-sm-3  label-align">Occupation<span
                                        class="required">*</span></label>
                                <div class="col-md-6 col-sm-6">
                                    <input class="form-control" class='optional' name="occupation"
                                           type="text" value="${employee.occupation}"/></div>
                            </div>

                                <%--Registered Date--%>
                            <div class="field item form-group">
                                <label class="col-form-label col-md-3 col-sm-3  label-align">Registered
                                    Date<span
                                            class="required">*</span></label>
                                <div class="col-md-6 col-sm-6">
                                    <input class="form-control" class='date' type="date" name="date"
                                           required='required' value="${employee.date }"></div>
                            </div>


                                <%--Password--%>
                            <div class="field item form-group">
                                <label class="col-form-label col-md-3 col-sm-3  label-align">Password<span
                                        class="required">*</span></label>
                                <div class="col-md-6 col-sm-6">
                                    <input class="form-control" type="password" name="password"
                                           data-validate-length="6,8"
                                           required='required' value="${employee.password }"/></div>
                            </div>

                                <%--Salary--%>
                            <div class="field item form-group">
                                <label class="col-form-label col-md-3 col-sm-3  label-align">Salary<span
                                        class="required">*</span></label>
                                <div class="col-md-6 col-sm-6">
                                    <input class="form-control" type="number" class='tel' name="salary"
                                           required='required'
                                           data-validate-length-range="1,15" value="${employee.salary }"/></div>
                            </div>

                                <%--Telephone--%>
                            <div class="field item form-group">
                                <label class="col-form-label col-md-3 col-sm-3  label-align">Telephone<span
                                        class="required">*</span></label>
                                <div class="col-md-6 col-sm-6">
                                    <input class="form-control" type="number" name="mobileNumber"
                                           required='required'
                                           data-validate-length-range="1,10" value="${employee.mobileNumber }"/></div>
                            </div>

                                <%--Date--%>
                                <%--Registered Date--%>
                            <div class="field item form-group">
                                <label class="col-form-label col-md-3 col-sm-3  label-align">Date Of Birth<span
                                        class="required">*</span></label>
                                <div class="col-md-6 col-sm-6">
                                    <input class="form-control" class='date' type="date" name="dateOfBirth"
                                           required='required' value="${employee.dateOfBirth }"></div>
                            </div>


                            <div class="item form-group">
                                <label class="col-form-label col-md-3 col-sm-3 label-align">Gender</label>
                                <div class="col-md-6 col-sm-6 ">
                                    <div id="gend" class="btn-group" data-toggle="buttons">
                                        <label class="btn btn-secondary" data-toggle-class="btn-primary"
                                               data-toggle-passive-class="btn-default">
                                            <input type="radio" name="gender" value="male" class="join-btn"
                                                   value="${employee.gender }">
                                            &nbsp; Male &nbsp;
                                        </label>
                                        <label class="btn btn-primary" data-toggle-class="btn-primary"
                                               data-toggle-passive-class="btn-default">
                                            <input type="radio" name="gender" value="female" class="join-btn"
                                                   value="${employee.gender }">
                                            Female
                                        </label>
                                    </div>
                                </div>
                            </div>

                                <%--Picture--%>
                            <div class="field item form-group">

                                <label class="col-form-label col-md-3 col-sm-3  label-align">
                                    <a class="" title="Insert picture (or just drag & drop)" ><i
                                            class="fa fa-picture-o"></i></a><span
                                        class="required"> *</span></label>
                                <div class="col-md-6 col-sm-6">
                                    <input type="file" value="${employee.pic }" name="pic" data-role="magic-overlay"
                                           data-target="#pictureBtn"
                                           data-edit="insertImage"/></div>
                            </div>
                                <%--Address--%>
                                <%--Registered Date--%>
                            <div class="field item form-group">
                                <label class="col-form-label col-md-3 col-sm-3  label-align">Address<span
                                        class="required">*</span></label>
                                <div class="col-md-6 col-sm-6">
                                    <input class="form-control" class='date' type="text" name="address"
                                           required='required' value="${employee.address }"></div>
                            </div>
                            <div class="ln_solid">
                                <div class="form-group">
                                    <div class="col-md-6 offset-md-3">
                                        <button type='submit' class="btn btn-primary" value="Register">Submit</button>
                                        <button type='reset' class="btn btn-success">Reset</button>
                                    </div>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>

    </c:when>
</c:choose>

<%--<!-- footer content -->--%>


<div class="pull-right" style="color: white">
    Copyright © Employee Management 2020. Created by Rivindu Wijayarathna &nbsp; &nbsp;    &nbsp;    &nbsp;
</div>
<div class="clearfix"></div>

<!-- /footer content -->
</div>
</div>


<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<script src="../../vendors/validator/multifield.js"></script>
<script src="../../vendors/validator/validator.js"></script>

<script>
    // initialize a validator instance from the "FormValidator" constructor.
    // A "<form>" element is optionally passed as an argument, but is not a must
    var validator = new FormValidator({"events": ['blur', 'input', 'change']}, document.forms[0]);
    // on form "submit" event
    document.forms[0].onsubmit = function (e) {
        var submit = true,
            validatorResult = validator.checkAll(this);
        console.log(validatorResult);
        return !!validatorResult.valid;
    };
    // on form "reset" event
    document.forms[0].onreset = function (e) {
        validator.reset();
    };
    // stuff related ONLY for this demo page:
    $('.toggleValidationTooltips').change(function () {
        validator.settings.alerts = !this.checked;
        if (this.checked)
            $('form .alert').remove();
    }).prop('checked', false);
</script>

<!-- jQuery -->
<script src="../../vendors/jquery/dist/jquery.min.js"></script>
<!-- Bootstrap -->
<script src="../../vendors/bootstrap/dist/js/bootstrap.bundle.min.js"></script>
<!-- FastClick -->
<script src="../../vendors/fastclick/lib/fastclick.js"></script>
<!-- NProgress -->
<script src="../../vendors/nprogress/nprogress.js"></script>
<!-- validator -->
<script src="../../vendors/validator/validator.js"></script>

<!-- Custom Theme Scripts -->
<script src="../../build/js/custom.min.js"></script>

</body>

</html>