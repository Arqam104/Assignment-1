import java.util.Scanner;
public class power {
    public static void main(String[] args) {
        double power;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Voltmeter reading:");
        double volt=input.nextDouble();
        System.out.println("Enter Ammeter reading:");
        double current=input.nextDouble();
        power=volt*current;
        System.out.println("The power consumption of Electrical Appliance is:" + power + "watt");
    }
    
}