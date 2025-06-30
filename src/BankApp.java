import java.util.Scanner;

public class BankApp 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Enter Account Holder's Name: ");
        String name = scanner.nextLine();
        Account account = new Account(name);

        int choice;
        do 
        {
            System.out.println("\n=====  Bank Menu =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Show Balance");
            System.out.println("4. Show Transactions");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) 
            {
                case 1 -> {
                    System.out.print("Enter deposit amount: Rs");
                    double dep = scanner.nextDouble();
                    account.deposit(dep);
                }
                case 2 -> {
                    System.out.print("Enter withdrawal amount: Rs");
                    double wd = scanner.nextDouble();
                    account.withdraw(wd);
                }
                case 3 -> account.showBalance();
                case 4 -> account.showTransactions();
                case 5 -> System.out.println("Exiting. \nThank you for using the application!");
                default -> System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        scanner.close();
    }
}
