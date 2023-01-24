
import java.io.*;

class Main {
	
	static char findExtraCharcter(String strA,String strB)
	{
		
		int res = 0, i;
	
	
		for (i = 0; i < strA.length(); i++)
		{
		
			res ^= strA.charAt(i);
		}
	
		
		for (i = 0; i < strB.length(); i++)
		{
		
			res ^= strB.charAt(i);
		}
	
		
		return ((char)(res));
	}
	
	
	public static void main(String args[])
	{
		
		String strA = "A,B,C,D,E,F,G,H,I,J,K";
		String strB = "A,B,C,D,E,G,H,J,H,Z";
		System.out.println(findExtraCharcter(strA, strB));
	}
}



