import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Addition of numbers

        float a,b,c;
        System.out.println("Enter the three numbers:");
        a= sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();
        float sum;
        sum=a+b+c;
        System.out.println("Sum of input three numbers is :"+sum);
        sc.close();
    }
}
