package BT2;

import java.util.Scanner;

public abstract class Hoaqua {
	Scanner input = new Scanner (System.in);
	
	private int id;
	protected int quantity;
	protected double price;
	protected String name;
	static private int count;

	public Hoaqua() {

	}
	public void nhap () {
		System.out.println("Nhập tên loại quả: ");
		name = input.next();
		System.out.println("Nhập số lượng: ");
		quantity = input.nextInt();
		System.out.println("Nhập giá của 1 cân: ");
		price = input.nextFloat();
	}
	public abstract void Vitamin();

	public Hoaqua(String name, int quantity, double pice) {
		this.quantity = quantity;
		this.price = price;
		this.name = name;
		this.id = ++count;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * 
	 * /**
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

}
