<%@ page contentType="text/html;charset=UTF-8"
	trimDirectiveWhitespaces="true" language="java"%>
<%@page import="com.pojo.User_table"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<head>
	<meta http-equiv="Content-type" content="text/html; charset=utf-8">
	<title>Highlighting weekends</title>

<script>
	(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
	(i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
	m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
	})(window,document,'script','//www.google-analytics.com/analytics.js','ga');

	ga('create', 'UA-11031269-1', 'auto');
	ga('send', 'pageview');
</script>
<script src="https://cdn.ravenjs.com/3.10.0/raven.min.js"></script>
<script>Raven.config('https://25a6d5e8c35148d195a1967d8374ffca@sentry.dhtmlx.ru/6').install()</script></head>
	<script src="../js/dhtmlxgantt.js" type="text/javascript" charset="utf-8"></script>
	<link rel="stylesheet" href="../js/dhtmlxgantt.css" type="text/css" media="screen" title="no title" charset="utf-8">

	<script type="text/javascript" src="../js/testdata.js"></script>
<style>
	html, body{
		width: 100%;
		height: 100%;
		margin: 0;
	}
	.weekend{
		background: #f4f7f4;
	}
	.gantt_selected .weekend{
		background: #f7eb91;
	}
</style>
<body>
	<div id="gantt_here" style='width:100%; height:100%'></div>
	<script type="text/javascript">
        gantt.templates.scale_cell_class = function(date){
            if(date.getDay()==0||date.getDay()==6){
                return "weekend";
            }
        };
        gantt.templates.task_cell_class = function(item,date){
            if(date.getDay()==0||date.getDay()==6){
                return "weekend"
            }
        };
		gantt.init("gantt_here");

		gantt.parse(demo_tasks);
	</script>
</body>