<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<div class="container">
  <h1>회원가입</h1>
  <form action="join.do" method="post">
    <p>
      아이디 : <br />
      <input type="text" name="id" value="${param.id }" />
    </p>
    <p>
      이름 : <br />
      <input type="text" name="name" value="${param.name }" />
    </p>
    <p>
      암호 : <br />
      <input type="password" name="password" />
    </p>
    <p>
      확인 : <br />
      <input type="password" name="confirmPassword" />
    </p>
    <input type="submit" value="가입" />
  </form>
</div>
</body>
</html>



