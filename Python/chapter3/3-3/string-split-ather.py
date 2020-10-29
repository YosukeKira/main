# 空白で分割する
s = "This is a pen."
print( s.split() )

# /で分割する
days = "2020/02/20"
print( s.split("/") )
# maxsplitを指定して一度だけ分割する
print( s.split("/", maxsplit=1) )

# joinを使ってリスト要素を結合して文字列にする
a = ["aaa","bbb","ccc"]
# 結合部分に-を使用
print( "-".join(a) )

# 文字列を分割して表示形式を変更
a = days.split("/")
print( "-".join(a) )

# 文字列の置換 penをnoteに変換
str = "This is a pen."
print( s.replace("pen","note") )
print( s )