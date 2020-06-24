package list;

public abstract class People {
	//フィールド
    int count;
    String[] hand;
    int[] handNum;
    int handTotal;
    int handTotalA;

    //コンストラクタ
    public People(){
        this.count = 0;
        setHandTotal(0);
        setHandTotalA(0);
//        ArrayList<String> hand = new ArrayList<String>();
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

    //山札からカードを引く
    public void draw( Stack yama ){
        this.hand[this.count] = yama.stack[yama.count];
	    yama.decCount();
        this.upCount();
    }

    //手札の合計を判断する
    public int hantei(){
        this.handTotal = 0;
        for (int i = 0; i < this.count; i++){
            this.handNum[i] = Integer.parseInt( this.hand[i].substring(1) );
            if( this.handNum[i] >= 10 ){
                this.handNum[i] = 10;
            }
            this.handTotal += this.handNum[i];
        }
        return this.handTotal;
 	}

    //手札の合計を判断する(Aを11として扱う)
    public int hanteiA(){
        this.handTotalA = 0;
        int aceCount = 0;
        for (int i = 0; i < this.count; i++){
            this.handNum[i] = Integer.parseInt( this.hand[i].substring(1) );
            if( this.handNum[i] >= 10 ){
                this.handNum[i] = 10;
            }
            if( this.handNum[i] == 1 && aceCount == 0 ) {
            	aceCount++;
            	this.handNum[i] = 11;
            }
            this.handTotalA += this.handNum[i];
        }
        return this.handTotalA;
 	}

}
