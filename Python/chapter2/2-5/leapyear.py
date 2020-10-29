year = int( input("西暦何年？") )

# うるう年かどうか判定
is_leap = False

# 4で割り切れたらうるう年
if year % 4 == 0:
	# 100で割り切れたらうるう年ではない
	if year % 100 == 0:
		# 400で割り切れたらうるう年
		if year % 400 == 0:
			is_leap = True
		else:
			is_leap = False
	else:
		is_leap = True
else:
	is_leap = False

# 結果を表示
if is_leap:
	print("うるう年です")
else:
	print("うるう年ではありません")