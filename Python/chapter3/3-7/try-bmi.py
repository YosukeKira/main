# BMI判定(例外処理あり版)
# ユーザーから正しい値を得てBMIを計算
while True:
	try: # breakするまで繰り返し
		# 入力
		weight = float( input("体重は(kg)？") )
		height = float( input("身長は(cm)？") )
		if weight <= 0:
			# print("入力に誤りがあります。再度入力して下さい。")
			# continue
			raise ValueError
		else:
			# BMIの計算
			height = height / 100
			bmi = weight / ( height ** 2 )
			break;
	except:
		print("入力に誤りがあります。再度入力して下さい。")

# BMIの値から結果を判定
result = ""
if bmi < 18.5: result = "やせ型"
elif bmi < 25: result = "標準体重"
elif bmi < 30: result = "肥満(軽)"
else: result = "肥満(重)"

# 結果を表示
print("BMI :", bmi)
print("判定 :", result)