# 関数の定義
def calcTime(dist, speed):
	t = dist / speed
	t = round( t, 1 )
	return t

# 通常の呼び出し
print( calcTime(500, 100) )
# 名前付き引数での呼び出し
print( calcTime( speed=100, dist=500 ) )