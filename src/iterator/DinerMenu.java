package iterator;

public class DinerMenu {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;

	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];

		addItem("채식주의자용 BLT", "통밀 위에 베이컨, 상추, 토마토 얹은 메뉴", false, 2.99);
		addItem("BLT", "통밀 위에 상추, 토마토 얹은 메뉴", false, 2.99);
		addItem("오늘의 수프", "감자 샐러드를 곁들인 오늘의 스프", false, 3.29);
		addItem("핫도그", "사워크림, 양념, 양파, 치즈가 곁들여진 핫도그", false, 3.05);
	}

	public void addItem(String itemName, String description,
		boolean vegan, double price) {
		MenuItem menuItem = new MenuItem(itemName, description, vegan, price);
		if (numberOfItems >= MAX_ITEMS) {
			System.out.println("메뉴가 꽉차서 더 추가할 수 없습니다.");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems++;
		}
	}

	// public MenuItem[] getMenuItems() {
	// 	return menuItems;
	// }

	public Iterator createIterator() {
		return new DinerMenuIterator(menuItems);
	}
}
