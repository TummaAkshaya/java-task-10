public class ExceptionHandlingDemo {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(5000);

        try {
            account.deposit(2000);
            account.withdraw(1000);

            // This will cause custom exception
            account.withdraw(7000);

        } catch (InvalidAmountException e) {
            System.out.println("Custom Exception: " + e.getMessage());

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred");

        } catch (Exception e) {
            System.out.println("General Exception: " + e.getMessage());

        } finally {
            System.out.println("Transaction completed");
            System.out.println("Final Balance: " + account.getBalance());
        }
    }
}
