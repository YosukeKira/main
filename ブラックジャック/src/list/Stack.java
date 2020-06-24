package list;

public class Stack {
	//山札の配列
	String[] stack = {  "H1","H2","H3","H4","H5","H6","H7","H8","H9","H10","H11","H12","H13",
                        "D1","D2","D3","D4","D5","D6","D7","D8","D9","D10","D11","D12","D13",
                        "S1","S2","S3","S4","S5","S6","S7","S8","S9","S10","S11","S12","S13",
                        "C1","C2","C3","C4","C5","C6","C7","C8","C9","C10","C11","C12","C13",
	};
	//山札の残り枚数(配列なのでひとつ少ない)
    int count = 51;

    //山札が生成された時点でシャッフルされている。
    public Stack() {
		for (int i = 0; i < this.stack.length; i++){
		    int r = new java.util.Random().nextInt(52);
		    String saf = this.stack[i];
		    this.stack[i] = this.stack[r];
		    this.stack[r] = saf;
		}
    }

    // count アクセサ
    public int getCount() {
    	return this.count;
    }

    // count 一枚少なくする
    public void decCount() {
    	this.count--;
    }

}
