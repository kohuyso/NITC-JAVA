package BT2;

public class Chuoi extends Hoaqua{
	private float sugar;
	public Chuoi() {
		
	}

	public Chuoi(String name, int quantity, double price, float sugar) {
		super(name, quantity, price);
		this.sugar = sugar;
		
	}
	
	
	/**
	 * @param sugar the sugar to set
	 */
	public void setSugar(float sugar) {
		this.sugar = sugar;
	}

	/**
	 * @return the sugar
	 */
	public float getSugar() {
		return sugar;
	}
	
	public void nhap () {
		super.nhap();
		System.out.println("Nhập chỉ số đường: ");
		sugar = input.nextFloat();
		Inventory.addtoInventory(new Chuoi (name, quantity, price, sugar));
		System.out.println("Nhập vitamin có trong quả");

	}
	
	
	


	@Override
	public void Vitamin() {
		System.out.println("Vitamin B, C");
		
	}
	
}
