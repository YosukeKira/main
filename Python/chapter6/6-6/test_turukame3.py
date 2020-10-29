import unittest, turukame

class TestTurukame3( unittest.TestCase ):
	def setUp( self ):
		# 前処理 インスタンスを先に生成しておく
		self.turu = turukame.Turu()
		self.kame = turukame.Kame()
		self.tako = turukame.Tako()
		self.ika  = turukame.Ika()
	
	def tearDown( self ):
		pass
	
	def test_legs( self ):
		# 鶴と亀の足の数を確認
		self.assertEqual( self.turu.get_legs(), 2, "鶴の足の数" )
		self.assertEqual( self.kame.get_legs(), 4, "亀の足の数" )
	
	def test_basic( self ):
		# 鶴亀算を計算
		turu, kame = turukame.calc_turukame( self.turu, self.kame, heads=10, legs=28 )
		# 結果を検証する
		self.assertEqual( (turu,kame), (6,4), "計算後の結果" )
	
	def test_turu_ika( self ):
		# 検証
		self.assertEqual( turukame.calc_turukame( self.turu, self.ika, heads=6, legs=36 ), (3, 3), "鶴とイカの計算" )