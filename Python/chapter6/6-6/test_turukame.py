import sys, unittest
# sys.path.append("../../")
# from chapter6.6-5
import turukame

class TestTurukame( unittest.TestCase ):
	def test_turukame(self):
		turu, kame = turukame.calc_turukame( turukame.Turu(), turukame.Kame(), heads=10, legs=28 )
	
		# 結果を検証する
		self.assertEqual(turu, 6, "鶴の数")
		self.assertEqual(kame, 4, "亀の数")