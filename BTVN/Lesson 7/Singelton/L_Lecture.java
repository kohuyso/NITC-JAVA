package Singelton;

import java.util.ArrayList;
import java.util.List;

import Entity.Lecture;
import Entity.Student;

public class L_Lecture {
	static private List<Lecture> Lst_gv = new ArrayList<Lecture>();
	
	static public List <Lecture> getInstance () {
		return Lst_gv;
	}
	
	static public boolean addToList (Lecture lecture) {
		Lst_gv.add(lecture);
		return true;
	}
	
	static public Lecture getGV (int id) {
		for (Lecture i : Lst_gv) {
			if (i.getId() == id) {
				return i;
			}
		}
		return null;
	}
}
