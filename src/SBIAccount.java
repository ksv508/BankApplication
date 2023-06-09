public class SBIAccount implements BankAccountInterface{
    private String name;

    @Override
    public String fetchBalance(String password) {
        return null;
    }

    @Override
    public double addMoney(double amount) {
        return 0;
    }

    @Override
    public String withdrawMoney(String password, double amount) {
        return null;
    }

    @Override
    public String changePassword(String newPassword, String oldPassWord) {
        return null;
    }

    @Override
    public double calculateInterest(int years) {
        return 0;
    }
}
