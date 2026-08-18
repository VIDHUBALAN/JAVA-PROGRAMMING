import java.io.*;
public class IODemo{
   public static void main(String[]args)throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	double marks = 89.4567;
	System.out.println("----Formatted Output----");
	System.out.printf("%-10s%.2f%n","Marks:",marks);

	System.out.print("\nEnter a single character: ");
	char ch = (char) br.read();
	br.readLine();
	System.out.println("You entered: "+ch);

	System.out.print("\nEnter your name: ");
	String name = br.readLine();
	System.out.println("Hello,"+name+"!");

	System.out.print("\nEnter your age: ");
	int age = Integer.parseInt(br.readLine());
	System.out.printf("%-15s%d\n","Your age is: ", age);

	br.close();
   }
}