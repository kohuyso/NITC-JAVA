package BT2;

import java.util.ArrayList;
import java.util.List;

public class Inventory extends Hoaqua {
	static private List<Hoaqua> inventory = new ArrayList<>();
	private Inventory() {
		
	}
	
	static public List <Hoaqua> getInstance() {
		return inventory;
	}
	
	static public boolean addtoInventory (Hoaqua hoaqua) {
		inventory.add(hoaqua);
		return true;
	}
	
	static public boolean isValid (int id) {
		for (Hoaqua i : inventory) {
			if (i.getId() == id) {
				return true;
			}
		}
		return false;
	}
	
	public static Hoaqua getFruit (int id) {
		return inventory.get(id-1);
	}

	@Override
	public void Vitamin() {
		// TODO Auto-generated method stub
		
	}
}
