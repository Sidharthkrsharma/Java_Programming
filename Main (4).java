
import java.util.*;
public class Main {

 public static void main(String[] args)
    {
       int a, b, gcd = 0;
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st no.");
        a = sc.nextInt();
        System.out.print("Enter 2nd no.");  
        b = sc.nextInt();  
        gcd = findGCD(a, b);  
        System.out.println("GCD of " + a + " and " + b + " =  " + gcd);  
    }  
public static int findGCD(int a, int b)  
{  
while(b != 0)  
{  
if(a > b)  
{  
a = a - b;  
}  
else  
{  
b = b - a;  
}  
}  
return a;  
}  
} 

