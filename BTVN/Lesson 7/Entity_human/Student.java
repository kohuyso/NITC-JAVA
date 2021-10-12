package Entity;

import Entity.Infor.Gender;
import Singelton.L_Student;

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

	public enum Type {
		CQUY ("Chính quy", 1), 
		LTHONG ("Liên thông", 2),
		TCHUC ("Tại chức", 3);
		
	
		
		public final String vt;
		public int dd;
		private Type (String vt, int dd) {
			this.dd = dd;
			this.vt = vt;
		}
		
		public static Type vtOf (int dd) {
			for (Type e : values()) {
				if (e.dd == dd) {
					return e;
				}
			}
			return null;
		}
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
