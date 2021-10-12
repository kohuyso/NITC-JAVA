package Singelton;

import java.util.ArrayList;
import java.util.List;
import Entity.Student;

public class L_Student {
	static private List <Student> Lst_hs = new ArrayList<Student>();
	
	static public List <Student> getInstance () {
		return Lst_hs;
	}
	
	
	
	static public boolean addToList (Student student) {
		Lst_hs.add(student);
		return true;
	}
	
	static public Student getHS (int id) {
		for (Student i : Lst_hs) {
			if (i.getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	
}
