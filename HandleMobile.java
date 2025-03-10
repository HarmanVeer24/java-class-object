import java.util.Scanner;

public class HandleMobile {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Mobile Brand");
        String MobileBrand = sc.nextLine();
        System.out.println("Enter the Mobile model");
        String MobileModel = sc.nextLine();
        System.out.println("Enter Mobile price");
        int MobilePrice = sc.nextInt();
        MobileDetails mobile = new MobileDetails(MobileBrand,MobileModel,MobilePrice);
        mobile.displayMobileDetails();

        sc.close();
    }
}
//defining the MobileDetails class
class MobileDetails{
    String MobileBrand;
    String MobileModel;
    int MobilePrice;

    //constructor to initialise the details
    public MobileDetails(String MobileBrand,String MobileModel,int MobilePrice){
        this.MobileBrand=MobileBrand;
        this.MobileModel=MobileModel;
        this.MobilePrice=MobilePrice;
    }
    // display method to display the Mobile details
    public void displayMobileDetails(){
        System.out.println("Mobile brand is: "+MobileBrand);
        System.out.println("Mobile model is : "+MobileModel);
        System.out.println("Price of mobile is: "+MobilePrice);
    }
}
//input
//Enter the Mobile Brand
//Apple
//Enter the Mobile model
//iphone 15
//Enter Mobile price
//60000
//output
//Mobile brand is: Apple
//Mobile model is : iphone 15
//Price of mobile is: 60000
