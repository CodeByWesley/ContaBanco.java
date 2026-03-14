package bank.account;

public class Account {
   private String agency;
   private String accountNumber;
   private String clientName;
   private String taxIdNumber;
   private String email;
   private String password;
   private Address address;

   private double balance;

   public void deposit(double value) {
      balance += value;
   }
   public void withdraw(double value) {
      if (value > balance) {
         System.out.println("Insufficient balance.");
         return;
      }
      balance -= value;
   }

   public double getBalance() {
      return balance;

   }
}
