public class ExceptionDemo{
	static double divide(double num, double deno){
	   if(deno == 0)
	      throw new ArithmeticException("Division by zero is not allowed!");
	   return num/deno;
	}
	static int checkage(int age){
	   if(age<0)
	      throw new IllegalArgumentException("Age cannot be negative!");
	return age;
	}
	
	public static void main(String[]args){
	  try{
	     System.out.println("Result of 10/2 = "+ divide(10,2));
	     System.out.println("Result of 10/0 = "+ divide(10,0));
	}catch(ArithmeticException e){
	     System.out.println("Exception caught: " + e.getMessage());
	}finally{
	     System.out.println("Division blockn execution completed.");
	}
	
	try{
	System.out.println("\nAge entered:" + checkage(-5));
	}catch(IllegalArgumentException e){
	     System.out.println("Exception caught: " + e.getMessage());
	}
	
	try{
	   int[]arr = {1, 2, 3};
	   int index = 5;
	   System.out.println("\nValue:" + arr[index]);
	}catch(ArrayIndexOutOfBoundsException e){
	  System.out.println("\nException caught: Array index out of bounds-" + e.getMessage());
	}catch(Exception e){
	  System.out.println("\n An unknown exception occurred: " + e);
	}
	System.out.println("\n Program continues normally after exception handling.");
	}
     }