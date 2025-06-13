package task_day5;
import java.io.FileWriter;
import java.io.IOException;
public class Stringfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileWriter Writer = new FileWriter("file.txt");
	Writer.write("hii student");
	Writer.write("hello world");
	Writer.write("welcome");
	Writer.close();
	System.out.println("sucessfully");
}
catch(Exception e) {
	System.out.println("An error occurs");
	e.printStackTrace();
}
	}

}
