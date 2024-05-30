import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        // Area and Circumference of a circle

    float radius;
    System.out.print("Enter the radius of the circle:");
    radius=sc.nextFloat();
    double area;
    area= 3.14*radius*radius;
    System.out.println("The area of the circle is:"+area);
    double circumference;
    circumference=2*3.14*radius;
    System.out.println("The circumference of the circle is:"+circumference);
    sc.close();
    }
}
