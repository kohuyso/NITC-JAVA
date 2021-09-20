package Lesson_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class HamMain {
	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);

		int choose = 0;
		ArrayList<Apple> lst_A = new ArrayList<>();
		ArrayList<Banana> lst_B = new ArrayList<>();
		ArrayList<Orange> lst_O = new ArrayList<>();
		while (choose != 9) {
			System.out.println("1 - Nhập dữ liệu hoa quả");
			System.out.println("2 - Mua hàng");
			System.out.println("9 - Exit");
			choose = Integer.parseInt(nhap.nextLine());

			if (choose == 1) {
				System.out.println("Loại hoa quả muốn nhập: ");
				System.out.println("1 - Táo ");
				System.out.println("2 - Chuối ");
				System.out.println("3 - Cam ");

				int choose1 = Integer.parseInt(nhap.nextLine());
				if (choose1 == 1) {
					Apple tao = new Apple();
					tao.input();
					tao.display();
					lst_A.add(tao);
				} else if (choose1 == 2) {
					Banana chuoi = new Banana();
					chuoi.input();
					chuoi.display();
					lst_B.add(chuoi);
				} else {
					Orange cam = new Orange();
					cam.input();
					cam.display();
					lst_O.add(cam);
				}

			} else if (choose == 2) {
				//
				Collections.sort(lst_A, new Comparator<Apple>() {

					@Override
					public int compare(Apple o1, Apple o2) {
						return (int) (o1.getPrice() - o2.getPrice());
					}

				});
				Collections.sort(lst_O, new Comparator<Orange>() {

					@Override
					public int compare(Orange o1, Orange o2) {
						return (int) (o1.getPrice() - o2.getPrice());
					}

				});
				Collections.sort(lst_B, new Comparator<Banana>() {

					@Override
					public int compare(Banana o1, Banana o2) {
						return (int) (o1.getPrice() - o2.getPrice());
					}

				});

				System.out.println("Nhập ngân sách: ");
				float budget = nhap.nextFloat();
				System.out.println("Chọn loại quả muốn mua: ");
				System.out.println("1 - Táo ");
				System.out.println("2 - Chuối ");
				System.out.println("3 - Cam ");

				int choose1 = nhap.nextInt();
				if (choose1 == 1) {
					for (int i = 0; i < lst_A.size(); i += 1) {

						if (budget > lst_A.get(i).getPrice() * lst_A.get(i).getQuantity()) {
							budget -= lst_A.get(i).getPrice() * lst_A.get(i).getQuantity();
							System.out.println(lst_A.get(i).getQuantity() + " " + lst_A.get(i).getName());
						} else {
							int ahuhu = (int)(budget/lst_A.get(i).getPrice());
							System.out.println(ahuhu + " " + lst_A.get(i).getName());
							budget -= (int)(ahuhu * lst_A.get(i).getPrice());
							System.out.println("Số tiền dư: ");
							break;
						}
	
					}
					System.out.println(budget);
				} else if (choose1 == 2) {
					for (int i = 0; i < lst_B.size(); i += 1) {

						if (budget > lst_B.get(i).getPrice() * lst_B.get(i).getQuantity()) {
							budget -= lst_B.get(i).getPrice() * lst_B.get(i).getQuantity();
							System.out.println(lst_B.get(i).getQuantity() + lst_B.get(i).getName());
						} else {
							int ahuhu = (int)(budget/lst_B.get(i).getPrice());
							System.out.println(ahuhu + lst_B.get(i).getName());
							budget -= (ahuhu * lst_B.get(i).getPrice());
							System.out.println("Số tiền dư: ");
							
							break;
						}

					}
					System.out.println(budget);

				} else {
					for (int i = 0; i < lst_O.size(); i += 1) {

						if (budget > lst_O.get(i).getPrice() * lst_O.get(i).getQuantity()) {
							budget -= lst_O.get(i).getPrice() * lst_O.get(i).getQuantity();
							System.out.println(lst_O.get(i).getQuantity() + lst_O.get(i).getName());
						} else {
							int ahuhu = (int)(budget/lst_O.get(i).getPrice());
							System.out.println(ahuhu + lst_O.get(i).getName());
							budget -= (ahuhu * lst_O.get(i).getPrice());
							System.out.println("Số tiền dư: ");
	
							break;
						}

					}
					System.out.println(budget);
				}
			}
		}
	}
}
