package shop;
import shop.ShoppingCart;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Store store = new Store();
        ShoppingCart cart = new ShoppingCart();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Available items in the shop!");
        System.out.println("------------------------"); 
        for (int i = 0; i < store.getItems().size(); i++) {
            System.out.println((i + 1) + ". " + store.getItems().get(i));
        }

        while (true) {
            System.out.print("Enter the item ID to add to cart (or 0 to display cart): ");
            int itemId = scanner.nextInt();

            if (itemId == 0) {
                cart.displayCart();
                break;
            }

            Item item = store.getItemById(itemId);
            if (item != null) {
                cart.addItem(item);
                System.out.println(item.getName() + " added to the cart.");
            } else {
                System.out.println("Invalid item ID. Please try again.");
            }
        }

        scanner.close();
    }
}
