import datetime
print( datetime.date.today() )


t = datetime.datetime.now()
# 表示のフォーマットを指定
print( t.strftime("%Y/%m/%d %H:%M:%S") )

# 特定の日付を指定
print( datetime.date(2016, 9, 8) )

# 変数に日付を代入
t = datetime.date(2017, 5, 27)
# 一週間後を計算
print( t + datetime.timedelta(weeks=1) )

# 3日前を計算
print( t - datetime.timedelta(days=3) )

# 日付の差を計算
a = datetime.date(2017, 3, 3)
b = datetime.date(2018, 3, 3)
c = b - a
print(c)