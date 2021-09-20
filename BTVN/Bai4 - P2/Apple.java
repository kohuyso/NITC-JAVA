package Lesson_5;

import java.util.Scanner;

public class Apple extends HoaQua {
	
	Scanner nhap = new Scanner (System.in);
	private float sugar;
	
	public Apple() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Apple(String name, int quantity, float price, float sugar) {
		super(name, quantity, price);
		this.sugar = sugar;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the sugar
	 */
	public float getSugar() {
		return sugar;
	}
	
	public void input () {
		super.input();
		System.out.println("Nhập chỉ số đường: ");
		sugar = Float.parseFloat(nhap.nextLine());
	}
	
	@Override
	public String toString() {
		return "Apple [nhap=" + nhap + ", sugar=" + sugar + ", name=" + name + ", quantity=" + quantity + ", price="
				+ price + "]";
	}
	
	
}
