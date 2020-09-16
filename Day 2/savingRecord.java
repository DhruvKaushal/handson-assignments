// this class is for holding details of savings account
class savingRecord{
    long accountNo, pin;
    String name, state, city, IFSC;
    double balance;
    savingRecord(long accNo, String naam, String st, String cit){
        accountNo = accNo;
        name = naam;
        state = st;
        city = cit;
        IFSC = "HSBC001";
        balance = 0.0;
    }
    savingRecord(long accNo, String naam, String st, String cit, double b){
        accountNo = accNo;
        name = naam;
        state = st;
        city = cit;
        IFSC = "HSBC001";
        balance = b;
    }
    void withdraw(double amount){
        if(balance-amount < 0){
            System.out.println("Balance too low to withdraw");
            return;
        }
        balance = balance - amount;
    }
    void deposit(double amount){
        balance = balance + amount;
    }
    void display(){
        System.out.println("Account No: "+accountNo);
        System.out.println("Name: "+name);
        System.out.println("Balance: "+balance);
        System.out.println("State: "+state);
        System.out.println("City: "+city);
        System.out.println("IFSC: "+IFSC);
    }
}