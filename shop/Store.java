package shop;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Item> items;

    public Store() {
        items = new ArrayList<>();
        items.add(new Item("Soap", 2.35));
        items.add(new Item("Bread", 1.96));
        items.add(new Item("Cheese", 3.25));
        items.add(new Item("Ice cream", 4.25));
        items.add(new Item("Juice", 2.45));
        items.add(new Item("Milk", 1.55));
    }

    public List<Item> getItems() {
        return items;
    }

    public Item getItemById(int id) {
        if (id >= 1 && id <= items.size()) {
            return items.get(id - 1);
        }
        return null;
    }
}
