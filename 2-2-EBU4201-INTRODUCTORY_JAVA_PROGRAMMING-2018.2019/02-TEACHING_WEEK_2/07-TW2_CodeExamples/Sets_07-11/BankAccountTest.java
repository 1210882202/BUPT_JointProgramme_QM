public class BankAccountTest {
  public static void main(String[] args) {
    BankAccount acc1 = new BankAccount(23142635, "John Smith");
    System.out.println(acc1);
    acc1.deposit(500);
    acc1.withdraw(100);
    System.out.println(acc1);

    BankAccount acc2 = new BankAccount("Tom Will", 38472638);
    System.out.println(acc2);
    acc2.deposit(3000);
    acc2.withdraw(400);
    System.out.println(acc2);
  }
}