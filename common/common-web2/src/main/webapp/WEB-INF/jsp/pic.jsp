<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="../js/jquery-1.8.0.min.js"></script>
<script type="text/javascript">
	$(function() {
		$.ajax({
			url : "allImage",
			success : function(result) {
				var ul = document.getElementById("parentUl");
				for ( var a in result) {

					var li = document.createElement("li");

					var img = document.createElement("img");
					img.setAttribute("id", result[a].name);
					img.src = "ftp://127.0.0.1" + result[a].url;

					li.appendChild(img);
					ul.appendChild(li);

				}

			}

		});
	});
</script>
</head>
<body>
	<ul id="parentUl"></ul>

</body>
</html>