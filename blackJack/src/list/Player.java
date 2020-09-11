package list;

public class Player extends People {

	public void sentaku( Stack yama, int a) {
		switch( a ){
		case 1 :
			this.hit( yama );
			break;
		default:
			break;
		}
	}

	//ヒットをした場合の処理
	public void hit( Stack yama) {
		int aceCount = 0;
		int bunki = 1;
		//エースを1としてカウントした場合
		while( bunki == 1 && getHandTotal() < 21 ) {
			this.draw( yama );
			for ( int i = 0; i < this.getCount(); i++ ){
			    System.out.print(this.getHand(i) + " ");
			}
			System.out.println();
			this.hantei();
			System.out.print( "現在の合計：" + this.getHandTotal() );

		//エースを11としてカウントした場合
			for ( int i = 0; i < this.getCount(); i++ ) {
				if ( aceCount == 0 && getHandNum(i) == 1 ) {
					aceCount++;
				}
			}
			if( aceCount >= 1 ) {
				this.hanteiA();
				if( this.getHandTotalA() <= 21 ) {
					System.out.print( " / " + this.getHandTotalA() );
					System.out.println();
				}else {
					System.out.print( " / Burst");
					System.out.println();
				}
			}
			this.hanteiA();

			System.out.println();
			if ( this.getHandTotal() < 21 ) {
//				System.out.print("0:STAND 1:HIT を入力>");
//				bunki = new java.util.Scanner(System.in).nextInt();
				bunki = Nyuryoku.pNyuryoku();
			}
		}
	}

}
