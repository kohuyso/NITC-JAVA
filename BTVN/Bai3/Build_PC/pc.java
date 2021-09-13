package practice1_mt;

import java.util.ArrayList;
import java.util.Scanner;

public class pc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		
		ArrayList<Hang> lst_Hang = new ArrayList<Hang>();
		System.out.println("Nhập số lượng hãng máy tính: ");
		int num_Hang = input.nextInt();
		input.nextLine();
		for (int i = 0; i < num_Hang; i+=1) {
			System.out.println("Nhập hãng máy: ");
			String s = input.nextLine();
			lst_Hang.add(new Hang(s));
		}
		
		ArrayList<CPU> lst_CPU = new ArrayList<CPU>();
		System.out.println("Nhập số lượng CPU: ");
		int num_CPU = input.nextInt();
		input.nextLine();
		for (int i = 0; i < num_CPU; i+=1) {
			System.out.println("Nhập tên CPU: ");
			String s = input.nextLine();
			lst_CPU.add(new CPU(s));
		}
		
		ArrayList<RAM> lst_RAM = new ArrayList<RAM> ();
		System.out.println("Nhập số lượng Ram: ");
		int num_Ram = input.nextInt();
		input.nextLine();
		for (int i = 0; i < num_Ram; i+=1) {
			System.out.println("Nhập tên Ram: ");
			String s = input.next();
			System.out.println("Nhập mã hãng: ");
			
			int n = input.nextInt();
			lst_RAM.add(new RAM(s, lst_Hang.get(n)));
		}
		
		ArrayList<Mainboard> lst_Mb = new ArrayList<Mainboard> ();
		System.out.println("Nhập số lượng Main: ");
		int num_mb = input.nextInt();
		input.nextLine();
		for (int i = 0; i < num_mb; i+=1) {
			System.out.println("Nhập tên Main: ");
			System.out.println("Nhập mã hãng: ");
			String s = input.next();
			int n = input.nextInt();
			lst_Mb.add(new Mainboard(s, lst_Hang.get(n)));
		}
		
		
		ArrayList<Build_pc> lst_PC = new ArrayList<Build_pc> ();
		System.out.println(lst_PC.size());
		System.out.println("Chọn hãng để build PC: ");
		for (int i = 0; i < num_Hang; i+=1) {
			System.out.println(i + ": " + lst_Hang.get(i));
		}
		int chon1 = input.nextInt();
		input.nextLine();
		System.out.printf("%s",lst_Hang.get(chon1).getName());
		
		
		System.out.println("Chọn CPU: ");
		for (int i = 0; i < num_CPU; i+=1) {
			System.out.println(i + ": " + lst_CPU.get(i));
		}
		int chon2 = input.nextInt();
		input.nextLine();
		System.out.printf("%s",lst_CPU.get(chon2).getName());
		
		
		System.out.println("Chọn RAM: ");
		for (int i = 0; i < num_Ram; i+=1) {
			System.out.println(i + ": " + lst_RAM.get(i));
		}
		int chon3 = input.nextInt();
		input.nextLine();
		System.out.printf("%s",lst_RAM.get(chon3).getName());
		
		System.out.println("Chọn mainboard: ");
		for (int i = 0; i < num_CPU; i+=1) {
			System.out.println(i + ": " + lst_Mb.get(i));
		}
		int chon4 = input.nextInt();
		input.nextLine();
		System.out.printf("%s",lst_Mb.get(chon4).getName());
		
		lst_PC.add(new Build_pc(lst_Hang.get(chon1), lst_CPU.get(chon2), lst_RAM.get(chon3), lst_Mb.get(chon4)));
		for (int i = 0; i < lst_PC.size(); i+=1) {
			lst_PC.get(i).display();
		}
		
		System.out.println(lst_PC.size());
	}


}
	
