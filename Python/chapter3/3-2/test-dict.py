# 成績データを辞書型で定義
records = {
	"Tanaka":72,"Yamada":65,"Hirata":100,
	"Akai":56,"Fukuda":66,"Sakai":80
}

# 合計を求める
sum_v = 0
for v in records.values():
	sum_v += v
# 平均点を計算して結果を表示
ave_v = sum_v / len(records)
print("合計点：", sum_v)
print("平均点：", ave_v)

# 成績データの一覧を平均点との差を表示
fmt = "| {0:<7} | {1:>4} | {2:>5} "
# fmtの解説
# 出力書式：「番号：書式」で指定。
# 注意、<7は7未満、>4は4より大きいという意味ではない！
# 名前：左寄せ(<)、7文字
# 点数：右寄せ(>)、4文字
# 差  ：右寄せ(>)、5文字
# ※ 全角、半角の区別なく1文字として数える
#    見出しに全角は使用する場合は要注意
print("| 名前    | 点数 | 差")
for name,v in sorted( records.items() ):
	# 平均点との差を求める
	diff_v = v - ave_v
	# 小数点以下を丸める
	diff_v = round( diff_v, 1)
	# 書式にそって出力
	print(fmt.format(name, v , diff_v))