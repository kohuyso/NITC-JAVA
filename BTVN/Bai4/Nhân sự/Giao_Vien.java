package Lesson4_QLNS;

public class Giao_Vien extends Nhan_Su {
	private String Mon;
	
	public Giao_Vien () {
		super ();
	}


	public String getMon() {
		return Mon;
	}
	public void setMon(String mon) {
		Mon = mon;
	}
	
	public void nhap() {
        super.nhap();
        System.out.print("Nhập bộ môn giảng dạy: ");
        Mon = scanner.next();
    }


	@Override
	public String toString() {
		return "Giao_Vien [Mon=" + Mon + ", getHoTen()=" + getHoTen() + ", getTuoi()=" + getTuoi() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
}
