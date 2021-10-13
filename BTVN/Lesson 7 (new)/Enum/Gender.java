package Enum;



public enum Gender {
	NAM("Nam",1),
	NU("Nữ",2),
	OTHER("Khác",3);

	
	public final String gend;
	public int gt;
	private Gender (String gend, int gt) {
		this.gend = gend;
		this.gt = gt;
	}
	
	public static Gender gtOf (int gt) {
		for (Gender e : values()) {
			if (e.gt == gt) {
				return e;
			}
		}
		return null;
	}
}
