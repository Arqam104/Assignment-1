import java.util.Scanner;

public class Percentage {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Obtained MArks:");
    Double Om = sc.nextDouble();

    System.out.println("Enter Max Marks:");
    Double Mm = sc.nextDouble();

    Double percentage = (Om / Mm) * 100;
    System.out.println("Percentage:" + percentage + "%");
  }
}