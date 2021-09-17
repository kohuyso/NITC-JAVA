package Lesson4_QLNS;

import java.util.Scanner;

public class Nhan_Su {
	Scanner scanner = new Scanner(System.in);
	private String hoTen, CCCD;
    private int tuoi;
    
   
     
    public Nhan_Su() {
        
    }
 
    public Nhan_Su(String hoTen, String CCCD, int tuoi) {
        super();
        this.hoTen = hoTen;
        this.CCCD = CCCD;
        this.tuoi = tuoi;
    }
 
 
    public String getHoTen() {
        return hoTen;
    }
 
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
 
    public int getTuoi() {
        return tuoi;
    }
 
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
 
    public void nhap() {
        System.out.print("Nhập họ tên nhân sự: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        tuoi = scanner.nextInt();
        System.out.print("Nhập số CCCD: ");
        CCCD = scanner.next();
    }

	@Override
	public String toString() {
		return "Nhan_Su [scanner=" + scanner + ", hoTen=" + hoTen + ", CCCD=" + CCCD + ", tuoi=" + tuoi + "]";
	}
	
}
