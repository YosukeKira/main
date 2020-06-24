package list;

public class Player extends People {

	//ヒットをした場合の処理
	public void sentaku( Stack yama, int a ) {
		int aceCount = 0;
		//エースを1としてカウントした場合
		while( a == 1 && getHandTotal() < 21 ) {
			this.draw( yama );
			for ( int i = 0; i < this.count; i++ ){
			    System.out.print(this.hand[i] + " ");
			}
			System.out.println();
			this.hantei();
			System.out.print( "現在の合計：" + this.handTotal );

			//エースを11としてカウントした場合
			for ( int i = 0; i < this.count; i++ ) {
				if ( aceCount == 0 && handNum[i] == 1 ) {
					aceCount++;
				}
			}
			if( aceCount >= 1 ) {
				this.hanteiA();
				if( this.handTotalA <= 21 ) {
					System.out.print( " / " + this.handTotalA );
					System.out.println();
				}else {
					System.out.print( " / Burst");
					System.out.println();
				}
			}

			System.out.println();
			if ( this.handTotal < 21 ) {
				System.out.print("0:STAND 1:HIT を入力>");
				a = new java.util.Scanner(System.in).nextInt();
			}
		}
	}

}
