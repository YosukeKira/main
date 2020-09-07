<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja" dir="ltr">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width" />
<title>マスターマインド</title>
<link rel="stylesheet" href="cssFile.css">
<script src="javaScriptFile"></script>
<script>
<!--
//選択されている番号を示す変数
var count = 0;

//numberボタンが押された時の処理
function numClick( num ){
	document.images[count].src="number/number" + num + ".png";
	count++;

	if (count >= 4){
		count = 0;
	}
	selectBtn();
}

//数字下の選択ボタンが押された時の処理
function select( num ){
	count = num;
	selectBtn();
}

//数字下の選択ボタンの整合性を保つ処理
function selectBtn(){
	switch(count){
		case 0:
			document.getElementById("first").src="button/btn_2.gif";
			document.getElementById("second").src="button/btn_1.gif";
			document.getElementById("third").src="button/btn_1.gif";
			document.getElementById("fourth").src="button/btn_1.gif";
			break;
		case 1:
			document.getElementById("second").src="button/btn_2.gif";
			document.getElementById("first").src="button/btn_1.gif";
			document.getElementById("third").src="button/btn_1.gif";
			document.getElementById("fourth").src="button/btn_1.gif";
			break;
		case 2:
			document.getElementById("third").src="button/btn_2.gif";
			document.getElementById("first").src="button/btn_1.gif";
			document.getElementById("second").src="button/btn_1.gif";
			document.getElementById("fourth").src="button/btn_1.gif";
			break;
		case 3:
			document.getElementById("fourth").src="button/btn_2.gif";
			document.getElementById("first").src="button/btn_1.gif";
			document.getElementById("second").src="button/btn_1.gif";
			document.getElementById("third").src="button/btn_1.gif";
			break;
	}
}

//リセットボタンが押された時の処理
function reSet(){
	for (i = 0; i <= 3; i++){
		document.images[i].src="number/number0.png";
	}
	count = 0;
	selectBtn();
}
-->
</script>
</head>
<body onload="selectBtn()">
<h1>MasterMindゲーム</h1>

<table style="float:left; margin-right:50px;" border="1" width="20%" height="500">
<caption style="text-align:left;">履歴</caption>
	<tr>
		<td>1回目:？？？？</td>
		<td>Hit:？<br />Blow:？</td>
	</tr>

	<tr>
		<td>2回目:？？？？</td>
		<td>Hit:？<br />Blow:？</td>
	</tr>

	<tr>
		<td>3回目:？？？？</td>
		<td>Hit:？<br />Blow:？</td>
	</tr>

	<tr>
		<td>4回目:？？？？</td>
		<td>Hit:？<br />Blow:？</td>
	</tr>

	<tr>
		<td>5回目:？？？？</td>
		<td>Hit:？<br />Blow:？</td>
	</tr>

	<tr>
		<td>6回目:？？？？</td>
		<td>Hit:？<br />Blow:？</td>
	</tr>

	<tr>
		<td>7回目:？？？？</td>
		<td>Hit:？<br />Blow:？</td>
	</tr>

	<tr>
		<td>8回目:？？？？</td>
		<td>Hit:？<br />Blow:？</td>
	</tr>

	<tr>
		<td>9回目:？？？？</td>
		<td>Hit:？<br />Blow:？</td>
	</tr>

	<tr>
		<td>10回目:？？？？</td>
		<td>Hit:？<br />Blow:？</td>
	</tr>
</table>

<!-- 上段数字 -->
<div>
<label name="1st"><img src="number/number0.png" class="number" height="150" width="11%" style="margin-top:30px; margin-right:20px;" /></label>
<label name="2nd"><img src="number/number0.png" class="number" height="150" width="11%" style="margin-top:30px; margin-right:20px;" /></label>
<label name="3rd"><img src="number/number0.png" class="number" height="150" width="11%" style="margin-top:30px; margin-right:20px;" /></label>
<label name="4th"><img src="number/number0.png" class="number" height="150" width="11%" style="margin-top:30px; margin-right:20px;" /></label>

<form action="/masterMind/Result" method="post" style="float:right">
<input type="submit" onmouseover="" style="width:120px; height:50px; margin-top:70px; margin-right:200px;" value="OK" /><br />
<input type="hidden" name="playerNumber" value="">
<button type="button" onclick="reSet()" style="width:120px; height:50px; margin-top:10px;">reset</button>
</form>
</div>

<!-- 選択ボタン -->
<div>
<table width="53.6%" style="padding-left:20px;">
<tr>
	<td><label name="1st"><img src="button/btn_1.gif" id="first" onclick="select(0)" class="sentaku" width="100" /></label></td>
	<td><label name="2nd"><img src="button/btn_1.gif" id="second" onclick="select(1)" class="sentaku" width="100" /></label></td>
	<td><label name="3rd"><img src="button/btn_1.gif" id="third" onclick="select(2)" class="sentaku" width="100" /></label></td>
	<td><label name="4th"><img src="button/btn_1.gif" id="fourth" onclick="select(3)" class="sentaku" width="100" /></label></td>
</tr>
</table>
</div>

<!-- numberボタン  -->
<div>
<table width="54%" style="margin-top:40px;">
<tr>
	<td><img src="number/number1.png" onclick="numClick(1)" class="miniNumber" width="100" height="100" /></td>
	<td><img src="number/number2.png" onclick="numClick(2)" class="miniNumber" width="100" height="100" /></td>
	<td><img src="number/number3.png" onclick="numClick(3)" class="miniNumber" width="100" height="100" /></td>
	<td><img src="number/number4.png" onclick="numClick(4)" class="miniNumber" width="100" height="100" /></td>
	<td><img src="number/number5.png" onclick="numClick(5)" class="miniNumber" width="100" height="100" /></td>
</tr>

<tr>
	<td><img src="number/number6.png" onclick="numClick(6)" class="miniNumber" width="100" height="100" /></td>
	<td><img src="number/number7.png" onclick="numClick(7)" class="miniNumber" width="100" height="100" /></td>
	<td><img src="number/number8.png" onclick="numClick(8)" class="miniNumber" width="100" height="100" /></td>
	<td><img src="number/number9.png" onclick="numClick(9)" class="miniNumber" width="100" height="100" /></td>
	<td><img src="number/number0.png" onclick="numClick(0)" class="miniNumber" width="100" height="100" /></td>
</tr>
</table>
</div>
</body>
</html>