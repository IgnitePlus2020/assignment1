//Splitting of fractions-PROGRAM 6
import java.util.*;
public class q6 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        double a=sc.nextDouble();
        int b=(int)a;
        System.out.print(+b);
        double c=(double)b;
        double d=a-c;
        double x=d*100;
        int y=(int)x;
        System.out.println(" "+y);
    }
}
