package day4;
//ENCAPULSATION    

//1 METHOD (accholder name,Balance)

//class SbiAcc{
//private String Accholder;
//private int Balance;  
//
//SbiAcc (String Accholder,int Balance){
//this.Accholder=Accholder;
//this.Balance=Balance;
//System.out.println(Accholder);	
//}
//public class Bankdetails {
//public static void main(String[] args) {
//SbiAcc vn=new SbiAcc("Arun",2133);     		
//}
//}}

//2 METHOD  (accholder name ,balance)
//(how to get from other class (GET)) 

//class SbiAcc{
//private String Accholder;
//private int Balance;  
//
//SbiAcc (String Accholder,int Balance){
//this.Accholder=Accholder;
//this.Balance=Balance;
//}	
//public String getAccholder(){
//return Accholder;
//}
//public int getBalance() {
//return Balance;
//}
//
//public class Bankdetails {
//public static void main(String[] args) {
//SbiAcc vn=new SbiAcc("Arun",2133);  
//System.out.println(vn.getAccholder());
//System.out.println(vn.getBalance());
//}
//}}

//3 METHOD (accholder name,balance,deposit)
//
//class SbiAcc{
//private String Accholder;
//private int Balance;  
//
//SbiAcc (String Accholder,int Balance){
//this.Accholder=Accholder;
//this.Balance=Balance;
//}	
//public String getAccholder(){
//return Accholder;
//}
//public int getBalance() {
//return Balance;
//}
//public void Deposit (int dep) {
//if(Balance > 0) {
//Balance+=dep;
////Balance = balance +dep
//System.out.println("Deposit Amount:"+dep);
//System.out.println("Now Current Balance:"+Balance);
//}
//}
//
//public class Bankdetails {
//public static void main(String[] args) {
//SbiAcc vn=new SbiAcc("Arun",2000);  
//System.out.println("Account Holder Name:"+vn.getAccholder());
//System.out.println("Balance :"+vn.getBalance());
//vn.Deposit(300);
//}
//}}

//4 METHOD (accholder name(rename),balance,deposit,withdraw)

class SbiAcc{
private String Accholder;
private int Balance;  

SbiAcc (String Accholder,int Balance){
this.Accholder=Accholder;
this.Balance=Balance;
}	
public String getAccholder(){
return Accholder;
}
public int getBalance() {
return Balance;
}
public void Deposit (int dep) {
if(Balance > 0) {
Balance+=dep;
//Balance = balance +dep
System.out.println("Deposit Amount:"+dep);
System.out.println("Now Current Balance:"+Balance);
}
}
public void setAccholder(String Accholder) {
this.Accholder=Accholder;
}
public void setwithdraw(int withdraw) {
Balance -= withdraw;
//BAlance=balance-withdraw
}
public class Bankdetails {
public static void main(String[] args) {
SbiAcc vn=new SbiAcc("Arun",2000);  
System.out.println("Account Holder Name:"+vn.getAccholder());
vn.setAccholder("Renu");
System.out.println("update account holder:"+vn.getAccholder());
System.out.println("Balance :"+vn.getBalance());
vn.Deposit(300);
vn.setwithdraw(200);
System.out.println();
System.out.println("Avail balance:"+vn.getBalance());
}
}}

public class BankDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
