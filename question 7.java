import java.util.Scanner;

public class ODDEVEN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double rem;
        System.out.println("Enter a number:");
        double number = input.nextDouble();
        rem = number % 2;
        if (rem == 0) {
            System.out.println("Number is EVEN");
        } else {
            System.out.println("Numer is ODD");
        }
    }
}