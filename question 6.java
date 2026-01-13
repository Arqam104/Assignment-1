import java.util.Scanner;

public class trapezoidarea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double K;
        System.out.println("Enter first parallel side:");
        double a = input.nextDouble();
        System.out.println("Enter second parallel side:");
        double b = input.nextDouble();
        System.out.println("Enter height :");
        double h = input.nextDouble();
        K = h * (a + b) / 2;
        System.out.println("The area of trapezoid is:" + K);
    }
}