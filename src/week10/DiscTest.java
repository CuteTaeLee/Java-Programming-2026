package week10;

class Dice {

	int face;

	public int roll() {
		face = (int) (Math.random() * 6) + 1;
		return face;
	}
}

public class DiscTest {

	public static void main(String[] args) {

		Dice disc = new Dice();
		System.out.println("주사위 숫자:" + disc.roll());

	}

}
