foodstuff = ["Banana","Mango","Fish","Carrot","cabbage"]

# マンゴーがないか確認する
flag_found = False

# 繰り返し処理のelseを利用した場合の記述

for food in foodstuff:
	if food == "Mango":
		print("マンゴーが入っています")
		break
else:
	print("ありません")