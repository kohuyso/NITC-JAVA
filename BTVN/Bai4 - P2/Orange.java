package Lesson_5;

import java.util.Scanner;

public class Orange extends HoaQua {
	private float weight;
	Scanner nhap = new Scanner(System.in);

	public Orange() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Orange(String name, int quantity, float price, float weight) {
		super(name, quantity, price);
		// TODO Auto-generated constructor stub
		this.weight = weight;
	}

	/**
	 * @return the weight
	 */
	public float getWeight() {
		return weight;
	}
	
	public void input () {
		super.input();
		System.out.println("Nhập khối lượng: ");
		weight = Float.parseFloat(nhap.nextLine());
	}

	@Override
	public String toString() {
		return "Orange [weight=" + weight + ", name=" + name + ", quantity=" + quantity + ", price=" + price + ", nhap="
				+ nhap + "]";
	}

}
