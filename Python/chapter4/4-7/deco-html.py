# デコレータを定義
def wrap_html(func):
	def wrapper(*args, **kwargs):
		s = "<html>"
		s += func(*args, **kwargs)
		s += "</html>"
		return s
	return wrapper

def wrap_body(func):
	def wrapper(*args, **kwargs):
		s = "<body>"
		s += func(*args, **kwargs)
		s += "</body>"
		return s
	return wrapper

# デコレータを利用
@wrap_html
@wrap_body
def show_html(text):
	return text

print(show_html("デコレータのテスト"))

# ファイルを書き出す場合
# a_file = open("test.html", mode="w", encoding="utf-8")
# a_file = write(show_html("デコレータのテスト"))
# a_file.close()