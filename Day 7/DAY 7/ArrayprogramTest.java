package Day7;

public class ArrayProgramTest {

	public static void main(String[] args) {
	int[] a= {1,2,3,4,5,6};
	int sum=0;
	int count=0;
	for(int num=0;num<=a.length-1;num++);{
	System.out.println(a[num]);
	sum+=a[num];
	System.out.println("Sum:+sum");
	count++;
//	System.out.println(+count);
	}
System.out.println("Sum :"+count);

}
}