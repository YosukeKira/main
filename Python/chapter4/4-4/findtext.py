# 複数テキストファイルからテキストファイルを検索するスクリプト
import sys
import os

# 引数の数を確認
# 何もキーワードがなければ使い方を表示
if len(sys.argv) <= 1:
	print("[USAGE] findtext (keyword)")
	sys.exit(0) # プログラムを終了する
	
# コマンドライン引数からキーワードを得る
keyword = sys.argv[1]

# カレントディレクトリ以下のファイルをすべて処理する
for root, dirs, files in os.walk(".."): # os.walkでファイルを列挙
	for fi in files:
		result = []
		# テキストファイルを読む
		try:
			path = os.path.join(root, fi) # os.path.joinでフルパスを取得
			with open(path, encoding="utf-8") as f:
				for no, line in enumerate(f):
					if line.find(keyword) >= 0:
						line = line.strip() # 各行の空白文字を除去
						s = "| {0:4}: {1}".format(no+1, line) # 表示の書式を設定
						result.append(s) # resultに追加
		except:
			continue
		
		# resultに検索結果があれば結果を表示
		if len(result) > 0:
			print("+ file:" + fi)
			for li in result:
				print(li) # resultに追加された行を表示
