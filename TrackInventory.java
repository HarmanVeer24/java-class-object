import java.util.Scanner;

public class TrackInventory {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ItemCode");
        int ItemCode = sc.nextInt();
        System.out.println("Enter the ItemName");
        String ItemName = sc.next();
        System.out.println("Enter Item price");
        int ItemPrice = sc.nextInt();
        System.out.println("Enter the quantity of product");
        int quantity = sc.nextInt();
        ItemDetails item = new ItemDetails(ItemCode,ItemName,ItemPrice);
        item.displayBookDetails(quantity);

        sc.close();
    }
}
//defining the ItemDetails class
class ItemDetails{
    int ItemCode;
    String ItemName;
    int ItemPrice;

    //constructor to initialise the details
    public ItemDetails(int ItemCode,String ItemName,int ItemPrice){
        this.ItemCode = ItemCode;
        this.ItemName = ItemName;
        this.ItemPrice = ItemPrice;
    }
    // display method to display the Item details and calculate the total price
    public  void displayBookDetails(int quantity){
        System.out.println("The code of item is: "+ItemCode);
        System.out.println("The name of item is: "+ItemName);
        System.out.println("Price of item is: "+ItemPrice);
        System.out.println("Total price according to quantity is: "+quantity*ItemPrice);
    }
}
//input
//Enter the ItemCode
//4
//Enter the ItemName
//        chips
//Enter Item price
//20
//Enter the quantity of product
//3
//output
//The code of item is: 4
//The name of item is: chips
//Price of item is: 20
//Total price according to quantity is: 60

