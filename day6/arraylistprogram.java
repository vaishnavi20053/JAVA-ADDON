package day6;
import java.util.ArrayList;
public class ArrayListprogram {

	public static void main(String[] args) {
		ArrayList<Object> arr=new ArrayList<Object>();
		arr.add("A");
		arr.add("Computer Science");
		arr.add("3 year");
		arr.add(0,"Vaishnavi");
		for(Object data:arr) {
			System.out.println(data);
		}
		

	}

}
