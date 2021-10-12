package Entity_Schedule;

import Entity.Infor.Gender;
import Singelton.L_Hoc;

public class LichHoc extends LichChung {
	
	public LichHoc ( ) {
		super();
	}
	private String lhoc, thoc;
	
	public LichHoc(int id, String lhoc, String thoc) {
		super(id);
		this.lhoc = lhoc;
		this.thoc = thoc;
	}
	
	/**
	 * @return the lhoc
	 */
	public String getLhoc() {
		return lhoc;
	}

	/**
	 * @return the thoc
	 */
	public String getThoc() {
		return thoc;
	}

	enum PhongHoc {
		A101 ("Phòng A101", 1),
		A202 ("Phòng A202", 2),
		A303 ("Phòng A303", 3);
	
		
		public final String toa;
		public int dd;
		private PhongHoc (String toa, int dd) {
			this.toa = toa;
			this.dd = dd;
		}
		
		public static PhongHoc toaOf (int dd) {
			for (PhongHoc e : values()) {
				if (e.dd == dd) {
					return e;
				}
			}
			return null;
		}
	}
	
	public void nhap () {
		System.out.println("Nhap so tiet");
		System.out.println("1. Tiet 1, 2.Tiet 2, 3.Tiet3");
		int tieth = input.nextInt();
		Tiet x2 = Tiet.tietOf(tieth);
		System.out.println("Nhap so phong");
		System.out.println("1. A101, 2.A202, 3.A303");
		int phong = input.nextInt();
		PhongHoc x1 = PhongHoc.toaOf(phong);
		L_Hoc.addToList(new LichHoc (id, x2.tgian, x1.toa));
	}
	
	
	
}
