<%@ page contentType="text/html;charset=UTF-8"
	trimDirectiveWhitespaces="true" language="java"%>
<%@page import="com.pojo.User_table"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Sign up|Blog</title>

<script type="text/javascript" src="../js/jquery-1.8.0.min.js"></script>
<script src="../js/jquery.easyui.min.js"></script>
<script type="text/javascript" src="../js/easyui-lang-zh_CN.js"></script>
<link rel="stylesheet"
	href="../js/jquery-easyui/themes/default/easyui.css" type="text/css"></link>
<link rel="stylesheet" href="../js/jquery-easyui/themes/icon.css"
	type="text/css"></link>


<style type="text/css">
body {
	font: normal 14px/1.4 "Helvetica Neue", "HelveticaNeue", Helvetica,
		Arial, sans-serif;
}

div {
	display: block;
}

a {
	text-decoration: none;
	opacity: 1;
	color: #fff;
}

input, button {
	outline: none;
}

::-moz-focus-inner {
	border: 0px;
} /*å»é¤æé®ç¹å»æ¶åºç°çèçº¿è¾¹æ¡*/
.login_bg {
	position: fixed;
	top: 0;
	right: 0;
	bottom: 0;
	left: 0;
	background-size: cover;
}

.login_header {
	position: absolute;
	top: 0;
	left: 0;
	right: 0;
}

.container {
	position: relative;
	top: 50%;
	margin: 0 auto;
	width: 260px;
}

#logo {
	display: block;
	text-align: center;
	font-weight: bold;
	font-size: 50px;
	color: white;
	height: 100%;
}

#subheading {
	position: relative;
	width: 517px;
	left: 50%;
	margin: 10px 0 16px -258px;
	font-size: 15px;
	font-weight: normal;
	color: #fff;
	text-align: center;
}

.signup_forms {
	width: 260px;
}

.signup_forms_container {
	overflow: hidden;
	background: #fff;
	border-radius: 3px;
}

.form_user, .form_password, form_username {
	width: 260px;
	height: 45px;
	margin: 0px;
	padding: 0px;
	border: 0px;
}

.form_password, .form_username, .form_confirm_password {
	border-top: 1px solid #e3e3e3;
}

.signup_forms input {
	padding: 11px 10px 11px 13px;
	width: 100%;
	margin: 0px;
	background: 0;
	font: 16px/1.4 "Helvetica Neue", "HelveticaNeue", Helvetica, Arial,
		sans-serif;
	border: 0px;
}

#signup_forms_submit {
	margin-top: 8px;
	width: 260px;
	height: 45px;
	background: #529ECC;
	border: 0px;
	border-radius: 3px;
	cursor: pointer;
	<!--
	CSSå±æ§è®¾ç½®é¼ æ ä¸ºæå--
	>
}

#signup_forms_submit span {
	color: #fff;
	font: "Helvetica Neue", Arial, Helvetica, sans-serif;
	font-size: 16px;
}

.footer {
	position: fixed;
	top: auto;
	right: 0;
	bottom: 0;
	left: 0;
}

.footer_signup_link {
	position: absolute;
	width: 141px;
	height: 78px;
	bottom: 0;
	padding: 0 20px;
	margin: 0 0 13px 0;
	line-height: 25px;
	text-align: center;
	opacity: 1;
	color: #fff;
}

.signup_link {
	display: block;
	height: 45px;
	padding: 0 10px;
	margin: 0 0 8px 0;
	font-size: 16px;
	font-weight: bold;
	line-height: 45px;
	border: 0;
	border-radius: 2px;
	color: #fff;
	background: rgba(255, 255, 255, 0.33);
}

.link {
	font-size: 14px;
	padding-right: 5px;
	margin-right: 12px;
	color: #fff;
}

.design_show {
	position: fixed;
	bottom: 0;
	right: 0;
	padding: 0 12px;
	margin: 0 0 13px 0;
	line-height: 25px;
}

.designer_info {
	position: relative;
	color: #FFFFFF;
}

#face {
	margin: 0 0 0 10px;
	border-radius: 20px;
	padding: 0;
	vertical-align: middle;
	height: 24px;
	width: 24px;
}

