package shop;

import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;

public class Store {
    private List<Item> items;

    public Store() {
        items = new ArrayList<>();
        items.add(new Item("Soap",BigDecimal.valueOf(2.35)));
        items.add(new Item("Bread",BigDecimal.valueOf(1.96)));
        items.add(new Item("Cheese",BigDecimal.valueOf(3.25)));
        items.add(new Item("Ice cream",BigDecimal.valueOf(4.25)));
        items.add(new Item("Juice",BigDecimal.valueOf(2.45)));
        items.add(new Item("Milk",BigDecimal.valueOf(1.55)));
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
