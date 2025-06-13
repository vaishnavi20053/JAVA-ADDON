package task_day5;
import java.io.*;
public class FileHandling {

	public static void main(String[] args) {
		String filename="textfile";
		try(BufferedReader br=new BufferedReader(new FileReader(filename))) {
		String  Line;
		if((Line = br.readLine()) !=null) {
			
		}
	}
				catch(Exception e) {
					System.out.println("Filenotfound");
			}
	    }
	}
	

