package Entity;

import Entity.Infor.Gender;
import Singelton.L_Worker;

public class Lecture extends Infor {

	public Lecture() {
		super();
	}
	String gt;
	public Lecture(String name, int age, int id, String gt) {
		super(name, age, id);
		this.gt = gt;
	}
	
	/**
	 * @return the gt
	 */
	public String getGt() {
		return gt;
	}

	public void nhap () {
		super.nhap();
		System.out.println("Nhập giới tinh(1: Nam, 2: Nữ, 3: Khác): ");
		int gtl  = input.nextInt();
		Gender x1 = Gender.gtOf(gtl);
	
		L_Worker.addToList(new Worker ( name,  age, id, x1.gend));
	}
	

}
