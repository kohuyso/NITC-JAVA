package Entity_Schedule;

import Entity.Infor.Gender;
import Entity_Schedule.LichChung.Tiet;
import Entity_Schedule.LichHoc.PhongHoc;
import Singelton.L_Truc;

public class LichTruc extends LichChung {
	private String lhoc, thoc;

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
	public LichTruc () {	
	}
	public LichTruc(int id, String lhoc, String thoc) {
		super(id);
		this.lhoc = lhoc;
		this.thoc = thoc;
	}



	enum positionL {
		A1("Tòa A1", 1), A2("Tòa A2", 2), B("Tòa B", 3);

		public final String truc;
		public int dd;

		private positionL(String truc, int dd) {
			this.truc = truc;
			this.dd = dd;
		}

		public static positionL trucOf(int dd) {
			for (positionL e : values()) {
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
		positionL x1 = positionL.trucOf(phong);
		L_Truc.addToList(new LichTruc (id, x2.tgian, x1.truc));
	}

}
