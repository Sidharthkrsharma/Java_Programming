import java.util.Scanner;
public class Main {

 public static void main(String[] args)
    {
       int num1 , num2;
 
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        num1 = in.nextInt();
       
        System.out.println("Enter a number");
        num2 = in.nextInt();
        
          if (num1 == num2)
       System.out.println ("both are equal");
     else if (num1 > num2)
         System.out.println (num1 + " is greater");

     else
         System.out.println (num2 + " is greater");
    }
}