package Lesson4_QLNS;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số lượng nhân sự: ");
		int soLuong = scanner.nextInt();
		ArrayList <Nhan_Su> lst_hs = new ArrayList<>();
		ArrayList <Nhan_Su> lst_khac = new ArrayList<>();
		ArrayList <Giao_Vien> lst_gv = new ArrayList<>();
		
		// nhap
		for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhập thông tin nhân viên thứ " + (i + 1) + ":");
            System.out.print("Chọn loại nhân viên 1 - Học sinh, 2 - Nhân viên khác, 3 - Giáo viên: ");
            int choose = scanner.nextInt();
             
            if (choose == 1) {
                Nhan_Su hs = new Nhan_Su();
                hs.nhap();
                lst_hs.add(hs);
            }  
    		else if (choose == 2) {
            	Nhan_Su khac = new Nhan_Su(); 
            	khac.nhap();
            	lst_khac.add(khac);
            }
    		else if (choose == 3) {
    			Giao_Vien gv = new Giao_Vien();
    			gv.nhap();
    			lst_gv.add(gv);
    		}  
        }
		
		// danh sach ns
		System.out.println("Chọn danh sách nhân viên cần in");
		
		System.out.print("Chọn loại nhân viên 1 - Học sinh, 2 - Nhân viên khác, 3 - Giáo viên: ");
		int choose = scanner.nextInt();
		if (choose == 1) {
            for (Nhan_Su hsl : lst_hs) {
            	System.out.println(hsl.toString());
            }
        }  
		else if (choose == 2) {
			for (Nhan_Su khacl : lst_khac) {
            	System.out.println(khacl.toString());
            }
        }
		else if (choose == 3) {
			for (Nhan_Su gvl : lst_gv) {
            	System.out.println(gvl.toString());
            }
		}  
	}

}
