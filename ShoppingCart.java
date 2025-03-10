import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<CartItemDetails> cart = new ArrayList<>();

        // Input item details
        while (true) {
            System.out.print("Enter Item Name (or 'exit' to finish): ");
            String itemName = sc.nextLine();
            if (itemName.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.print("Enter Item Price: ");
            double price = sc.nextDouble();
            System.out.print("Enter Item Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine(); // Consume newline

            // Add item to cart
            cart.add(new CartItemDetails(itemName, price, quantity));
        }

        // Display total cost
        double totalCost = 0;
        for (CartItemDetails item : cart) {
            totalCost += item.totalCost();
        }
        System.out.println("Total Cost: " + totalCost);

        sc.close();
    }
}
// CartItem class to manage shopping cart items
class CartItemDetails {
    String itemName;
    double price;
    int quantity;

    // Constructor to initialize cart item details
    public CartItemDetails(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to calculate total cost
    public double totalCost() {
        return price * quantity;
    }
}
//input
//Enter Item Name (or 'exit' to finish): chips
//Enter Item Price: 20
//Enter Item Quantity: 2
//Enter Item Name (or 'exit' to finish): noodles
//Enter Item Price: 10
//Enter Item Quantity: 2
//Enter Item Name (or 'exit' to finish): exit
//output
//Total Cost: 60.0