# 30以下の奇数を返すイテレータ
def genOdd():
	i = 1
	while i <= 30:
		yield i
		i += 2

# イテレータを変数に代入
it = genOdd()
for v in it:
	print(v, end=",")