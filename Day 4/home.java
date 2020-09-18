public class home {
    public static void main(String[] args) {

        //Create manager accounts
        Address managerAd = new Address("Delhi", "Delhi", 110088);
        managerAccount manager = new managerAccount("Dhruv", "12/21/97", "M", 234234234, 1, 50000, "Manager", managerAd);
        //Programmer account
        Address programmerAd = new Address("BLR", "KA", 143088);
        programmerAccount programmer = new programmerAccount("IPL", "32/45/11", "F", 42343242, 2, 55000, "Programmer", programmerAd);
        //Admin account
        Address adminAd = new Address("Hyderabad", "Telangana", 210088);
        adminAccount admin = new adminAccount("Ravi", "12/21/43", "M", 69677445,3, 30000,"Admin", adminAd);
        //Student account
        Address studentAd = new Address("Lucknow", "UP", 4102188);
        studentAccount student = new studentAccount("Uday", "22/01/20", "M", 84375349, studentAd, 'B');
        //Customer account
        Address customerAd = new Address("Kolkata", "WB", 452488);
        Account customerAcc = new Account(200, 6000);
        customerAccount customer = new customerAccount("Rani", 10, "21/21/33", "F", 32423442,customerAcc, customerAd);

        //Test the above created objects
        test(manager);
        test(programmer);
        test(admin);
        test(student);
        test(customer);
        }
        public static void test(person p) {
            p.displayInfo();
        }
        
    
}