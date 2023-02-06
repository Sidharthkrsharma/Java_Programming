/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in);
      int rows = sc.nextInt();
      int cols = sc.nextInt();
      
      int[][] numbers = new int[rows][cols];
      
      //input
      //rows
      for(int i=0; i<rows; i++){
          //columns
          for(int j=0; j<cols; j++){
              numbers[i][j] = sc.nextInt();
          }
      }
      //output
      for(int i=0; i<rows; i++) {
          for(int j=0; j<cols; j++) {
              System.out.println(numbers[i][j] + " ");
          }
          System.out.println();
      }
 
     
	}
}
