package BT2;

public class Cam extends Hoaqua {
	private float weight;

	


	public Cam(String name, int quantity, double pice, float weight) {
		super(name, quantity, pice);
		this.weight = weight;
	}

	public Cam() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the weight
	 */
	public float getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public void nhap () {
		super.nhap();
		System.out.println("Nhập trọng lượng của cam");
		weight = input.nextFloat();
		Inventory.addtoInventory(new Tao (name, quantity, price, weight));
		
	}


	

	@Override
	public void Vitamin() {
		
		System.out.println("Vitamin A, B");
		
	}
	
	
	
}
