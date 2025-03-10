import java.util.Scanner;
public class Circle {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius");
        int radius = sc.nextInt();
        CircleData circle = new CircleData(radius);
        circle.AreaCircumferenceCalculator(radius);
        sc.close();
    }
}
//defining the circle class
class CircleData{
    int radius;
    //constructor to initialise the details
    public CircleData(int radius){
        this.radius = radius;
    }
    //defining the void type method to calculate the area
    public void AreaCircumferenceCalculator(int radius){
        double area = 3.14*(radius*radius);
        double circumference = 3.14*2*radius;
        System.out.println("area of circle is ");
        System.out.println(area);
        System.out.println("circumference of circle is ");
        System.out.println(circumference);
    }
}

//input 5
//output
// area of circle is 78.5
//circumference of circle is 31.40000000002
