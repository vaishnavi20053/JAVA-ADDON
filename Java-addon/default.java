package DAY3;

public class DefaultConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//public class DefaultConstructor {
//			DefaultConstructor(){
//				System.out.println("Default constructor");
//			}
//			public static void main(String[] args) {
		//
////		         to create object
////				   classname refernce variable=new classname()
//				
//				DefaultConstructor ref=new DefaultConstructor();
//			}
		//
		//}
		 
			 String language;
			 String name;
			 int year;
			 DefaultConstructor(String name,int year,String lang){
				 this.name=name;
				 this.year=year;
				 this.language=lang;
				
			 
			 }
			 DefaultConstructor(DefaultConstructor copy){
				 this.name=copy.name;
				 this.year=copy.year;
				 this.language=copy.language;
			 }
			 void display() {
				 System.out.println("underline Constructor"+" " +name+" "+year+" "+language);
			 }
			 public static void main(String []args){
//				 object creation
//				 classname reference variable=new classname();
				 System.out.println("original constructor");
				 DefaultConstructor ref1=new DefaultConstructor("Java",1995,"Programming");
			 ref1.display();
//			1	 reference to another object
				 System.out.println("copy constructor");
				 DefaultConstructor ref2=new DefaultConstructor(ref1);
				 ref2.display();
				 
			 }
		 
	}

}
}