package day6;

public class Methods extends Thread {

	public static void main(String[] args) {
		System.out.println("haii thread");
	}

}
class Execute{
	public static void main(String[] args) {

		Methods m=new Methods();
		m.run();
		//m.start();
		}
}
