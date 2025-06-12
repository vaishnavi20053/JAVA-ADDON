package day2;


	class laptop{
	void Os() {
		System.out.println("Windows 10");
	}
	}
class Update extends laptop{
	void Os()
{
System.out.println("windows 11");
}
}
public class Main {	
	

public static void main(String[] args) {
		// TODO Auto-generated method stub
   Update u=new Update();
   u.Os();
	}

}
