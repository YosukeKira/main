package list;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Stack yama = new Stack();//山札を作る
		Dealer d = new Dealer();//ディーラー登場
		Player p = new Player();//プレイヤー登場


		//ディーラーが山札をシャッフル
//		d.shuffle( yama );


		//プレイヤーが2枚カードを引く
		p.draw( yama );
		p.draw( yama );

		//ディーラーが2枚カードを引く
		d.draw(yama);
		d.draw(yama);
		d.hanteiA();

		//ディーラーの手札
		System.out.println("ディーラーの手札");
		System.out.println( d.hand[0] + " ??");

        //プレイヤーの手札を表示
        System.out.println("プレイヤーの手札");
		System.out.println( p.hand[0] + " " + p.hand[1] );
		System.out.print( "現在の合計：" +  p.hantei() );
		if( p.handNum[0] == 1 || p.handNum[1] == 1 ) {
			System.out.print( " / " + p.hanteiA() );
		}
		System.out.println();
		System.out.println();

		//ディーラーのブラックジャックを判定
		if ( d.handTotalA == 21 ) {
    		System.out.println("ディーラーの手札");
    		System.out.println( d.hand[0] + " " + d.hand[1]);
			System.out.println("ディーラーがブラックジャックでした。");
			System.out.println("ゲームを終了します。");
			return;
		}

        //プレイヤーの選択
		System.out.print("0:STAND 1:HIT を入力>");
		int a = new java.util.Scanner(System.in).nextInt();
		p.sentaku( yama, a );
		System.out.println();

		//バーストの判定
		if( p.handTotal > 21 ){
		    System.out.println("バースト");
		    System.out.println("あなたの負け。");
		    System.out.println("ゲームを終了します");
		    return;
		}

		//ディーラーのターン
		d.hit( yama );

		//ディーラーのバースト判定
		if( d.handTotal > 21 ){
		    System.out.println("ディーラーのバースト");
		    for ( int i = 0; i < d.count; i++ ) {
		        System.out.print(d.hand[i] + " ");
		    }
		    System.out.println();
		    System.out.println("あなたの勝ち！");
		    System.out.println("ゲームを終了します");
		    return;
		}

		//お互いの手札、合計値を再確認
		System.out.println("プレイヤー：" + p.handTotal);
		for( int i = 0; i < p.count; i++ ){
		    System.out.print( p.hand[i] + " ");
		}
		System.out.println();

		System.out.println("ディーラー：" + d.handTotal);
		for( int i = 0; i < d.count; i++ ){
		    System.out.print( d.hand[i] + " ");
		}
		System.out.println();
		System.out.println();
		Thread.sleep(3000);


		if( d.handTotal >= p.handTotal ){
		    System.out.println("残念。あなたの負け。");
		    System.out.println("ゲームを終了します");
		}else{
		    System.out.println("あなたの勝ち！");
		    System.out.println("ゲームを終了します");
		}
	}

}
