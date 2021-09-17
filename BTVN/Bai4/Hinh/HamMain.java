package Lesson4_Hinh;

import java.util.Scanner;

public class HamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		int choose = scanner.nextInt();
		System.out.println("Nhập loại hình cần xử lý: ");
		System.out.println("1 - Square");
		System.out.println("2 - Parallelogram");
		System.out.println("3 - Rectangular");
		System.out.println("4 - Triagle");
		System.out.println("5 - Rhombus");
		
		if(choose == 1) {
			Square square = new Square();
			System.out.println("Chu vi của hình là: ");
			System.out.println(square.CV());
			System.out.println("Diện tích của hình là: ");
			System.out.println(square.DT());
			
		}
		else if(choose == 2) {
			Parallelogram para = new Parallelogram();
			System.out.println("Chu vi của hình là: ");
			System.out.println(para.CV());
			System.out.println("Diện tích của hình là: ");
			System.out.println(para.DT());
		}
		else if(choose == 3) {
			Rectangular rec = new Rectangular();
			System.out.println("Chu vi của hình là: ");
			System.out.println(rec.CV());
			System.out.println("Diện tích của hình là: ");
			System.out.println(rec.DT());
		}
		else if(choose == 4) {
			Triangle triangle = new Triangle();
			triangle.nhap();
			System.out.println("Chu vi của hình là: ");
			System.out.println(triangle.CV());
			System.out.println("Diện tích của hình là: ");
			System.out.println(triangle.DT());
		}
	}

	

}
