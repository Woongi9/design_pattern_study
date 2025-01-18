package iterator;

import java.util.ArrayList;
import java.util.List;

public class PancakeHouseMenu {
	List<MenuItem> menuItemList;

	public PancakeHouseMenu() {
		menuItemList = new ArrayList<>();

		addItem("K&B 팬케이크 세트", "스크램블 에그와 토스트가 곁들여진 팬케이크", true, 2.99);
		addItem("레귤러 팬케이크 세트", "달걀 후라이와 소시지가 곁들여진", false, 2.99);
		addItem("블루베리 팬케이크 세트", "신선한 블루베리와 블루베리 시럽으로 만든 팬케이크", true, 3.49);
		addItem("와플", "취향에 따라 블루베리나 딸기 추가 와플", true, 3.59);
	}

	public void addItem(String name, String description,
		boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItemList.add(menuItem);
	}

	// public List<MenuItem> getMenuItemList() {
	// 	return menuItemList;
	// }

	public Iterator createIterator() {
		return new PancakeHouseMenuIterator(menuItemList);
	}
}
