<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->
<!-- BEGIN HEAD -->
<head>
<meta charset="utf-8"/>
<title>TLA-Teaching Load Assignment System</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta content="width=device-width, initial-scale=1.0" name="viewport"/>
<meta http-equiv="Content-type" content="text/html; charset=utf-8">
<meta content="UIC Teaching Load Assignment System" name="description"/>
<meta content="Crystal" name="author"/>
<!-- BEGIN GLOBAL MANDATORY STYLES -->
<link href="assets/fonts/css.css" rel="stylesheet" type="text/css"/>
<link href="assets/global/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
<link href="assets/global/plugins/simple-line-icons/simple-line-icons.min.css" rel="stylesheet" type="text/css"/>
<link href="assets/global/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
<link href="assets/global/plugins/uniform/css/uniform.default.css" rel="stylesheet" type="text/css"/>
<link href="assets/global/plugins/bootstrap-switch/css/bootstrap-switch.min.css" rel="stylesheet" type="text/css"/>
<!-- END GLOBAL MANDATORY STYLES -->
<!-- BEGIN PAGE LEVEL STYLES -->
<!-- END PAGE LEVEL STYLES -->
<!-- BEGIN THEME STYLES -->
<link href="assets/global/css/components.css" id="style_components" rel="stylesheet" type="text/css"/>
<link href="assets/global/css/plugins.css" rel="stylesheet" type="text/css"/>
<link href="assets/admin/layout/css/layout.css" rel="stylesheet" type="text/css"/>
<link id="style_color" href="assets/admin/layout/css/themes/darkblue.css" rel="stylesheet" type="text/css"/>
<link href="assets/admin/layout/css/custom.css" rel="stylesheet" type="text/css"/>
<!-- END THEME STYLES -->
<!-- Favicons-->
<link rel="shortcut icon" href="img/favicon.ico" type="image/x-icon"/>
<link rel="apple-touch-icon" type="image/x-icon" href="img/apple-touch-icon-57x57-precomposed.png">
<link rel="apple-touch-icon" type="image/x-icon" sizes="72x72" href="img/apple-touch-icon-72x72-precomposed.png">
<link rel="apple-touch-icon" type="image/x-icon" sizes="128x128" href="img/apple-touch-icon-128x128-precomposed.png">
<link rel="apple-touch-icon" type="image/x-icon" sizes="144x144" href="img/apple-touch-icon-144x144-precomposed.png">
</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<!-- DOC: Apply "page-header-fixed-mobile" and "page-footer-fixed-mobile" class to body element to force fixed header or footer in mobile devices -->
<!-- DOC: Apply "page-sidebar-closed" class to the body and "page-sidebar-menu-closed" class to the sidebar menu element to hide the sidebar by default -->
<!-- DOC: Apply "page-sidebar-hide" class to the body to make the sidebar completely hidden on toggle -->
<!-- DOC: Apply "page-sidebar-closed-hide-logo" class to the body element to make the logo hidden on sidebar toggle -->
<!-- DOC: Apply "page-sidebar-hide" class to body element to completely hide the sidebar on sidebar toggle -->
<!-- DOC: Apply "page-sidebar-fixed" class to have fixed sidebar -->
<!-- DOC: Apply "page-footer-fixed" class to the body element to have fixed footer -->
<!-- DOC: Apply "page-sidebar-reversed" class to put the sidebar on the right side -->
<!-- DOC: Apply "page-full-width" class to the body element to have full width page without the sidebar menu -->
<body class="page-header-fixed page-quick-sidebar-over-content">
<!-- BEGIN HEADER -->
<div class="page-header navbar navbar-fixed-top">
	<!-- BEGIN HEADER INNER -->
	<div class="page-header-inner">
		<!-- BEGIN LOGO -->
		<div class="page-logo">
			<a href="${pageContext.request.contextPath }/goMainUi.do">
			<img src="img/TLA.png" alt="logo" class="logo-default"/>
			</a>
			<div class="menu-toggler sidebar-toggler hide">
				<!-- DOC: Remove the above "hide" to enable the sidebar toggler button on header -->
			</div>
		</div>
		<!-- END LOGO -->
		<!-- BEGIN RESPONSIVE MENU TOGGLER -->
		<a href="javascript:;" class="menu-toggler responsive-toggler" data-toggle="collapse" data-target=".navbar-collapse">
		</a>
		<!-- END RESPONSIVE MENU TOGGLER -->
		<!-- BEGIN TOP NAVIGATION MENU -->
		<div class="top-menu">
			<ul class="nav navbar-nav pull-right">
				<!-- BEGIN USER LOGIN DROPDOWN -->
				<!-- DOC: Apply "dropdown-dark" class after below "dropdown-extended" to change the dropdown styte -->
				<li class="dropdown dropdown-user">
					<a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true">
					<span class="username username-hide-on-mobile">
					${secretaryinfo.name } </span>
					<i class="fa fa-angle-down"></i>
					</a>
					<ul class="dropdown-menu dropdown-menu-default">
						<li>
							<a data-toggle="modal" href="#logout">
							<i class="icon-key"></i> Log Out </a>
						</li>
					</ul>
				</li>
				<!-- END USER LOGIN DROPDOWN -->
			</ul>
		</div>
		<!-- END TOP NAVIGATION MENU -->
	</div>
	<!-- END HEADER INNER -->
