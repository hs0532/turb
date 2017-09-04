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
				var maxWidth = 500; // 图片最大宽度
			    var maxHeight = 500;    // 图片最大高度
			    var ratio = 0;  // 缩放比例
				var ul = document.getElementById("parentUl");
				for ( var a in result) {

					var li = document.createElement("li");
					var imgID =  result[a].name;
					var img = document.createElement("img");
					img.setAttribute("id", result[a].name);
					img.src = "ftp://127.0.0.1" + result[a].url;
					

					li.appendChild(img);
					ul.appendChild(li);
					
					
				    
				     var width = $("#"+imgID).width();    // 图片实际宽度
				     var height = $("#"+imgID).height();  // 图片实际高度
				   
				     // 检查图片是否超宽
				     if(width > maxWidth){
				         ratio = maxWidth / width;   // 计算缩放比例
				         $("#"+imgID).css("width", maxWidth); // 设定实际显示宽度
				         height = height * ratio;    // 计算等比例缩放后的高度 
				         $("#"+imgID).css("height", height);  // 设定等比例缩放后的高度
				     }
				   
				     // 检查图片是否超高
				     if(height > maxHeight){
				         ratio = maxHeight / height; // 计算缩放比例
				         $("#"+imgID).css("height", maxHeight);   // 设定实际显示高度
				         width = width * ratio;    // 计算等比例缩放后的高度
				         $("#"+imgID).css("width", width * ratio);    // 设定等比例缩放后的高度
				     }

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