package iterator;

import java.util.List;

public class PancakeHouseMenuIterator implements Iterator {
	List<MenuItem> menuItems;
	int index;

	public PancakeHouseMenuIterator(List<MenuItem> menuItems) {
		this.menuItems = menuItems;
		this.index = 0;
	}

	@Override
	public boolean hasNext() {
		return (index < menuItems.size() - 1);
	}

	@Override
	public MenuItem next() {
		index++;
		return menuItems.get(index);
	}
}
