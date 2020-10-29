# 集合型を生成
colors = {"red","grren","blue"}
print(colors)

# 空っぽの集合型を生成
e = set()
print(e)

# set()をつかって集合型を生成
fruits = set( {"orange","bnana","mango"} )
print(fruits)

# 内容の差を求める
box1 = {"ハンマー","釘","ペンチ"}
box2 = {"釘","ペンチ"}
box1 - box2
print(box1)

# box3にペンチが入っているかを確認
box3 = {"ハンマー","釘","ペンチ"}
a = "ペンチ" in box3
print(a)

# 集合和
team1 = {"遠藤","佐藤","中村"}
team2 = {"田中","中村","遠藤"}
team3 = team1 | team2
print(team3)

# 集合積
team4 = team1 & team2
print(team4)