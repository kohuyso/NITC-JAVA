package Lesson4_Hinh;

import java.util.Scanner;

public class Tu_giac {
	Scanner scanner = new Scanner (System.in);
	protected double[] sd = new double[4];

	public Tu_giac () {
		for (int i = 0; i < 4; i+=1) {
			System.out.println("Nhập độ dài cạnh thứ " + (i+1) + ": ");
			sd[i] = scanner.nextFloat();
		}
		
	}
}
