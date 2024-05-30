import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char inp_char;
        System.out.print("Enter any single character from the keyboard:");
        inp_char=sc.next().charAt(0);
        System.out.println("The character entered by the user is :"+inp_char);
        if ((int)inp_char>=65 && (int)inp_char<=90) {
            System.out.println("The entered character is an Uppercase English Alphabet.");
            System.out.println("Now,We will convert it into its lowercase !");
            inp_char=(char)(inp_char+32);
            System.out.println("The conversion is done and is displayed as :"+inp_char);
        }
        else if ((int)inp_char>=97 && (int)inp_char<=122) {
            System.out.println("The entered character is an Lowercase English Alphabet.");
            System.out.println("Now,We will convert it into its uppercase !");
            inp_char=(char)(inp_char-32);
            System.out.println("The conversion is done and is displayed as :"+inp_char);
        }
        else
        {
            System.out.println("No conversion done !");
            System.out.println("Displayed same as entered:"+inp_char);
        }
        sc.close();
    }
}
