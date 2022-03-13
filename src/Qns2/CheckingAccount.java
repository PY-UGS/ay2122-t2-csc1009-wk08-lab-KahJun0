package Qns2;

public class CheckingAccount {
    private double balance = 0;
    private int accountNumber;

    public double getBalance() {
        return balance;
    }

    public void deposit(double balance) {
        this.balance += balance;
    }

    public void withdraw(double amountToWithdraw) throws InsufficientFundsException {
        if (amountToWithdraw > this.balance){
            throw new InsufficientFundsException(amountToWithdraw - this.balance);
        }
        this.balance -= amountToWithdraw;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
