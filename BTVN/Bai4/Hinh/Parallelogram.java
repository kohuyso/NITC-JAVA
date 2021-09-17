package Lesson4_Hinh;

import java.util.Scanner;

public class Parallelogram extends Tu_giac {
	double h;
	
	public Parallelogram () {
		Scanner scanner = new Scanner(System.in);
		h = scanner.nextDouble();
	}
	
	public double CV() {
		return (super.sd[0] + super.sd[1])*2;
	}
	public double DT() {
		if(super.sd[0] > h) return super.sd[1]*h;
		return super.sd[0]*h;
	}
}
