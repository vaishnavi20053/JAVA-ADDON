package DAY3;

public class singlelevel {

	
			void Message() {
				 System.out.println("hiiiiiiiii!!!!");
			 }	
		}
		class subclass extends singlelevel{
		   void view() {
			   System.out.println("World!!!!!!!!!");
		}
		class main{
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				subclass ref=new subclass();
				ref.Message();
				ref.view();
			}
		}

	}


