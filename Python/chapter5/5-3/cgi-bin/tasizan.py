#!/usr/bin/env python3
# 足し算を行うプログラム

import cgi

# ヘッダの出力
print("Content-Type: text/html charset=utf-8")
print("")

# 送信されたフォームデータを取得する
form = cgi.FieldStorage()

# フォームにv1とv2のデータが含まれているか
if (not 'v1' in form) or (not 'v2' in form):
	# 含まれない場合、フォームを表示
	print("""
	<html>
		<head><meta charset="utf-8"><title>足し算</title></head>
		<body>
			<form>
				<input type="text" name="v1" /> +
				<input type="text" name="v2" />
				<input type="submit" value="計算" />
			</form>
		</body>
	</html>
	""")
else:
	# 含まれる場合、フォームの値を取得して計算結果を表示
	v1 = form.getvalue("v1", "0")
	v2 = form.getvalue("v2", "0")
	try:
		ans = int(v1) + int(v2)
	except:
		ans = "エラーが発生しました。\tもう一度やり直してください"
	print("<html><head><meta charset='utf-8'><title>足し算</title></head><body><h1>", ans, "</h1></body></html>")