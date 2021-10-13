package Singelton;

import java.util.ArrayList;
import java.util.List;

import Entity.Student;
import Entity_Schedule.LichTruc;

public class L_Truc {
	static private List<LichTruc> Lst_Truc = new ArrayList<LichTruc>();
	
	static public List <LichTruc> getInstance () {
		return Lst_Truc;
	}
	
	static public boolean addToList (LichTruc lt) {
		Lst_Truc.add(lt);
		return true;
	}
	
	public void LichTruc () {
		
	}
	
	static public LichTruc getTruc (int id) {
		for (LichTruc i : Lst_Truc) {
			if (i.getId() == id) {
				return i;
			}
		}
		return null;
	}
	
}
