package task;

public class BankDetails {

    static class SbiAcc {
        private String Accholder;
        private int Balance;

        SbiAcc(String Accholder, int Balance) {
            this.Accholder = Accholder;
            this.Balance = Balance;
        }

        public String getAccholder() {
            return Accholder;
        }

        public int getBalance() {
            return Balance;
        }

        public void Deposit(int dep) {
            if (Balance > 0) {
                Balance += dep;
                System.out.println("Deposit Amount: " + dep);
                System.out.println("Now Current Balance: " + Balance);
            }
        }

        public void setAccholder(String Accholder) {
            this.Accholder = Accholder;
        }

        public void setWithdraw(int withdraw) {
            Balance -= withdraw;
        }
    }

    public static void main(String[] args) {
        SbiAcc vn = new SbiAcc("Ram", 35000);
        System.out.println("Account holder Name: " + vn.getAccholder());
        vn.setAccholder("Vicky");
        System.out.println("Updated account holder: " + vn.getAccholder());
        System.out.println("Balance: " + vn.getBalance());
        vn.Deposit(3000);
    }
}


