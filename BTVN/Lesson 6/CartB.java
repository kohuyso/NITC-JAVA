package MB;

import java.util.HashMap;
import java.util.Map;

public class CartB {

	static private Map<Integer, Integer> cart = new HashMap<Integer, Integer>();

	static public Map<Integer, Integer> getInstance() {
		return cart;
	}

	static public boolean addToCart(int id, int quantity) {
		if (InventoryB.isValid(id) == false) {
			return false;
		}

		Book temp = InventoryB.getBook(id);
		System.out.println(temp.getQuantity());
		if (temp.getQuantity() < quantity) {
			return false;
		} else {
			int oldQuantity = temp.getQuantity();
			temp.setQuantity(oldQuantity - quantity);
		}

		if (cart.containsKey(id)) {
			int oldQuantity = cart.get(id);
			cart.put(id, oldQuantity + quantity);
		} else {
			cart.put(id, quantity);
		}
		return true;

	}
}
