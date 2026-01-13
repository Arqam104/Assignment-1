import java.util.Scanner;

public class salesseason {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double dsp, discount;
        System.out.println("Enter orignal price:");
        Double orignal = input.nextDouble();
        System.out.println("Enter Discount percentage:");
        Double dp = input.nextDouble();
        discount = dp * orignal / 100;
        dsp = orignal - discount;
        System.out.println("The orignal price is:" + orignal);
        System.out.println("The discounted price is:" + dsp);
    }

}