.bclom {
	display: none;
	vertical-align: middle;
	width: 14px;
	height: 14px;
	background-position: 0 -288px;
	background-image: url(../images/glb_v2.png);
}

.bclom2 {
	display: none;
	color: red;
	font-family: "黑体";
	font-size: small;
	text-align: center;
	font: 13px/1.4 "Helvetica Neue", "HelveticaNeue", Helvetica, Arial, sans-serif
}

.divline {
	float: right;
}
</style>
<script type="text/javascript">
	$(function() {
		var nameflag=true;
		var pflag=true;
		$('#signup_confirm_password').blur(function() {
			if($("#password").val()!=$("#signup_confirm_password").val()){
				$.messager.alert('Waring!','两次密码不一致');
				$("#signup_confirm_password").val("");
				pflag=false;
			}else{
				pflag=true;
			}
		});
		
		$('#username').blur(function() {
			var username = $("#username").val();

			$.ajax({
				url : "checkUsername/" + escape(username),
				type : "post",

				success : function(data) {
					//alert(data);
					if ("success" == data) {
						//alert("用户名可用");
						$("#b1").css("display", "block");
						$("#b2").css("display", "none");
						nameflag=true;
					} else {
						//alert("已被使用");
						$("#b2").css("display", "block");
						$("#b1").css("display", "none");
						nameflag=false;
					}
				}

			});

		});

		$("button")
				.click(
						function() {
							if ($("#email").val() == ""
									|| $("#password").val() == ""
									|| $("#signup_confirm_password").val() == ""
									|| $("#username").val() == "") {
								$.messager
										.alert('Waring!',
												'email password and username mustn\'t be empty!');

							} else {
								if (nameflag==false||pflag==false) {
									$.messager.alert('Waring',
											'Your password is not same!');
									
								} else {

									$.post("userRegister", $("#sign_form")
											.serialize(),

									function(result) {
										$.messager
												.alert(JSON.stringify(result));
										window.location.href = 'login';

									}

									);
								}
							}

						});
	});
</script>
</head>
<body>
	<div id="login_bg" class="login_bg"
		style="background-image: url(../images/blog_bg.jpg);"></div>
	<div class="login_header">
		<span></span>
	</div>

	<div class="container">
		<div class="form_header">
			<h1 id="logo">Blog.</h1>
			<h2 id="subheading">To follow me,just sign up</h2>
		</div>
		<div class="signup_forms" class="signup_forms">
			<div id="signup_forms_container" class="signup_forms_container">
				<form class="signup_form_form" id="sign_form" method="post"
					action="userRegister">
					<div class="signup_account" id="signup_account">
						<div class="form_user">
							<input type="text" name="email" placeholder="Email" id="email">
						</div>
						<div class="form_username">
							<span style="display: inline-block"><input type="text"
								name="username" placeholder="Username" id="username"></span> <span
								style="display: inline-block"> <b class="bclom" id="b1"></b>
								<b class="bclom2" id="b2"><strong>&nbsp&nbsp User already exists</strong> </b>
							</span>


						</div>

						<div class="form_password">
							<input type="password" name="password" placeholder="Password"
								id="password">
						</div>
						<div class="form_confirm_password">
							<input type="password" placeholder="Confirm the password"
								id="signup_confirm_password">
						</div>
					</div>
			</div>
			<button type="button" id="signup_forms_submit">
				<span style="font-size: 16px;"><strong>Sign up</strong></span>
			</button>
		</div>
		</form>

	</div>

	<div class="footer">
		<div class="footer_signup_link">
			<a class="signup_link" href="login">Log in</a> <a
				href="https://www.baidu.com" target="_blank" class="link unnamed_1">Contact</a>
			<a href="#" target="_blank" class="link unnamed_2">About</a>
		</div>
		<div class="design_show">
			<div class="designer_info">
				<a href="#">Designed by Class 2 Software 11 <strong>Ray</strong></a>
				<a href="#" target="_blank" class="face"><img id="face"
					src="../images/face.jpg" alt="designed by RayZhang" /></a>
			</div>
		</div>
	</div>
</body>
</html>
