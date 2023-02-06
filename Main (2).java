import java.util.Scanner;
public class Main {

 public static void main(String[] args)
    {
       int radius;
       double circumference;
 
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius of circle");
        radius = in.nextInt();
        circumference = Math.PI*2*radius;
        System.out.println("Circumference of the circle is ::"+Math.PI*2*radius);
   }
}