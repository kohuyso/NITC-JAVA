package BT2;



public class Tao extends Hoaqua {

	
	private double kali;

	public Tao(String name, int quantity, double price, double kali) {
		super(name, quantity, price);
		this.kali = kali;
	}

	public Tao() {
		
	}




	@Override
	public void Vitamin() {
		System.out.println("Vitamin C, D");
		
	}

	/**
	 * @return the kali
	 */
	public double getKali() {
		return kali;
	}

	/**
	 * @param kali the kali to set
	 */
	public void setKali(double kali) {
		this.kali = kali;
	}

	public void nhap () {
		super.nhap();
		System.out.println("Nhập hàm lượng kali trong táo");
		kali = input.nextDouble();
		Inventory.addtoInventory(new Tao (name, quantity, price, kali));
	
	}
	
	
}
