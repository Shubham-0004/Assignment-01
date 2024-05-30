import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Evaluation of expressions by taking x and y as user input
        int x,y;
        System.out.println("Enter the values of x and y:");
        System.out.print("x=");
        x=sc.nextInt();
        System.out.print("y=");
        y=sc.nextInt();
        double result_1;
        result_1=(4*x*x)+(2*x)+10;
        System.out.println("The result of first expression is:"+result_1);
        double result_2;
        result_2=(5*x*x*x)+(4*x*x*y*y)+(4*y*y*y)+30;
        System.out.println("The result of second expression is:"+result_2);
        sc.close();
    }
}
