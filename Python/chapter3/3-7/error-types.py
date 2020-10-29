s = input("体重を入力")
try:
	v = 100 / float(s)
	print(v)
except ValueError as e:
	print(e)
	print("ValueErrorブロックが処理されました")
except ZeroDivisionError as e:
	print(e)
	print("ZeroDivisionErrorgブロックが処理されました")
except:
	print("その他のエラー")
else:
	print("elseブロックが処理されました")
finally:
	print("finallyブロックが処理されました")