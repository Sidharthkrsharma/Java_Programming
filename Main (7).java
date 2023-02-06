/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	 StringBuilder sb = new StringBuilder("hello");
	 
	 for(int i=0; i<sb.length()/2; i++ ) {
	     int front = i;
	     int back = sb.length() - 1 - i; 
	     
	     char frontChar = sb.charAt(front);
	     char backChar = sb.charAt(back);
	     
	     sb.setCharAt(front, backChar);
	     sb.setCharAt(back, frontChar);
	    
	     
	 }
	 System.out.println(sb);
	}
}
