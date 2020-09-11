<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン結果</title>
</head>
<body>
<c:choose>
<c:when test="${ user == null }">
	<h1>ログインに失敗しました</h1>
	<a href="/docoTsubu_13/">TOPへ</a>
</c:when>
<c:otherwise>
	<h1>ログインに成功しました</h1>
	<p>ようこそ<c:out value="${ user.name }"></c:out>さん</p>
	<a href="/docoTsubu_13/Main">つぶやき投稿・閲覧へ</a>
</c:otherwise>
</c:choose>
</body>
</html>