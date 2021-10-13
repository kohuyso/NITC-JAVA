package HamMain;

import java.util.Scanner;

import Entity.Lecture;
import Entity.Student;
import Entity.Worker;
import Entity_Schedule.LichHoc;
import Entity_Schedule.LichTruc;
import Singelton.L_Hoc;
import Singelton.L_Lecture;
import Singelton.L_Student;
import Singelton.L_Truc;
import Singelton.L_Worker;

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
				int choose2 = input.nextInt();
				if (choose2 == 1) {
					Student hs = new Student ();  
					hs.nhap();
				}
				else if (choose2 == 2) {
					Lecture gv = new Lecture ();
					gv.nhap();
				}
				else if (choose2 == 3) {
					Worker nv = new Worker ();
					nv.nhap();
				}
				else if (choose2 == 4) {
					LichTruc lt = new LichTruc ();
					lt.nhap();
				}
				else if (choose2 == 5) {
					LichHoc lh = new LichHoc ();
					lh.nhap();
				}
			}
			else if (choose == 2) {
				System.out.println("Nhập ID: ");
				int ID = input.nextInt();
				System.out.println("1.Thông tin của học sinh:");
				System.out.println("2.Thông tin của giao vien:");
				System.out.println("3.Thông tin của nhan vien:");
				int choose2 = input.nextInt();
				if (choose2 == 1) {
					if (L_Student.getHS(ID) != null) {
						System.out.println(L_Student.getHS(ID).getId());
						System.out.println(L_Student.getHS(ID).getName());
						System.out.println(L_Student.getHS(ID).getAge());
						System.out.println(L_Student.getHS(ID).getGioiTinh());
						System.out.println(L_Student.getHS(ID).getType());
						
						if (L_Hoc.getLHoc(ID) != null) {
							System.out.println(L_Hoc.getLHoc(ID).getId());
							System.out.println(L_Hoc.getLHoc(ID).getLhoc());
							System.out.println(L_Hoc.getLHoc(ID).getThoc());
						}

					}
				}
				else if (choose2 == 2) {
					System.out.println(L_Lecture.getGV(ID).getName());
					System.out.println(L_Lecture.getGV(ID).getAge());
					System.out.println(L_Lecture.getGV(ID).getId());
					System.out.println(L_Lecture.getGV(ID).getGt());
					
					if (L_Hoc.getLHoc(ID) != null) {
						System.out.println(L_Hoc.getLHoc(ID).getId());
						System.out.println(L_Hoc.getLHoc(ID).getLhoc());
						System.out.println(L_Hoc.getLHoc(ID).getThoc());
					}

				}
				else {
					System.out.println(L_Worker.getwk(ID).getId());
					System.out.println(L_Worker.getwk(ID).getName());
					System.out.println(L_Worker.getwk(ID).getAge());
					System.out.println(L_Worker.getwk(ID).getGioiTinh());
					
					if (L_Truc.getTruc(ID) == null) {
						System.out.println(L_Truc.getTruc(ID).getId());
						System.out.println(L_Truc.getTruc(ID).getLhoc());
						System.out.println(L_Truc.getTruc(ID).getLhoc());
					}
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
