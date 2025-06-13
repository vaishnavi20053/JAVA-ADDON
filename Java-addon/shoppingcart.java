package DAY3;

public class Shoppingcart {

	
		// TODO Auto-generated method stub
		
			void add_to_cart(String category,int price) {
				System.out.println(";Your category:"+category);
				System.out.println("Item Price:"+price);
				
			}
			void add_to_cart(String category,int price,int quantity) {
				int total=price*quantity;
				System.out.println("total prices:"+total);
			}

			public static void main(String[] args) {
				Shoppingcart in =new Shoppingcart();
		        in.add_to_cart("shirt",250);
		        in.add_to_cart("shirt",250,2);
				
			
	}			
			

	
	}

}
