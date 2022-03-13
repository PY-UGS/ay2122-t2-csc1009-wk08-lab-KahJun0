package Qns2;

public class InsufficientFundsException extends Exception {
    private final double amount;

    public InsufficientFundsException(double amount) {
        this.amount = amount;
        System.out.format("Sorry but your account is short by $%.2f\n", getAmount());
    }

    public double getAmount(){
        return amount;
    }
}
