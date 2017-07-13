<%@ page contentType="text/html;charset=UTF-8"
	trimDirectiveWhitespaces="true" language="java"%>
<%@page import="com.pojo.User_table"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
	<script type="text/javascript" src="../js/jquery-2.1.4.js"></script>
<script type="text/javascript">



	function ajax() {
		var span = $("#spans");
		var uname = $("#uname").val();
		alert(uname);
	 	$.ajax({
			url:"ajax",
			data:{
				"uname":uname
			},
			success:function(result){
				alert("出来了=。="+JSON.stringify(result));
				span.html(JSON.stringify(result));
			},
			error: function(XMLHttpRequest, textStatus, errorThrown) {
				 alert(XMLHttpRequest.status);
				 alert(XMLHttpRequest.readyState);
				 alert(textStatus);
				   }

			});
		}

	

</script>
</head>
<body>
<input type="text" id="uname" name="uname">
<a href="javascript:void(0);" onclick="ajax()">点我测试ajax</a>
<span id="spans" >222</span>
	<h1>测试项目1</h1>
	<table width="60%" align="center" border="1">
		<tr>
			<td colspan="5" align="center">商品列表</td>
		</tr>
		<tr>
			<td>姓名</td>
			<td>年龄</td>
			<td>性别</td>
		</tr>
		<c:forEach items="${user }" var="gm">
			<tr>
				<td>${gm.name }</td>
				<td>${gm.age }</td>
				<td>${gm.sex }</td>

			</tr>
		</c:forEach>
	</table>
</body>
</html>