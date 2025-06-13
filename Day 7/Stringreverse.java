package Day7;
import java.util.Scanner;
public class Stringreverse {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		System.out.println("enter a String");
		String input = Scanner.nextLine();
		
		String a=n.nextLine();
		String reverse =" ";
		for(int i= input.length() - 1; i>=0; i++);{
		
			reverse+= input.charAt(i);
		}
				System.out.println("Reverse String :" + reverse);
	}

}
