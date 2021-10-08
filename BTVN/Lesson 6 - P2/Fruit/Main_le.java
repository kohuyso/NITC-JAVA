package BT2;

import java.util.List;
import java.util.Scanner;

public class Main_le {

	static Scanner input = new Scanner (System.in);

	public static void main(String[] args) {

		System.out.println("Nhập yêu cầu: ");
		showMenu();
		int choose = input.nextInt();
		List<Hoaqua> LstFruit = Inventory.getInstance();
		while (choose != -1) {

			if (choose == 1) {
				System.out.println("Nhập loại quả:");
				System.out.println("1. Táo.");
				System.out.println("2. Chuối.");
				System.out.println("3. Cam.");
				int chooseS = input.nextInt();
				if (chooseS == 1) {
					Tao apple = new Tao();
					apple.nhap();
					apple.Vitamin();
				} else if (chooseS == 2) {
					Chuoi banana = new Chuoi ();
					banana.nhap();
				
				} else if (chooseS == 3) {
					Cam cam = new Cam ();
					cam.nhap();
				}
			}

			else if (choose == 2) {

				for (Hoaqua i : LstFruit) {
					System.out.println(i.getId() + "  " + i.getName() + "  " + i.getQuantity());
					i.Vitamin();
				}
			}

			else if (choose == 3) {

				System.out.println("Danh sách sách");
				for (Hoaqua i : LstFruit) {
					System.out.println(i.getId() + "  " + i.getName() + "  " + i.getQuantity());
				}
				int ma, quantity;
				ma = input.nextInt();
				quantity = input.nextInt();

				System.out.print("Check với kho: ");

				if (Cart.addToCart(ma, quantity) == true) {
					System.out.println("Thêm vào rỏ hàng thành công!");
				}

				else {
					System.out.println("Thêm vào rỏ hàng thất bại!");
				}

				for (Hoaqua i : LstFruit) {
					System.out.println(i.getId() + "  " + i.getName() + "  " + i.getQuantity());
				}

			}
			else if (choose == 4) {
				
			}

			else if (choose == -1) {
				break;
			}

			else {
				System.out.println("Nhập sai: Nhập lại");
			}

			showMenu();
			choose = input.nextInt();
		}

	}

	static void showMenu() {
		System.out.println("1. Nhập thông tin hoa quả.");
		System.out.println("2. In ra danh sách hiện có.");
		System.out.println("3. Mua hoa qu.");
		System.out.println("-1. Để thoát chương trình");
	}


}
