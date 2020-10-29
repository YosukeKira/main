foodstuff = ["Banana","Mango","Fish","Carrot","cabbage"]

# マンゴーがないか確認する
flag_found = False
# foodという変数にfoodstuffの値が1つずつ入る。繰り返しのたびに新しい値が入る
for food in foodstuff:
	if food == "Mango":
		flag_found = True
		break

if flag_found:
	print("マンゴーが入っています")
else:
	print("ありません")
