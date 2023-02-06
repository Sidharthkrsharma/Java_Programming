import java.util.Scanner;
public class Main {

 public static void main(String[] args)
    {
       int sum = 0, n;
       int a = 0;
       int b = 1;
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st no.");
        n = sc.nextInt();
        System.out.print("Enter 2nd no.");  
        
    while(sum <= n)
{
System.out.print(sum + " ");
a = b;  // swap elements
b = sum;
sum = a + b;  // next term is the sum of the last two terms 
}
}
}
