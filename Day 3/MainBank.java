public class MainBank {
    public static void main(String[] args) {
        //pass the accountNo and amount to deposit from CLA
        long accountNo = Long.parseLong(args[0]);
        double amount = Double.parseDouble(args[1]);
        //get the Account using the accountNo by calling getAccount(...)
        Account accNo = MainBank.getAccount(accountNo);
        // if accountNo is wrong show the error message and must not perform any below
        // operation
        if (accNo == null){
            System.out.println("No such account exists");
        }
        else{
            accNo.accountInformation();
            accNo.deposit(amount);
            accNo.accountInformation();
        }
        // show the account information before deposit
        //deposit the amount to that particular Account
        //show the account information after deposit
    }

    // pass the accountNO and get the Account from Accounts[] 
    public static Account getAccount(long accountNo) {
        Account[] accounts = AccountsDB.getAccounts();

        Account account = null;
        // get the account from accounts using the accountNo
        for(Account x: accounts){
            if(accountNo == x.getAccountNumber()){
                return x;
            }
        }
        return null;
    }
}