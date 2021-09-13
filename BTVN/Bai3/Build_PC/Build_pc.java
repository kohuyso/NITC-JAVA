package practice1_mt;

public class Build_pc {
	private Hang hang;
	private CPU cpu;
	private RAM ram;
	private Mainboard main;
	
	public Build_pc (Hang hang, CPU cpu, RAM ram, Mainboard main) {
		this.hang = hang;
		this.cpu = cpu;
		this.ram = ram;
		this.main = main;
	}
	
	public void display () {
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "Build_pc [hang=" + hang + ", cpu=" + cpu + ", ram=" + ram + ", main=" + main + "]";
	}



	public Hang getHang() {
		return hang;
	}

	public CPU getCpu() {
		return cpu;
	}

	public RAM getRam() {
		return ram;
	}

	public Mainboard getMain() {
		return main;
	}
	
	
}