</div>
<div class="modal fade" id="logout" tabindex="-1" role="basic" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
					<h4 class="modal-title">Logout</h4>
				</div>
				<div class="modal-body">Are you sure?</div>
				<div class="modal-footer">
					<button type="button" class="btn default" data-dismiss="modal">Cancel</button>
					<a href="${pageContext.request.contextPath }/logout.do" class="btn red">Logout</a>
				</div>
			</div>
			<!-- /.modal-content -->
	</div>
	<!-- /.modal-dialog -->
</div>
<!-- /.modal -->
<!-- END HEADER -->
<div class="clearfix">
</div>
<!-- BEGIN CONTAINER -->
<div class="page-container">
	<!-- BEGIN SIDEBAR -->
	<div class="page-sidebar-wrapper">
		<!-- DOC: Set data-auto-scroll="false" to disable the sidebar from auto scrolling/focusing -->
		<!-- DOC: Change data-auto-speed="200" to adjust the sub menu slide up/down speed -->
		<div class="page-sidebar navbar-collapse collapse">
			<!-- BEGIN SIDEBAR MENU -->
			<!-- DOC: Apply "page-sidebar-menu-light" class right after "page-sidebar-menu" to enable light sidebar menu style(without borders) -->
			<!-- DOC: Apply "page-sidebar-menu-hover-submenu" class right after "page-sidebar-menu" to enable hoverable(hover vs accordion) sub menu mode -->
			<!-- DOC: Apply "page-sidebar-menu-closed" class right after "page-sidebar-menu" to collapse("page-sidebar-closed" class must be applied to the body element) the sidebar sub menu mode -->
			<!-- DOC: Set data-auto-scroll="false" to disable the sidebar from auto scrolling/focusing -->
			<!-- DOC: Set data-keep-expand="true" to keep the submenues expanded -->
			<!-- DOC: Set data-auto-speed="200" to adjust the sub menu slide up/down speed -->
			<ul class="page-sidebar-menu" data-keep-expanded="false" data-auto-scroll="true" data-slide-speed="200">
				<!-- DOC: To remove the sidebar toggler from the sidebar you just need to completely remove the below "sidebar-toggler-wrapper" LI element -->
				<li class="sidebar-toggler-wrapper">
					<!-- BEGIN SIDEBAR TOGGLER BUTTON -->
					<div class="sidebar-toggler">
					</div>
					<!-- END SIDEBAR TOGGLER BUTTON -->
				</li>
				
				<li class="start">
					<a href="${pageContext.request.contextPath }/goMainUi.do">
					<i class="icon-home"></i>
					<span class="title">Home</span>
					</a>
				</li>
				<li>
					<a href="javascript:;">
					<i class="icon-users"></i>
					<span class="title">Manage Account</span>
					<span class="arrow "></span>
					</a>
					<ul class="sub-menu">
						<li>
							<a href="${pageContext.request.contextPath }/manageAccount.do?flag=teacherUi">
							Teacher</a>
						</li>
						<li>
							<a href="${pageContext.request.contextPath }/manageAccount.do?flag=taUi">
							Teaching Assistant</a>
						</li>
					</ul>
				</li>
				<li>
					<a href="">
					<i class="icon-note"></i>
					<span class="title">Assign TA</span>
					</a>
				</li>

				<li class="active open">
					<a href="${pageContext.request.contextPath }/changePwd.do?flag=goPwdUi">
					<i class="icon-settings"></i>
					<span class="title">Profile</span>
					<span class="selected"></span>
					</a>
				</li>
			</ul>
			<!-- END SIDEBAR MENU -->
		</div>
	</div>
	<!-- END SIDEBAR -->
	<!-- BEGIN CONTENT -->
	<div class="page-content-wrapper">
		<div class="page-content">
			<!-- BEGIN PAGE HEADER-->
			<div class="page-bar">
				<ul class="page-breadcrumb">
					<li>
						<i class="fa fa-home"></i>
						<a href="${pageContext.request.contextPath }/goMainUi.do">Home</a>
						<i class="fa fa-angle-right"></i>
					</li>
					<li>
						<a href="${pageContext.request.contextPath }/changePwd.do?flag=goPwdUi">Profile</a>
					</li>
				</ul>
			</div>
			
			<!-- BEGIN CHANGE PASSWORD CONTENT -->
					
						<div class="row">
							<div class="col-md-12">
								<div class="portlet light">
									<div class="portlet-title tabbable-line">
										<div class="caption caption-md">
											<i class="icon-globe theme-font hide"></i>
											<span class="caption-subject font-blue-madison bold uppercase">Profile Account</span>
										</div>
										<ul class="nav nav-tabs">
											<li class="active">
												<a href="#changePwd" data-toggle="tab">Change Password</a>
											</li>
										</ul>
									</div>
									<div class="portlet-body form">
										<div class="tab-content">
											<!-- CHANGE PASSWORD TAB -->
											<div class="tab-pane active" id="changePwd">
												<form action="${pageContext.request.contextPath }/changePwd.do?flag=changePwd" method="post" id="ChangPwdForm" class="form-horizontal">
												
												<c:if test="${PwdError!=null }">
													<div class="alert alert-danger">
														<button class="close" data-close="alert"></button>
														The operation failed. ${PwdError }
													</div>
												</c:if>
												
													<div class="alert alert-danger display-hide">
														<button class="close" data-close="alert"></button>
														You have some form errors. Please check below.
													</div>
													<div class="alert alert-success display-hide">
														<button class="close" data-close="alert"></button>
														Your form validation is successful!
													</div>

													<div class="form-group">
														<label class="control-label col-md-3">Current Password <span class="required">* </span></label>
														<div class="col-md-3">
															<div class="input-icon right">
																<i class="fa"></i>
																<input type="password" class="form-control" name="oldPwd"/>
															</div>
														</div>														
													</div>
													
													<div class="form-group">
														<label class="control-label col-md-3">New Password <span class="required">* </span></label>
														<div class="col-md-3">
															<div class="input-icon right">
																<i class="fa"></i>
																<input type="password" class="form-control" name="newPwd" id="newPwd"/>
															</div>
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3">Re-type New Password <span class="required">* </span></label>
														<div class="col-md-3">
															<div class="input-icon right">
																<i class="fa"></i>
																<input type="password" class="form-control" name="confirmPwd"/>
															</div>
														</div>
													</div>
													<div class="form-actions">
														<div class="row">
															<div class="col-md-offset-3 col-md-9">
																<button type="submit" class="btn green-haze">Change Password</button>
																<button type="reset" class="btn default">Cancel</button>
															</div>
														</div>
													</div>								
												</form>
											</div>
											<!-- END CHANGE PASSWORD TAB -->
										</div>
									</div>
								</div>
							</div>
						</div>
					
					<!-- END CHANGE PASSWORD CONTENT -->
			
			
			<!-- END PAGE CONTENT-->
		</div>
	</div>
	<!-- END CONTENT -->
