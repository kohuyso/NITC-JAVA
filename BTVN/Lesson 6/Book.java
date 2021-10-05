package MB;

import java.util.Scanner;

public class Book {
	Scanner input = new Scanner(System.in);

	protected String name;
	protected String author;
	protected double price;
	protected int quantity;
	protected String method;
	protected int id;
	static private int count;

	public Book() {
	}

	public Book(String author, double price, int quantity, String method, String name) {
		this.author = author;
		this.price = price;
		this.quantity = quantity;
		this.method = method;
		this.name = name;
		this.id = ++count;

	}

	public void nhap() {
		System.out.println("Nhập tên sách");
		name = input.next();
		System.out.println("Nhập tên tác giả: ");
		author = input.next();
		System.out.println("Nhập giá sách: ");
		price = input.nextDouble();
		System.out.println("Nhập số sách: ");
		quantity = input.nextInt();
		System.out.println("Nhập phương thức: ");
		method = input.next();
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
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
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the method
	 */
	public String getMethod() {
		return method;
	}

	/**
	 * @param method the method to set
	 */
	public void setMethod(String method) {
		this.method = method;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

}
