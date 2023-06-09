import java.util.*;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter BANK name in which you want to create account");
        String opt = sc.next();
        if(opt.equals("HDFC") || opt.equals("hdfc")) {
            System.out.println("Welcome To HDFC");

            System.out.println("Enter Customer Name");
            String name = sc.next();
            System.out.println("Enter Customer Starting balance");
            double balance = sc.nextDouble();
            System.out.println("Enter Password");
            String password = sc.next();
            HDFCAccount hdfcAccount = new HDFCAccount(name, balance, password);

            while(true) {
                System.out.println("Choose the service you want to opt");
                System.out.println("1. Create a new Bank Account");
                System.out.println("2. Check Balance");
                System.out.println("3. Add Money to your Account");
                System.out.println("4. Withdraw Money From Your Account");
                System.out.println("5. Change Bank Password");
                System.out.println("6. Calculate Interest");
                System.out.println("7. Exit");
                int ser = sc.nextInt();
                switch (ser) {
                    case 1:
                        System.out.println("Enter Customer Name");
                        name = sc.next();
                        System.out.println("Enter Customer Starting balance");
                        balance = sc.nextDouble();
                        System.out.println("Enter Password");
                        password = sc.next();
                        hdfcAccount = new HDFCAccount(name, balance, password);
                        System.out.println("Congrats " + hdfcAccount.getName() + ". Your account has been created with account number " + hdfcAccount.getAccountNo());
                        break;
                    case 2:
                        System.out.println("Enter your password");
                        password = sc.next();
                        System.out.println(hdfcAccount.fetchBalance(password));
                        break;
                    case 3:
                        System.out.println("Enter Amount you want to deposit");
                        double amount = sc.nextDouble();
                        hdfcAccount.addMoney(amount);
                        break;
                    case 4:
                        System.out.println("Enter Amount you want to Withdraw");
                        amount = sc.nextDouble();
                        System.out.println("Enter Your Password");
                        password = sc.next();
                        System.out.println(hdfcAccount.withdrawMoney(password, amount));
                        break;
                    case 5:
                        System.out.println("Enter your oldpassword");
                        String oldpassword = sc.next();
                        System.out.println("Enter your newpassword");
                        String newpassword = sc.next();
                        System.out.println(hdfcAccount.changePassword(newpassword, oldpassword));
                        break;
                    case 6:
                        System.out.println("Enter the number of years to calculate interest");
                        int years = sc.nextInt();
                        System.out.println("Interest for " + years + " years is :" + hdfcAccount.calculateInterest(years));
                        break;
                    case 7:
                        System.out.println("Thank you for banking with us ");
                        exit(0);
                }
            }
        }
        else if(opt.equals("SBI") || opt.equals("sbi")){
            System.out.println("Welcome To State Bank Of India");

            System.out.println("Enter Customer Name");
            String name = sc.next();
            System.out.println("Enter Customer Starting balance");
            double balance = sc.nextDouble();
            System.out.println("Enter Password");
            String password = sc.next();
            SBIAccount sbiAccount = new SBIAccount(name, balance, password);
            while(true) {
                System.out.println("Choose the service you want to opt");
                System.out.println("1. Create a new Bank Account");
                System.out.println("2. Check Balance");
                System.out.println("3. Add Money to your Account");
                System.out.println("4. Withdraw Money From Your Account");
                System.out.println("5. Change Bank Password");
                System.out.println("6. Calculate Interest");
                System.out.println("7. Exit");
                int ser = sc.nextInt();
                switch (ser) {
                    case 1:
                        System.out.println("Enter Customer Name");
                        name = sc.next();
                        System.out.println("Enter Customer Starting balance");
                        balance = sc.nextDouble();
                        System.out.println("Enter Password");
                        password = sc.next();
                        sbiAccount = new SBIAccount(name, balance, password);
                        System.out.println("Congrats " + sbiAccount.getName() + ". Your account has been created with account number " + sbiAccount.getAccountNo());
                        break;
                    case 2:
                        System.out.println("Enter your password");
                        password = sc.next();
                        System.out.println(sbiAccount.fetchBalance(password));
                        break;
                    case 3:
                        System.out.println("Enter Amount you want to deposit");
                        double amount = sc.nextDouble();
                        sbiAccount.addMoney(amount);
                        break;
                    case 4:
                        System.out.println("Enter Amount you want to Withdraw");
                        amount = sc.nextDouble();
                        System.out.println("Enter Your Password");
                        password = sc.next();
                        System.out.println(sbiAccount.withdrawMoney(password, amount));
                        break;
                    case 5:
                        System.out.println("Enter your oldpassword");
                        String oldpassword = sc.next();
                        System.out.println("Enter your newpassword");
                        String newpassword = sc.next();
                        System.out.println(sbiAccount.changePassword(newpassword, oldpassword));
                        break;
                    case 6:
                        System.out.println("Enter the number of years to calculate interest");
                        int years = sc.nextInt();
                        System.out.println("Interest for " + years + " years is :" + sbiAccount.calculateInterest(years));
                        break;
                    case 7:
                        System.out.println("Thank you for banking with us ");
                        exit(0);
                }
            }
        }
        else{
            System.out.println("Please choose valid Bank");
        }
    }
}