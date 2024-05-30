import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char inp_char;
        System.out.print("Enter the character:");
        inp_char=sc.next().charAt(0);
        System.out.println("The entered character is:"+inp_char);
        System.out.println("ASCII Value of the entered character is:"+(int)inp_char);
        char next_char;
        next_char=(char)(inp_char+1);
        System.out.println("The immediate next character is:"+next_char);
        System.out.println("ASCII Value of the immediate next_char is :"+(int)next_char);
        sc.close();
    }
}
