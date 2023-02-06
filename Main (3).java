import java.util.Scanner;
public class Main {

 public static void main(String[] args)
    {
       int i ;
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.");
        i = sc.nextInt();
		do {
			System.out.println(i);
			i++;
		} while (i <= 100);
	}
}
