class Hoge:
	def display(self):
		print("self")
	@staticmethod
	def introduce():
		print("Hoge")

class Get:
	def display(self, talk):
		calc = self + talk
		return calc

Hoge.introduce()
Hoge.display("self")


s = Get.display("selfが実行されました","talkが実行されました")
print(s)