<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   
   <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <%
    request.setCharacterEncoding("utf-8");
    response.setCharacterEncoding("utf-8");
	request.getAttribute("name");
    %>
<!-- <script  src="http://code.jquery.com/jquery-latest.min.js">
로그인시 메인 화면 상단에 나올 jsp
</script> -->

<style>
div{
text-align: right;
}
</style>
<script >
function logout(){
	document.btnlogout.action = "/LogOut.do";
}
</script>
</head>
<body>
<div>
 ${name}님이 로그인중입니다.
환영 합니다.
<button type="button" id="button" name="btnlogout"  onclick="location.href='UserLogout.do' ">로그아웃</button>
</div>

<hr>
</body>
</html>