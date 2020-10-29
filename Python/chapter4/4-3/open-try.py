a_file = open("test.txt", mode="r", encoding="utf-8")
try:
	print( a_file.read() )
finally:
	a_file.close()

