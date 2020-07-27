package demo;

public class People {
	//フィールド
    private int count;
    private String[] hand;
    private int[] handNum;
    private int handTotal;
    private int handTotalA;

    //コンストラクタ
    public People(){
        this.count = 0;
        setHandTotal(0);
        setHandTotalA(0);
        this.hand = new String[11];
        this.handNum = new int[11];
    }

    // count アクセサ
    public int getCount() {
    	return this.count;
    }
    public void upCount() {
    	this.count++;
    }

    // handTotal アクセサ
    public int getHandTotal() {
    	return this.handTotal;
    }
    public void setHandTotal( int handTotal ) {
    	this.handTotal = handTotal;
    }

    // handTotalA アクセサ
    public int getHandTotalA() {
    	return this.handTotalA;
    }
    public void setHandTotalA( int handTotalA ) {
    	this.handTotalA = handTotalA;
    }

    // hand配列のアクセサ
    public String getHand( int array ) {
    	return this.hand[array];
    }
    public void setHand( String hand, int array  ) {
    	this.hand[array] = hand;
    }

    // handNum配列のアクセサ
    public int getHandNum( int a ) {
    	return this.handNum[a];
    }
    public void setHandNum( int suji, int array ) {
    	this.handNum[array] = suji;
    }

    //山札からカードを引く
    public void draw( Stack yama ){
        this.setHand( yama.getStack() , this.getCount() );
	    yama.decCount();
        this.upCount();
    }

    //手札の合計を判断する
    public int hantei(){
    	this.setHandTotal(0);
        for (int i = 0; i < this.getCount(); i++){
        	this.setHandNum( Integer.parseInt( getHand(i).substring(1)) , i  );
            if( this.getHandNum(i) >= 10 ){
                this.setHandNum( 10, i );
            }
            this.setHandTotal( getHandTotal()+getHandNum(i) );
        }
        return this.getHandTotal();
 	}

    //手札の合計を判断する(Aを11として扱う)
    public int hanteiA(){
        this.setHandTotalA(0);
        int aceCount = 0;
        for (int i = 0; i < this.getCount(); i++){
        	this.setHandNum( Integer.parseInt( getHand(i).substring(1)) , i  );
            if( this.getHandNum(i) >= 10 ){
                this.setHandNum( 10, i );
            }
            if( this.getHandNum(i) == 1 && aceCount == 0 ) {
            	aceCount++;
            	this.setHandNum( 11, i );
            }
            this.setHandTotalA( this.getHandTotalA()+this.getHandNum(i) );
        }
        return this.getHandTotalA();
 	}

}