</div>
<!-- END CONTAINER -->
<!-- BEGIN FOOTER -->
<div class="page-footer">
	<div class="page-footer-inner">
		 2015 &copy; Angry APE. TLA. UIC.
	</div>
	<div class="scroll-to-top">
		<i class="icon-arrow-up"></i>
	</div>
</div>
<!-- END FOOTER -->
<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->
<!-- BEGIN CORE PLUGINS -->
<!--[if lt IE 9]>
<script src="../../assets/global/plugins/respond.min.js"></script>
<script src="../../assets/global/plugins/excanvas.min.js"></script> 
<![endif]-->
<script src="assets/global/plugins/jquery.min.js" type="text/javascript"></script>
<script src="assets/global/plugins/jquery-migrate.min.js" type="text/javascript"></script>
<!-- IMPORTANT! Load jquery-ui.min.js before bootstrap.min.js to fix bootstrap tooltip conflict with jquery ui tooltip -->
<script src="assets/global/plugins/jquery-ui/jquery-ui.min.js" type="text/javascript"></script>
<script src="assets/global/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script src="assets/global/plugins/bootstrap-hover-dropdown/bootstrap-hover-dropdown.min.js" type="text/javascript"></script>
<script src="assets/global/plugins/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
<script src="assets/global/plugins/jquery.blockui.min.js" type="text/javascript"></script>
<script src="assets/global/plugins/jquery.cokie.min.js" type="text/javascript"></script>
<script src="assets/global/plugins/uniform/jquery.uniform.min.js" type="text/javascript"></script>
<script src="assets/global/plugins/bootstrap-switch/js/bootstrap-switch.min.js" type="text/javascript"></script>
<!-- END CORE PLUGINS -->
<!-- BEGIN PAGE LEVEL PLUGINS -->
<script type="text/javascript" src="assets/global/plugins/jquery-validation/js/jquery.validate.min.js"></script>
<!-- END PAGE LEVEL PLUGINS -->
<!-- BEGIN PAGE LEVEL STYLES -->
<script src="assets/global/scripts/metronic.js" type="text/javascript"></script>
<script src="assets/admin/layout/scripts/layout.js" type="text/javascript"></script>
<!-- <script src="assets/admin/layout/scripts/quick-sidebar.js" type="text/javascript"></script> -->
<script src="assets/admin/layout/scripts/demo.js" type="text/javascript"></script>
<script src="assets/admin/pages/scripts/form-validation.js"></script>
<!-- END PAGE LEVEL STYLES -->
<script>
      jQuery(document).ready(function() {    
        Metronic.init(); // init metronic core components
		Layout.init(); // init current layout
		//QuickSidebar.init(); // init quick sidebar
		Demo.init(); // init demo features
		FormValidation.init();
      });
   </script>
<!-- END JAVASCRIPTS -->
</body>

<!-- END BODY -->
</html>