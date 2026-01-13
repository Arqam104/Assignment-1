import java.util.Scanner;
public class trianglearea {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double s, area;
        System.out.println("Enter side a of a tringle:");
        double a=input.nextDouble();
        System.out.println("Enter side b of a tringle:");
        double b=input.nextDouble();
        System.out.println("Enter side c of a tringle:");
        double c=input.nextDouble();
        s=(a+b+c)/2;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of a tringle is:" + area);
    }
}