package DAY1;
import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int age;
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter your age=");
		        age = sc.nextInt();
		        if (age >= 18)
		        {
		            System.out.println("You are eligible for vote.");
		        }
		        else
		        {
		            System.out.println("You are not eligible for vote.");
		        }
		    }
		
	}


