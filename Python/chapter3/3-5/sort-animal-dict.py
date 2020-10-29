# 辞書型でどうぶつ：最高時速を表したもの
animal_dict = {
	"ライオン":58,
	"チーター":110,
	"シマウマ":60,
	"トナカイ":80
}

# 時速で並び変えて表示
li = sorted( animal_dict.items(), key = lambda x: x[1], reverse = True )
for name,speed in li:
	print(name, speed)
	

dict_gata = { "a":30, "b":30, "c":30 }
print( dict_gata.items() )