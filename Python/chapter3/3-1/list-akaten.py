points = [80,40,23,14,29,58]
akaten = []
# 30点未満のデータだけ選んで赤点リストに追加
for p in points:
	if p < 30:
		akaten.append(p)

print(akaten)