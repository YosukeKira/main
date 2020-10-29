class Cat:
	nakigoe = "nya-"
	def naku(self):
		print(self.nakigoe)

mike = Cat()
nora = Cat()

mike.nakigoe = "myu-"
mike.naku()
nora.naku()