package Qns2;

import java.util.Scanner;

public class BankDemoTest {
    public static void main(String[] args) throws InsufficientFundsException {
        Scanner scanner = new Scanner(System.in);
        double amount;
        CheckingAccount checkingAccount = new CheckingAccount();
        System.out.println("Please enter amount to deposit: ");
        amount = scanner.nextDouble();
        checkingAccount.deposit(amount);
        System.out.format("Current amount is: $%.2f\n", checkingAccount.getBalance());
        System.out.println("Please enter amount to withdraw: ");
        amount = scanner.nextDouble();
        checkingAccount.withdraw(amount);
        System.out.format("Current amount is: $%.2f\n", checkingAccount.getBalance());
    }
}
