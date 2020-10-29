# 非公開属性にアクセスできないことを確かめるプログラム
# 最後にエラーが出る

class Game:
	def __goal(self):
		print("非公開のメソッド")
	
	def play(self):
		print("公開メソッド")


# クラスの利用
game = Game()
game.play()
game._Game__goal()
game.__goal()