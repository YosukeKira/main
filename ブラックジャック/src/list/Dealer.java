package list;

public class Dealer extends People {

	public void hit( Stack yama ) {
		while( this.handTotal < 17 ) {
			draw( yama );
			this.handTotal = hantei();
		}
	}

}
