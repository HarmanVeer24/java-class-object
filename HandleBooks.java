import java.util.Scanner;

public class HandleBooks {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter book Title");
        String bookTitle = sc.nextLine();
        System.out.println("Enter book Author");
        String bookAuthor = sc.nextLine();
        System.out.println("Enter book Price");
        int bookPrice = sc.nextInt();
        bookDetails book = new bookDetails(bookTitle,bookAuthor,bookPrice);
        book.displayBookDetails();

        sc.close();
    }
}
//defining the bookDetails class
class bookDetails{
    String bookTitle;
    String bookAuthor;
    int bookPrice;

    //constructor to initialise the details
    public bookDetails(String bookTitle,String bookAuthor,int bookPrice){
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookPrice = bookPrice;
    }
    // display method to display the book information
    public  void displayBookDetails(){
        System.out.println("Title of books is: "+bookTitle);
        System.out.println("Author of books is: "+bookAuthor);
        System.out.println("Price of books is: "+bookPrice);
    }
}
//input
//Enter book Title
//Six Of Crows
//Enter book Author
//Leigh Bardugo
//Enter book Price
//500
//output
//Title of books is: Six Of Crows
//Author of books is: Leigh Bardugo
//Price of books is: 500
