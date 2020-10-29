from sklearn import datasets, svm, metrics
from sklearn.model_selection import train_test_split

# ワインデータ(CSV)を読み込む
wine_csv = []
with open("winequality-white.csv", "r", encoding="utf-8") as fp:
	no = 0
	for line in fp:
		line = line.strip()
		cols = line.split(";")
		wine_csv.append(cols)

# 1行目はヘッダ行なので2行目から読み込む
wine_csv = wine_csv[1:]

# CSVの各データを数値に変換
labels = []
data = []
for cols in wine_csv:
	cols = list( map( lambda n: float(n), cols ) )
	# ワインのグレードを調整
	grade = int( cols[11] )
	if grade == 9: grade = 8
	if grade < 4 : grade = 5
	labels.append(grade)
	data.append( cols[0:11] )

# 訓練用データとテスト用データに分ける
data_train, data_test, label_train, label_test = train_test_split( data, labels )

# SVMのアルゴリズムを利用して学習
from sklearn.ensemble import RandomForestClassifier
clf = RandomForestClassifier( n_estimators=10 )
clf.fit( data_train, label_train )

# 予測してみる
predict = clf.predict( data_test )
total = ok = 0
for idx, pre in enumerate( predict ):
	answer = label_test[idx]
	total += 1
	# ほぼ正解なら、正解とみなす
	if (pre-1) <= answer <= (pre+1):
		ok += 1
print("正解率=", ok, "/", total, "=", ok/total)
