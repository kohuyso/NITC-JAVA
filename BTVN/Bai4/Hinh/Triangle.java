package Lesson4_Hinh;

import java.util.Scanner;

public class Triangle {
	Scanner scanner = new Scanner (System.in);
	double x1, x2, x3, h;
	public Triangle () {
	
	}
	
	public void nhap () {
		System.out.println("Nhập số đo các cạnh");
		double x1, x2, x3, h;
		x1 = scanner.nextFloat();
		x2 = scanner.nextFloat();
		x3 = scanner.nextFloat();
		
	}
	
	public double CV () {
		return x1+x2+x3;
	}
	
	public double DT () {
		double p = (x1+x2+x3)/2;
		return Math.sqrt(p*(p-x1)*(p-x2)*(p-x3));
	}

	
}
