package Singelton;

import java.util.ArrayList;
import java.util.List;

import Entity.Student;
import Entity_Schedule.LichHoc;

public class L_Hoc {
	static private List<LichHoc> Lst_Hoc = new ArrayList<LichHoc>(); 
	
	static public List<LichHoc> getInstance () {
		return Lst_Hoc;
	}
	
	static public boolean addToList (LichHoc lh) {
		Lst_Hoc.add(lh);
		return true;
	}
	
	static public LichHoc getLHoc (int id) {
		for (LichHoc i : Lst_Hoc) {
			if (i.getId() == id) {
				return i;
			}
		}
		return null;
	}
}
