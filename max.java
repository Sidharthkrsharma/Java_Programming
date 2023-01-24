import java.io.*;
public class Main
{

static int getMin(int arr[], int i, int n)
{

	return (n == 1) ? arr[i] : Math.min(arr[i],
						getMin(arr,i + 1 , n - 1));
}

static int getMax(int arr[], int i, int n)
{

	return (n == 1) ? arr[i] : Math.max(arr[i],
						getMax(arr ,i + 1, n - 1));
}


public static void main(String[] args)
{
	int arr[] = { 1,5,9,8,2,3,4,6,7,10,11,12,13,14,15,16,17 };
	int n = arr.length;
	System.out.print("Minimum element of array: " +
						getMin(arr, 0, n) + "\n");
	System.out.println("Maximum element of array: " +
						getMax(arr, 0, n));
	}
}

