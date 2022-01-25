public class SavingsAccount {
    private double balance;
    private int accountNumber;
    private double inRate;

    public SavingsAccount(double balance, int accountNumber, double inRate) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.inRate = inRate;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getInterestRate() {
        return inRate;
    }
    public void deposit(double depositAmt){
        balance = balance + depositAmt;
    }
    public void withdraw(double withdrawAmt){
        if(withdrawAmt <= balance){
            balance = balance - withdrawAmt;
        }
    }
    public void accrueInterest(){
        balance = balance + balance * inRate;
    }

}

