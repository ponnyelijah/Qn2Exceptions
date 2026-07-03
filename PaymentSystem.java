
package SsewankamboElijjah.qn2exceptions;

public class PaymentSystem {

    private double balance = 500.00;

    public void withdraw(double amount) throws InsufficientFundsExp {
        if (amount > balance) {
            throw new InsufficientFundsExp("Error: Insufficient funds. Balance is " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }
}
    
