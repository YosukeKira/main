# リストを作成
nums = [1,3,5,7,9]
# 値を2倍にする無名関数を定義
x2 = lambda x : x * 2
# map()を使ってリストnumsにx2を適用
print( list( map(x2, nums) ) )
# → map()の戻り値はmapオブジェクトのためlistの中身を知りたい場合はlist()を使って表示する
print( map( x2,nums ) )

# 引数に直接ラムダ式を入力
print( list( map( lambda x: x * 2, nums ) ) )
print( list( map( lambda x: x * 3, nums ) ) )
print( list( map( lambda x: x * 4, nums ) ) )

# 適当な配列を用意
nums = [1,2,3,11,12,13,21,22,23]
# 偶数のものを抽出する
print( list( filter( lambda x: ( x % 2 ) == 0, nums  ) ) )
# 奇数のもの
print( list( filter( lambda x: ( x % 2 ) == 1, nums  ) ) )
# 13より大きいもの
print( list( filter( lambda x: ( x > 13 ), nums  ) ) )
# 8未満のもの
print( list( filter( lambda x: ( x < 8 ), nums  ) ) )
# 条件式の部分に計算式を入れると？？
# →エラーにはならずバグの原因になりそう。
print( list( filter( lambda x: x + 2, nums  ) ) )