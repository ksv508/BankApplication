import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HDFCAccount hdfcAccount = new HDFCAccount("KESHAV", 1000, "Ksv508");
        System.out.println("Congrats " + hdfcAccount.getName() + ". Your account has been created with account number " + hdfcAccount.getAccountNo());
        hdfcAccount.addMoney(5000);
        System.out.println(hdfcAccount.withdrawMoney("Ksv508",2000));
        System.out.println(hdfcAccount.withdrawMoney("Ksjkhgd508",3000));
        System.out.println(hdfcAccount.fetchBalance("Ksv508"));
        System.out.println(hdfcAccount.changePassword("KSV508","Ksv508"));
        System.out.println("Enter the number of years to calculate interest");
        int years = sc.nextInt();
        System.out.println("Interest for " + years + "is :" + hdfcAccount.calculateInterest(years));
    }
}