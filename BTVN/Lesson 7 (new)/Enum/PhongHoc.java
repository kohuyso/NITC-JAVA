package Enum;



public enum PhongHoc {
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
