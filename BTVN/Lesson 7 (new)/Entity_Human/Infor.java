package Entity;

import java.util.Scanner;



abstract public class Infor {
	Scanner input = new Scanner (System.in);
	
	protected String name;
	protected int age;
	protected int id;
	static private int count;
	
	public Infor () {
		
	}
	
	public Infor(String name, int age, int id) {

		this.name = name;
		this.age = age;
		this.id = ++count;
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
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	public void nhap () {
		System.out.println("Nhập tên: ");
		name = input.next();
		System.out.println("Nhập tuổi: ");
		age = input.nextInt();
		
		
	}
	
}
