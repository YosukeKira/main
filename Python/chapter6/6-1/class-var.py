class Cat:
	# クラス変数
	nakigoe = "nya-"
	def naku(self):
		print(Cat.nakigoe)

mike = Cat()
mike.naku()
nora = Cat()
nora.naku()

# クラス変数の変更
Cat.nakigoe = "myu-"

mike.naku()
nora.naku()
