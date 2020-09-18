public class customerAccount extends person {
    private int custNo;
    private Account account;
    public customerAccount(String name, int custNo, String DOB, String gender, long phone, Account acc, Address ad) {
        super(name, DOB, gender, phone, ad);
        this.account = acc;
        this.custNo = custNo;
    }
    public void setBalance(long amount){
        this.account.balance += amount;
    }
    @Override
    public void displayInfo(){
        System.out.println("-------------Customer data-------------");
        System.out.println("Name: "+ getName());
        System.out.println("Gender: "+ getGender());
        System.out.println("Phone :" + getPhone());
        System.out.println("ID :" + custNo);
        System.out.println("Balance: "+ account.balance + " Account No: "+account.accountNo);
        System.out.println("DOB: "+ getDOB());
        addDetails();
    }
}