class Tukimei:
	tuki = ["睦月","如月","弥生","卯月","皐月","水無月","文月","葉月","長月","神無月","霜月","師走"]
	def __getitem__(self, key):
		i = int(key)
		return self.tuki[i-1]
	
	def __setitem__(self, key, value):
		i = int(key)
		self.tuki[i-1] = value

# 添え字にアクセスしてみる
t = Tukimei()
t[10] = "神西月"
print( t[10] )
print( t[12] )