package demo;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Player p = new Player();
		Stack yama = new Stack();

		p.draw(yama);
		p.draw(yama);

		System.out.println(p.getHand(0));
		System.out.println(p.getHand(1));

		System.out.println();

		System.out.print("0:STAND 1:HIT を入力>");
		int a = new java.util.Scanner(System.in).nextInt();
		p.sentaku( yama, a );
		System.out.println();


	}
}
