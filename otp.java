package day2;
import java.util.Scanner;
import java.util.Random;
public class OTP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    public static int OTP(){
		             Random ran = new Random();
		             return 1000+ran.nextInt(6000);
		         }
		  
		        Scanner in=new Scanner(System.in);
		        long num=in.nextLong();
		        long a=1234567890;
		        if(num==a){
		            int otp=OTP();
		    System.out.println("one time password is"+" "+ otp);
		    System.out.println("verified");
		    }else{
		        System.out.println("invaild");
		    }
		}
		
	}


