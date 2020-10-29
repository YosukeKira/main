# ファイルを開く
a_file = open("test.txt", mode="w", encoding="utf-8")

# ファイルに書き込む
a_file.write("私は失敗したことがない。\n")
a_file.write("ただ、一万通りのうまくいかない方法を\n見つけただけだ。\n")
a_file.write("- トーマス・エジソン\n")

# ファイルを閉じる
a_file.close()


a_file = open("test.txt", mode="r", encoding="utf-8")
s = a_file.read()
a_file.close()
print(s)