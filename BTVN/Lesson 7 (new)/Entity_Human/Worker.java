package Entity;

import Entity.Student.Type;
import Singelton.L_Worker;
import Enum.Gender;

public class Worker extends Infor{

	public Worker() {
		
	}
	private String gioiTinh;
	
	/**
	 * @return the gioiTinh
	 */
	public String getGioiTinh() {
		return gioiTinh;
	}

	public Worker(String name, int age, int id, String gioiTinh) {
		super(name, age, id);
		this.gioiTinh = gioiTinh;
	}
	
	public void nhap () {
		super.nhap();
		System.out.println("Nhập giới tinh(1: Nam, 2: Nữ, 3: Khác): ");
		int gtl  = input.nextInt();
		Gender x1 = Gender.gtOf(gtl);
	
		L_Worker.addToList(new Worker ( name,  age, id, x1.gend));
	}
}
