import java.util.*;
public class Main{

    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Radius of circle ");
        double r = sc.nextDouble();
        double Circumference = 2*Math.PI*r;
        double Area = Math.PI*r*r;
        System.out.println("Circumference of circle is" + Circumference );
        System.out.println("Area of circle is" +  Area);
    }
}