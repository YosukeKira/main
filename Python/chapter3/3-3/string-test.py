# 2つの文字列を連結
s1 = "abc"
s2 = "def"
s = s1 + s2
print(s)

# アスタリスクを使った文字列の繰り返し
a = "@"
print(a * 3)
print("love" * 3)

# 文字の抽出
print(s[0])
print(s[4])

# 文字列のスライス
print(s[1:4])
print(s[2:3])

n = "0123456789"
print(n[2:5])
print(n[4:9])
print(n[5:8])
print(n[3:3])

# スライス省略形
print(n[:3])
print(n[7:])

# スライス、マイナス値を指定
print(n[-1])
print(n[-3:])

# スライス、ステップ値を指定
print(n[0:9:2])
print(n[::3])

