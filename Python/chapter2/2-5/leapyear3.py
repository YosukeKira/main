year = int( input("西暦何年？") )

# うるう年かどうか判定
is_leap = (year % 400 == 0) or ((year % 100 != 0) and (year % 4 == 0) )

# 論理式の優先順位 否定＞論理積＞論理和

# 結果を表示
if is_leap:
	print("うるう年です")
else:
	print("うるう年ではありません")