package Enum;



public enum Tiet {
	TIET1 (1, "7h00' - 8h00'"),
	TIET2 (2, "8h10' - 9h10'"),
	TIET3 (3, "9h20' - 10h20'");

	
	public final String tgian;
	public final int tietThu;
	private Tiet (int tietThu, String tgian) {
		this.tietThu = tietThu;
		this.tgian = tgian;
	}

	public static Tiet tietOf (int tietThu) {
		for (Tiet e : values()) {
			if (e.tietThu == tietThu) {
				return e;
			}
		}
		return null;
	}
}