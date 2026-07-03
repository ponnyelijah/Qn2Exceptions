
package SsewankamboElijjah.qn2exceptions;

public class Qn2Exceptions {

    public static void main(String[] args) {
        
        System.out.println("--- Testing Part C: Payment System & Custom Checked Exception ---");
        PaymentSystem account = new PaymentSystem();

        try {
            // Attempting a successful withdrawal
            System.out.println("Attempting to withdraw 150.00...");
            account.withdraw(150.00);
            
            // Attempting a withdrawal that will fail and trigger the custom exception
            System.out.println("\nAttempting to withdraw 400.00...");
            account.withdraw(400.00);
            
        } catch (InsufficientFundsExp e) {
            // Handling the checked exception thrown by the withdraw method
            System.out.println("Caught Expected Exception: " + e.getMessage());
        }

        System.out.println("\n--- Testing Part D: Try-With-Resources ---");
        // This will call the safe file reading method which cleanly manages its resources
        FileHandler.readFile();
    }
}
