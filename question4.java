import java.util.Scanner;
public class orignalprice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double orignal;
            System.out.println("Enter discounted selling price:");
            Double dsp=input.nextDouble();
                System.out.println("Enter Discount percentage:");
                Double dp=input.nextDouble();
                orignal=dsp/(1-dp/100);
                System.out.println("The orignal selling price is:" + orignal);
    }
    
}