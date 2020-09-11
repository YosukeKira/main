<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>メイン画面</title>
</head>
<body>
<h1>メイン画面</h1>
<p>ようこそ<c:out value="${ user.name } " />さん</p>
<p><a href="/docoTsubu_13/Logout">ログアウト</a></p>
<p><a href="/docoTsubu_13/Main">更新</a></p>
<hr />
<br />
<form action="/docoTsubu_13/Main" method="post">
<input type="text" name="mutter" size="30" />
<input type="submit" value="つぶやく" />
</form>
<br />
<c:if test="${ not empty error }">
	<p>${error}</p>
</c:if>
<c:forEach var="mutter" items="${ mutterList }">
	<p><c:out value="${mutter.userName }" />：
		<c:out value="${ mutter.text }" /></p>
</c:forEach>

</body>
</html>