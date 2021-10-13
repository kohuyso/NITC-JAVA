package Enum;



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
