package MB;

public class Science extends Book {
	private int yPublic;

	public Science(String author, double price, int quantiy, String method, int yPubilc, String name) {
		super(author, price, quantiy, method, name);
		this.yPublic = yPublic;
	}

	public Science() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the yPubilc
	 */
	public int getyPubilc() {
		return yPublic;
	}

	/**
	 * @param yPubilc the yPubilc to set
	 */
	public void setyPubilc(int yPubilc) {
		this.yPublic = yPublic;
	}

	public void nhap() {
		super.nhap();
		System.out.println("In năm phát hành: ");
		yPublic = input.nextInt();
		InventoryB.addToInventory(new Science(author, price, quantity, method, yPublic, name));
	}

	public void display() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return name + " " + author + " " + price + " " + quantity + " " + method + " " + yPublic;
	}
}
