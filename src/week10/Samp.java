package week10;

public class Samp {
	int id;

	public Samp(int id) {
		this.id = id;
	}

	public void set(int id) {
		this.id = id;
	}

	public int get() {
		return id;
	}

	public static void main(String[] args) {
		Samp ob1 = new Samp(3);
		Samp ob2 = new Samp(4);
		Samp s;

		s = ob2;
		ob1 = ob2;
		System.out.println("ob1.id=" + ob1.get());
		System.out.println("ob2.id=" + ob2.get());

	}

}
