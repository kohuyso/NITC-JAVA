package MB;

import java.util.List;
import java.util.Scanner;

public class HamMain {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Nhập yêu cầu: ");
		showMenu();
		int choose = input.nextInt();
		List<Book> LstBook = InventoryB.getInstance();
		while (choose != -1) {

			if (choose == 1) {
				System.out.println("Nhập loại quả:");
				System.out.println("1. Sách Ngữ văn.");
				System.out.println("2. Sách Khoa học.");
				System.out.println("3. Sách Ngoại văn.");
				System.out.println("4. Thêm số lượng sách");
				int chooseS = input.nextInt();
				if (chooseS == 1) {
					Literature nguVan = new Literature();
					nguVan.nhap();
				} else if (chooseS == 2) {
					Science khoaHoc = new Science();
					khoaHoc.nhap();
				} else if (chooseS == 3) {
					Foreign ngoaiNgu = new Foreign();
					ngoaiNgu.nhap();
				}
			}

			else if (choose == 2) {

				for (Book i : LstBook) {
					System.out.println(i.getId() + "  " + i.getName() + "  " + i.getQuantity());
				}
			}

			else if (choose == 3) {

				System.out.println("Danh sách sách");
				for (Book i : LstBook) {
					System.out.println(i.getId() + "  " + i.getName() + "  " + i.getQuantity());
				}
				int ma, quantity;
				ma = input.nextInt();
				quantity = input.nextInt();

				System.out.print("Check với kho: ");

				if (CartB.addToCart(ma, quantity) == true) {
					System.out.println("Thêm vào rỏ hàng thành công!");
				}

				else {
					System.out.println("Thêm vào rỏ hàng thất bại!");
				}

				for (Book i : LstBook) {
					System.out.println(i.getId() + "  " + i.getName() + "  " + i.getQuantity());
				}

			}
			
			else if (choose == 4) {
				System.out.println("Nhập id loại sách muốn thêm!");
				int idB = input.nextInt();
				System.out.println("Nhập số lượng sách muốn thêm!");
				int quantityAdd = input.nextInt();
				if (InventoryB.addQuantity(idB, quantityAdd) == true) {
					System.out.println("Thêm sách vào kho thành công");
				}
				else {
					System.out.println("Không tìm thấy loại sách cần thêm - Sách chưa tồn tại");
				}
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
		System.out.println("1. Nhập thông tin sách.");
		System.out.println("2. In ra danh sách hiện có.");
		System.out.println("3. Mua sách.");
		System.out.println("-1. Để thoát chương trình");
	}

}
