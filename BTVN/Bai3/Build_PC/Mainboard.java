package practice1_mt;

public class Mainboard {
	private String name;
	private Hang hang;
	
	public Mainboard (String name, Hang hang) {
		this.hang = hang;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Hang getHang(int n) {
		return hang;
	}

	
	
}
