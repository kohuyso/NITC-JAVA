package Singelton;

import java.util.ArrayList;
import java.util.List;

import Entity.Student;
import Entity.Worker;

public class L_Worker {
	static private List<Worker> Lst_nv = new ArrayList<Worker>();
	
	static public List<Worker> getInstance () {
		return Lst_nv;
	}
	
	static public boolean addToList (Worker worker) {
		Lst_nv.add(worker);
		return true;
	}
	
	static public Worker getwk (int id) {
		for (Worker i : Lst_nv) {
			if (i.getId() == id) {
				return i;
			}
		}
		return null;
	}
}
