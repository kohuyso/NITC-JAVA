package Library;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_part {
	static Scanner input = new Scanner(System.in); 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList<Books> lst_book = new ArrayList<>();
	ArrayList<Author_tg> lst_Author = new ArrayList<>();


	System.out.println("Ấn 1 để bắt đầu chương trình!");
	int cmd = Integer.parseInt(input.nextLine());
	while (cmd != 5) {
			Show_Command ();
			cmd = Integer.parseInt(input.nextLine());
			if (cmd == 1) {
				System.out.println("Số sách muốn nhập: ");
				int sach = Integer.parseInt(input.nextLine());
				for (int i = 0; i < sach; i+=1) {
					Books book = new Books();
					book.input();
					
					int check = 0;
					for (int j = 0; j < lst_Author.size(); j+=1) {
						if (lst_Author.get(j).getName().equals(book.getAuthor())) {
							check = 1;
							break;
						}
					}
					
					if (check == 0) {
						Author_tg author = new Author_tg ();
						author.inputkh();
						lst_Author.add(author);
					}
					lst_book.add(book);
				}
			}
			else if (cmd == 2) {
				for (Books sachle : lst_book) {
					sachle.display();
				}
			}
			else if (cmd == 3) {
				System.out.println("Số tác giả muốn nhập: ");
				int tacGia = Integer.parseInt(input.nextLine());
				for (int i = 0; i < tacGia; i+=1) {
					Author_tg author = new Author_tg();
					author.inputa(lst_Author);
					lst_Author.add(author);
				}
			}
			else if (cmd == 4) {
				System.out.println("Nhập tên tác giả cần tìm: ");
				String ten_tg = input.nextLine();
				
				for (int i = 0; i < lst_book.size(); i+=1) {
					if (lst_book.get(i).getAuthor().equals(ten_tg)) {
						lst_book.get(i).display();
					}
					else {
						System.out.println("Không có tên tác giả cần tìm.");
					}
				}
			}
			else if (cmd == 5) {
				System.out.println("Done!!");
			}
	}	
		System.out.println(lst_book.size());
	}
	
	
	
	static void Show_Command ( ) {
		System.out.println("1. Nhập thông tin sách");
		System.out.println("2. In thông tin sách");
		System.out.println("3. Nhập thông tin tác giả");
		System.out.println("4. In thông tin sách");
		System.out.println("5. Dừng chương trình");
	}
	
}
