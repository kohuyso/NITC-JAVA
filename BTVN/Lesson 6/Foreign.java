package MB;

public class Foreign extends Book {
	private int isbm;

	public Foreign(String author, double price, int quantiy, String method, int isbm, String name) {
		super(author, price, quantiy, method, name);
		this.isbm = isbm;
	}

	public Foreign() {

	}

	/**
	 * @return the isbm
	 */
	public int getIsbm() {
		return isbm;
	}

	/**
	 * @param isbm the isbm to set
	 */
	public void setIsbm(int isbm) {
		this.isbm = isbm;
	}

	public void nhap() {
		super.nhap();
		System.out.println("Nhập số isbm: ");
		isbm = input.nextInt();
		InventoryB.addToInventory(new Foreign(author, price, quantity, method, isbm, name));
	}

	public void display() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return name + " " + author + " " + price + " " + quantity + " " + method + " " + isbm;
	}

}
