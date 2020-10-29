import unittest,turukame

# あえて間違った値を指定する例
class TestTurukame2( unittest.TestCase ):
	def test_turukame_ng(self):
		turu, kame = turukame.calc_turukame( turukame.Turu(), turukame.Kame(), heads=10, legs=28 )
		
		# 結果を検証する
		self.assertEqual(turu, 8, "鶴の数")
		self.assertEqual(kame, 12, "亀の数")