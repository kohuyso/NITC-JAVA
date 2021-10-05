package MB;

import java.util.ArrayList;
import java.util.List;

public class InventoryB {
	static private List<Book> inventory = new ArrayList<Book>();

	private InventoryB() {

	}

	static public List<Book> getInstance() {
		return inventory;
	}

	static public boolean addToInventory(Book book) {
		inventory.add(book);
		return true;
	}

	static public boolean isValid(int id) {
		for (Book i : inventory) {
			if (i.getId() == id) {
				return true;
			}
		}
		return false;
	}

	public static Book getBook(int id) {
		return inventory.get(id - 1);
	}

}
