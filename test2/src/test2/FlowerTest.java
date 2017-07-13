package test2;

public class FlowerTest {
	public static void main(String[] args) {
		Flower f = new Flower("牡丹花",40);
		System.out.println(f.toString());
		f.reaisePrice().reaisePrice().reaisePrice().reaisePrice().reaisePrice();
		System.out.println(f.toString());
	}
}
