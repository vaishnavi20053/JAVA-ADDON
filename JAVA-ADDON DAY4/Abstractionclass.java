package day4;

public class Abstraction {

	abstract class Student{
		 abstract void m1();
	 }
	 class display extends Student{
		 void m1() {
			 System.out.println("Haii");
		 }
	 
	
		public static void main(String[] args) {
			display d=new display();{
			d.m1();
		}
	 
		}
	 }
}


