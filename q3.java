import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // Conversion of Fahrenhiet(F) to Celcius(C)
        float temp_Fah;
        System.out.print("Enter the temperatre in Fahrenhiet(F):");
        temp_Fah=sc.nextFloat();
        float temp_celcius;
        temp_celcius=((temp_Fah-32)*5)/9;
        System.out.println("The Temperature in Celcius is :"+temp_celcius);
        //Conversion of Celcius(C) to Fahrenhiet(F)
        System.out.print("Enter the temperature in Celcius(C):");
        temp_celcius=sc.nextFloat();
        temp_Fah=((temp_celcius*9)/5)+32;
        System.out.println("The temperature in Fahrenhiet(F):"+temp_Fah);
        sc.close();
    }
}
