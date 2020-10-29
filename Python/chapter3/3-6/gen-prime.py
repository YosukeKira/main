# 素数を返すイテレータ
def genPrime(maxnum):
	num = 2
	while ( num <= maxnum ):
		is_prime = True # 素数かどうかを管理する変数を定義
		for i in range(2, num): # numが2のときは範囲に含まれる値がなく実行されない
			if ( num % i ) == 0: # 素数ではない
				is_prime = False
				break
		if (is_prime): yield num
		num += 1

# イテレータを変数に代入
it = genPrime(50)
# 画面に表示
for i in it:
	print(i, end=",")
print()
print("--------------------")
	

# 素数を返すイテレータを関数で作成した場合
def genPrime2(maxnum):
	numbers = []
	num = 2
	while ( num <= maxnum ):
		is_prime = True
		for i in range(2, num):
			if ( num % i ) == 0:
				is_prime = False
				break
		if ( is_prime ):
			numbers.append(num)
		num += 1
	return numbers

result = genPrime2(50)
print( result )