# for 構文でenumerate()を使う
fruits= ["Apple","Orange","Banana"]
for i , v in enumerate(fruits):
	print(i,v)

# enumerate()の動作を確認する
list( enumerate(fruits) )


# リストへ要素の追加
nums = [1,2,3]
# append()で値を追加
nums.append(4)
nums.append(5)
# 結果を表示
print(nums)


# リストの結合
n1 = [1,3,5]
n2 = [2,4,6]
# 2つのリストを結合する
n3 = n1 + n2
print("n3=" , n3)

# n1にn2のリストを追加する
n1 += n2
print("n1=" , n1)

# extends()メソッドを使ってリストを追加
n1.extend(n2)
print("n1=" ,n1)
