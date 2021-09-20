package Lesson_5;

import java.util.Scanner;

public class HoaQua {
	protected String name;
	protected int quantity;
	protected float price;

	Scanner nhap = new Scanner(System.in);

	public HoaQua() {

	}

	public HoaQua(String name, int quantity, float price) {
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}

	

	public void input() {
		System.out.println("Nhập tên loại quả: ");
		name = nhap.next();
		System.out.println("Nhập số lượng: ");
		quantity = nhap.nextInt();
		System.out.println("Nhập giá của 1 cân: ");
		price = nhap.nextFloat();
	}

	@Override
	public String toString() {
		return "HoaQua [name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
	}

	public void display() {
		System.out.println(toString());
	}
}
