import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // finding roots of a Quadratic Equation
        int a,b,c;
        System.out.println("Enter the coefficients of the Quadratic Equation.");
        System.out.print("a=");
        a=sc.nextInt();
        System.out.print("b=");
        b=sc.nextInt();
        System.out.print("c=");
        c=sc.nextInt();
        double d;
        d=(b*b)-(4*a*c);
        System.out.println("The discriminant of this Quadratic Equation is:"+d);
        double root_1,root_2;
        if (d<0) {
            System.out.println("No real roots exist.");
            System.out.println("Please try another one!");
        }
        if (d==0) {
            System.out.println("Roots are real and equal.");
            root_1=root_2=(-b)/(2*a);
            System.out.println("And the real and equal roots are: "+root_1+","+root_2);
        }
        if (d>0) {
            System.out.println("The roots are real and unequal.");
            root_1=((-b)+Math.sqrt(d))/(2*a);
            root_2=((-b)-Math.sqrt(d))/(2*a);
            System.out.println("The roots of this Quadratic Equation is:"+root_1+","+root_2);
        }
        sc.close();
    }
}
