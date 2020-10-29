# 正規表現reモジュールを取り込む
import re
pat = r"[0-9]+" # 正規表現の記述
str = "This pen is 100yen." # 文字列
print(re.search(pat, str)) # 正規表現検索


print( re.search(r"^abc$", "abc") )
print( re.search(r"^abc$", "abcd") )
print( re.search(r"^abc$", "xabc") )


pat = r"\.png$"
print( re.search(pat, "abc.png") )

# 末尾が.pngで無ければマッチしない
print( re.search(pat, "abc.png-docpng") )


words = ["soy","soup","nuts","spot"]
pat = r"^s...$"
for i in words:
	if re.search(pat, i):
		print(i)

pat = r"ba*"
print( pat,"=", re.search(pat, "b") )

pat = r"ba+"
print( pat,"=", re.search(pat, "baaaaaaaa") )