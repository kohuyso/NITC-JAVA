package Enum;



public enum positionL {
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
