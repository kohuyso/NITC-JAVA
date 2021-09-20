package Lesson_5;

public class Banana extends HoaQua {
	private float Kali;

	public Banana() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Banana(String name, int quantity, float price, float Kali) {
		super(name, quantity, price);
		// TODO Auto-generated constructor stub
		this.Kali = Kali;
	}

	/**
	 * @return the kali
	 */
	public float getKali() {
		return Kali;
	}

	public void input () {
		super.input();
		System.out.println("Nhập chỉ số đường: ");
		Kali = Float.parseFloat(nhap.nextLine());
	}

	@Override
	public String toString() {
		return "Banana [Kali=" + Kali + ", name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
	}
	
	
}
