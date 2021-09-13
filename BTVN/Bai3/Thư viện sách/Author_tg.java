package Library;

import java.util.ArrayList;
import java.util.Scanner;

public class Author_tg {
	
	Scanner input = new Scanner(System.in);
	
	private String name;
	private int yob;
	private String email;
	
	
	
	



	public Author_tg(String name) {
		super();
		this.name = name;
	}



	public Author_tg(String name, int yob, String email) {
		super();
		this.name = name;
		this.yob = yob;
		this.email = email;
	}



	public Author_tg() {
		// TODO Auto-generated constructor stub
	}

	  
	public void inputa (ArrayList<Author_tg> lst_Author) {
		System.out.println("Nhập tên tác giả: ");
		name = input.nextLine ();
		inputkh ();
		
	}

	public void inputkh (	) {
	
		System.out.println("Năm sinh: ");
		yob = Integer.parseInt(input.nextLine());
		System.out.println("Địa chỉ email: ");
		email = input.nextLine();
		
	}
	
	@Override
	public String toString() {
		return "Author_tg [name=" + name + ", yob=" + yob + ", email=" + email + "]";
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @return the yob
	 */
	public int getYob() {
		return yob;
	}

	/**
	 * @return the emai
	 */
	public String getEmail() {
		return email;
	}
	
	
	
}
