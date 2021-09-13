package Library;

import java.util.Scanner;



public class Books {
	Scanner input = new Scanner(System.in);
	
	
	
	private String title;
	private String num_seri;
	private String status;
	private String author;
	private int pages;
	public Books () {
		
	}
	
	public Books(String title, String num_seri, String status, String author, int pages) {
		super();
		this.title = title;
		this.num_seri = num_seri;
		this.status = status;
		this.author = author;
		this.pages = pages;
	}
	
	public void input () {
		System.out.println("Nhập tên sách: ");
		title = input.nextLine();
		System.out.println("Nhập số seri: ");
		num_seri = input.nextLine();
		System.out.println("Nhập trạng thái: ");
		status = input.nextLine();
		System.out.println("Tên tác giả: ");
		author = input.nextLine();
		System.out.println("Nhập số trang: ");
		pages = Integer.parseInt(input.nextLine());
	}

	public void display () {
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "Books [input=" + input + ", title=" + title + ", num_seri=" + num_seri + ", status=" + status
				+ ", author=" + author + ", pages=" + pages + "]";
	}

	public int getPages() {
		return pages;
	}

	public String getTitle() {
		return title;
	}
	public String getNum_seri() {
		return num_seri;
	}
	public String getStatus() {
		return status;
	}
	public String getAuthor() {
		return author;
	}
	
	
	
}
