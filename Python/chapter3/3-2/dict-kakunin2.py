prices = {"Banana":300,"Apple":200,"Mango":400}
# キーの一覧を取得
print( "キーの一覧", prices.keys())

# キーの一覧をリストの形で取得
print( "リストの形のキー一覧", list( prices.keys() ))

fruits = {"Banana":300,"Apple":200,"Mango":400}
print( "キーの一覧をリストの形で取得", list( fruits.keys() ))

# 整列済みの一覧をリストの形で取得
print( "整列済みリスト一覧", sorted( fruits.keys() ) )

# 値の一覧を取得
print( "値段の一覧", fruits.values())

# (キー、値)のタプルのリストを一覧で取得
print("キー、値の一覧", list( fruits.items() ) )
