package HamMain;

import java.util.Scanner;

public class MainP {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		showMenu();
		int choose = input.nextInt();
		while (choose != -1) {
			if (choose == 1) {
				System.out.println("1. Nhập thông tin học sinh: ");
				System.out.println("2. Nhập thông tin giáo viên: ");
				System.out.println("3. Nhập thông tin nhân viên: ");
				System.out.println("4. Nhập thông tin lịch trực: ");
				System.out.println("5. Nhập thông tin lịch học: ");
				System.out.println("6. Nhập thông tin học sinh: ");
				System.out.println("7. Nhập thông tin học sinh: ");
				int choose2 = input.nextInt();
				if (choose2 == 1) {
					
				}
				else if (choose2 == 2) {
					
				}
				else if (choose2 == 3) {
				
				}
				else if (choose2 == 4) {
					
				}
				else if (choose2 == 5) {
					
				}
				else if (choose2 == 6) {
					
				}
				else {
					
				}
			}
			else if (choose == 2) {
				System.out.println("Nhập ID: ");
				int ID = input.nextInt();
				System.out.println("1.Thông tin của học sinh:");
				System.out.println("2.Thông tin của học sinh:");
				System.out.println("3.Thông tin của học sinh:");
				int choose2 = input.nextInt();
				if (choose2 == 1) {
					
				}
				else if (choose2 == 2) {
					
				}
				else {
					
				}
			}
			else {
				break;
			}
			
			showMenu();
			choose = input.nextInt();
		}
		
	}
	
	public static void showMenu () {
		System.out.println("1.Nhập thông tin");
		System.out.println("2.In thông tin");
		
	}

}
