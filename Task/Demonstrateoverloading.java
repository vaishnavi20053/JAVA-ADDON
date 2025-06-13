package task;

public class DemonstrateOverloading {
     public void sum(int a,int b) {
    	 System.out.println("Enter the value int a:"+a);
    	 System.out.println("Enter the value int b:"+b);
    	 System.out.println("total sum :"+(a+b));
     }
        public void sum(double a,double b) {
        	 System.out.println("Enter the value double a:"+a);
        	 System.out.println("Enter the value double  b:"+b);
        	 System.out.println("total sum :"+(a+b));
        }
        
        	
        
	public static void main(String[] args) {
		DemonstrateOverloading cv=new DemonstrateOverloading();
		cv.sum(40, 20);
		cv.sum(10.0, 70.8);

	}

}

