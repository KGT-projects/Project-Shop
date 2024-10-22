package shop;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> cartItems;

    public ShoppingCart() {
        cartItems = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (item != null) {
            cartItems.add(item);
        }
    }

    public void displayCart() {
        if (cartItems.isEmpty()) {
            System.out.println("The shopping cart is empty.");
        } else {
            System.out.println("Shopping Cart Contents:");
            for (Item item : cartItems) {
                System.out.println(item);
            }
        }
    }
}
