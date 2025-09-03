public class bankBalance {
    private int balance=10000;
    public void withdraw(int amount) {
        if(amount>balance) {
            throw new InsufficientbalanceException("Insufficient balance");
        }else {
            balance-=amount;
            System.out.println("Withdraw Successful, remaining balance"+balance);
        }
    }
}
