/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main {
    public static void main(String args[])
    {
        int[] arr = { 1,5,9,8,2,3,4,6,7,10,11,12,13,14,15,16,17};
        int sum1 = 10;
         getPairsCount(arr, sum1 );
    }
  
    // Prints number of pairs in arr[0..n-1] with sum equal
    // to 'sum'
    public static void getPairsCount(int[] arr, int sum1)
    {
  
        int count = 0; // Initialize result
  
        // Consider all possible pairs and check their sums
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if ((arr[i] + arr[j]) == sum1)
                    count++;
  
        System.out.printf("Count of pairs is %d", count);
    }
}