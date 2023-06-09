import java.util.UUID;

public class SBIAccount implements BankAccountInterface{
    private String name;
    private String accountNo; // random and unique --> UUID
    private double balance;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    final double rateOfInterest = 6.1;
    // without parameters constructors
    public SBIAccount(){
    }
    // with parameters constructors
    public SBIAccount(String name, double balance, String password) {
        this.name = name;
        this.accountNo = String.valueOf(UUID.randomUUID()); // universally unique identifier (UUID)
        this.balance = balance;
        this.password = password;
    }

    @Override
    public String fetchBalance(String password) {
        if(this.password.equals(password)){
            return "Your current Balance is : " + this.balance;
        }
        return "Incorrect password";
    }

    @Override
    public double addMoney(double amount) {
        this.balance += amount;
        return balance;
    }

    @Override
    public String withdrawMoney(String password, double amount) {
        if(this.password.equals(password)){
            if(this.balance >= amount) {
                this.balance -= amount;
                return "Money has been withdrawn. The remaining balance is :" + this.balance;
            }
            else
                return "Insufficient balence";
        }
        return "Incorrect Password";
    }

    @Override
    public String changePassword(String newPassword, String oldPassWord) {
        if(this.password.equals(oldPassWord)){
            this.password = newPassword;
            return "Your Password is Successfully changed";
        }
        return "Wrong Password";
    }

    @Override
    public double calculateInterest(int years) {
        return (this.balance * this.rateOfInterest * years)/100;
    }
}
