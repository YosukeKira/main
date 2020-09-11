package demo;

public class Dealer extends People {

	public void hit( Stack yama ) {
		while( this.getHandTotal() < 17 && (this.getHandTotalA() < 17 || 21 < this.getHandTotalA()) ) {
			draw( yama );
			this.hantei();
			this.hanteiA();
		}
	}

}
