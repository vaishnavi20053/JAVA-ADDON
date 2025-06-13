package DAY3;

public class loptop {

	
			String model;
			int size;
			laptop(String model,int size){
			    this.model=model;
				this.size=size;
			}
			void display() {
		System.out.println("Default constructor"+" "+model+" "+size);
			}
			public static void main(String[] args) {
				laptop ref=new laptop("DELL",12);
				ref.display(); 
			

			}

		}
	}

}
