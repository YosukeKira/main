# 辞書型のデータを作成
ages = {"鈴木":30,"井上":20,"伊藤":22}
print(ages)

# 値を表示
print("伊藤さんの年齢は" , ages["伊藤"])

# 鈴木の年齢を29に変更
ages["鈴木"] = 29
print(ages)

# 価格表のデータを、変数pricesに代入
prices = {"バナナ":300,"リンゴ":200,"マンゴー":400}
# リンゴがあるか確認
print("リンゴはあるか？" , "リンゴ" in prices)

# リンゴがいくらかを確認
print("リンゴの値段=" , prices["リンゴ"])

# オレンジがあるかを確認
print("オレンジがあるか？" , "オレンジ" in prices)