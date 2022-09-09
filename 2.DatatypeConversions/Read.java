import java.util.Scanner;
public class Read {
	public static void  main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("enter a integer number: ");
		int a = s.nextInt();
		System.out.println("integer: "+a);
		
		
		System.out.print("enter a number: ");
		double b = s.nextDouble();
		System.out.println("double: "+b);
		
		
		System.out.print("enter a character: ");
		char c = s.next().charAt(0);
		System.out.println("character: "+c);
		
		byte d = (byte) a;
		System.out.println("int"+a);
		System.out.println("to byte conversion: "+d);
		int e = (int) c;
		System.out.println("char(c) to int conversion: "+e);
		
		byte f = (byte) b;
		System.out.println("double(b) to byte conversion: "+f);
		
		int g = (int) b;
		System.out.println("double(b) to int conversion: "+g);
		
		}
}
