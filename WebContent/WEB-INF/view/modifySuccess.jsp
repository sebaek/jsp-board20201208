<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="u" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<script src="https://kit.fontawesome.com/a076d05399.js"></script>
<title>Insert title here</title>
</head>
<body>
  <u:navbar />

  <div class="container">
    <div class="row">
      <div class="col-3"></div>
      <div class="col-6">
        <div class="alert alert-success" role="alert">
          <h4 class="alert-heading">게시글을 수정하였습니다.</h4>
          <p>
            <a class="alert-link" href="${root }/article/read.do?no=${modReq.articleNumber}">[게시글내용보기]</a>
          </p>
        </div>
      </div>
    </div>

  </div>
</body>
</html>




