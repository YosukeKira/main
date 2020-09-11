package list;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Stack yama = new Stack();//山札を作る
		Dealer d = new Dealer();//ディーラー登場
		Player p = new Player();//プレイヤー登場


		//プレイヤーが2枚カードを引く
		p.draw( yama );
		p.draw( yama );
		p.hantei();
		p.hanteiA();

		//ディーラーが2枚カードを引く
		d.draw(yama);
		d.draw(yama);
		d.hantei();
		d.hanteiA();

		//ディーラーの手札
		System.out.println("ディーラーの手札");
		System.out.println( d.getHand(0) + " ??");

        //プレイヤーの手札を表示
        System.out.println("プレイヤーの手札");
		System.out.println( p.getHand(0) + " " + p.getHand(1) );
		System.out.print( "現在の合計：" +  p.hantei() );
		if( p.getHandNum(0) == 1 || p.getHandNum(1) == 1 ) {
			System.out.print( " / " + p.hanteiA() );
		}
		System.out.println();
		System.out.println();

		//ディーラーのブラックジャックを判定
		if ( d.getHandTotalA() == 21 ) {
    		System.out.println("ディーラーの手札");
    		System.out.println( d.getHand(0) + " " + d.getHand(1) );
			System.out.println("ディーラーがブラックジャックでした。");
			System.out.println("ゲームを終了します。");
			return;
		}

        //プレイヤーの選択
//		System.out.print("0:STAND 1:HIT を入力>");
//		int a = new java.util.Scanner(System.in).nextInt();
		int a = Nyuryoku.pNyuryoku();
//		System.out.println("aの値 = "+ a);
		p.sentaku( yama, a );
		System.out.println();

		//バーストの判定
		if( p.getHandTotal() > 21 ){
		    System.out.println("バースト");
		    System.out.println("あなたの負け。");
		    System.out.println("ゲームを終了します");
		    return;
		}

		//ディーラーのターン
		d.hit( yama );

		//ディーラーのバースト判定
		if( d.getHandTotal() > 21 ){
		    System.out.println("ディーラーのバースト");
		    for ( int i = 0; i < d.getCount(); i++ ) {
		        System.out.print(d.getHand(i) + " ");
		    }
		    System.out.println();
		    System.out.println("あなたの勝ち！");
		    System.out.println("ゲームを終了します");
		    return;
		}

		//プレイヤーの大きいほうを採用
		int player = 0;
		if( p.getHandTotalA() <= 21 ) {
			player = p.getHandTotalA();
		}else {
			player = p.getHandTotal();
		}

		//ディーラーのAありのものとなしのものの大きいほうを採用
		int dealer = 0;
		if( d.getHandTotalA() <= 21 ) {
			dealer = d.getHandTotalA();
		}else {
			dealer = d.getHandTotal();
		}

		//お互いの手札、合計値を再確認
		System.out.println("プレイヤー：" + player );
		for( int i = 0; i < p.getCount(); i++ ){
		    System.out.print( p.getHand(i) + " ");
		}
		System.out.println();

		System.out.println("ディーラー：" + dealer );
		for( int i = 0; i < d.getCount(); i++ ){
		    System.out.print( d.getHand(i) + " ");
		}
		System.out.println();
		System.out.println();
		Thread.sleep(2000);

		if( dealer >= player ){
		    System.out.println("残念。あなたの負け。");
		    System.out.println("ゲームを終了します");
		}else{
		    System.out.println("あなたの勝ち！");
		    System.out.println("ゲームを終了します");
		}
	}

}
