v = 0
for i in range(1,11):
	v = v + i
	print(i,"を足すと",v)
print("1から10を足すと・・・",v)

v = 0
for i in range(1,11,2):
	v = v + i
	print(i,"を足すと",v)
print("1から10の奇数のみを足すと・・・",v)