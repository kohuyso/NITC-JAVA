package Entity;

import Singelton.L_Student;
import Enum.Gender;
import Enum.Type;

public class Student extends Infor{
	public Student() {
		
	}
	private String type;
	private String gioiTinh;
	public Student(String name, int age, int id, String vt, String gioiTinh) {
		super(name, age, id);
		this.type = vt;
		this.gioiTinh = gioiTinh;
	}
	
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @return the gioiTinh
	 */
	public String getGioiTinh() {
		return gioiTinh;
	}

	
	public void nhap () {
		super.nhap();
		System.out.println("Nhập hệ học(1.Chính quy, 2.Liên thông, 3.Tại chức):");
		int dd = input.nextInt();
		Type x = Type.vtOf(dd);
		System.out.println("Nhập giới tinh(1: Nam, 2: Nữ, 3: Khác): ");
		int gtl  = input.nextInt();
		Gender x1 = Gender.gtOf(gtl);
	
		L_Student.addToList(new Student ( name,  age, id, x1.gend  ,x.vt));
	}
}
