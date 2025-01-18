package iterator;

public class Waitress {
	PancakeHouseMenu pancakeHouseMenu;
	DinerMenu dinerMenu;

	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}

	public void printMenu() {
		Iterator pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
		Iterator dinerMenuIterator = dinerMenu.createIterator();

		System.out.println("------아침 메뉴------");
		printMenu(pancakeHouseMenuIterator);
		System.out.println();
		System.out.println("------점심 메뉴------");
		printMenu(dinerMenuIterator);
	}

	private void printMenu(Iterator menuIterator) {
		while (menuIterator.hasNext()) {
			MenuItem menuItem = menuIterator.next();
			System.out.println(menuItem.getName());
			System.out.println(menuItem.getDescription());
			System.out.println(menuItem.getVegetarian());
			System.out.println(menuItem.getPrice());
		}
	}
}
