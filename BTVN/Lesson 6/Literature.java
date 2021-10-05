package MB;

public class Literature extends Book {
	private int republic;

	public Literature(String author, double price, int quantiy, String method, int republic, String name) {
		super(author, price, quantiy, method, name);
		this.republic = republic;
	}

	public Literature() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the republic
	 */
	public int getRepublic() {
		return republic;
	}

	/**
	 * @param republic the republic to set
	 */
	public void setRepublic(int republic) {
		this.republic = republic;
	}

	public void nhap() {
		super.nhap();
		System.out.println("Nhập số lần tái bản: ");
		republic = input.nextInt();
		InventoryB.addToInventory(new Literature(author, price, quantity, method, republic, name));
	}

	public void display() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return name + " " + author + " " + price + " " + quantity + " " + method + " " + republic;
	}
}
