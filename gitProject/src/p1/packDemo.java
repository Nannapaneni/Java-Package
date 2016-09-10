package p1;

public class packDemo {
	public static void main(String[] args) {
		packDemo pd = new packDemo();

		pd.display();
		p2.packDemo pd1 = new p2.packDemo();
		pd1.display();
	}

	public void display() {

		System.out.println("Hello from this side.");
	}
}
