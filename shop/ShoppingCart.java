package shop;

import java.util.ArrayList;
import java.math.BigDecimal;
import java.util.List;

public class ShoppingCart {
    private List<Item> cartItems;

    public ShoppingCart() {
        cartItems = new ArrayList<>();
    }
    
    public BigDecimal total = BigDecimal.valueOf(0);
    
   

    public void addItem(Item item) {
        if (item != null) {
            cartItems.add(item);
            total = total.add(item.getPrice());
            
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
            System.out.print("\nThe total price of everything in your cart is : $");
            System.out.print(total);
        }
    }
}
