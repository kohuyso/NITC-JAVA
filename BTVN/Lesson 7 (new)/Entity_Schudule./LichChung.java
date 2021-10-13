package Entity_Schedule;

import java.util.Scanner;

abstract public class LichChung {
	Scanner input = new Scanner(System.in);
	protected int id;
	static private int count;

	public LichChung(int id) {
		this.id = id;
		id = ++count;
	}

	public LichChung() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

}
