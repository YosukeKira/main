<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList,teamMasterMind.PlayerResult,teamMasterMind.AnsNum" %>
<%
ArrayList<PlayerResult> resultList = ( ArrayList<PlayerResult> ) session.getAttribute("resultList");
AnsNum ans = (AnsNum) session.getAttribute("ansNum");
//Arrayリストに入っている要素の数を取得
int challenge = resultList.size();
%>


<!DOCTYPE html>
<html lang="ja" dir="ltr">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width" />
<title>マスターマインド</title>
<link rel="stylesheet" href="cssFile.css">
<script src="javaScriptFile.js"></script>
</head>
<body>
<h1>MasterMindゲーム</h1>

<table style="float:left; margin-right:50px;" border="1" width="20%" height="500">
<caption style="text-align:left;">あなたの履歴</caption>

<!-- 結果表の表示 -->
<%
for (int i = 0; i < 10; i++){
	if( i < challenge ){
%>
<tr><td><%= i + 1 %>回目：<%= resultList.get(i).getPlayerResult() %></td><td>Hit：<%= resultList.get(i).getHit() %><br />Blow：<%= resultList.get(i).getBlow()  %></td></tr>

<%	} else { %>
<tr><td>？回目：？？？？</td><td>Hit：？<br />Blow：？</td></tr>
<%  }	} %>

</table>

<h1>正解の数字</h1>
<br />
<p>正解は・・・<%= ans.getAnsNum()  %>でした</p>
<br />
<hr />
<p><a href="/masterMind">もう一度遊ぶ</a></p>
<p><a href="/masterMind">TOPへ</a></p>


</body>
</html>