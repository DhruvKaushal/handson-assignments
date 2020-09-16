class UserInfo {
    public static void main(String[] args){
        savingRecord u1 = new savingRecord(1000001, "Dhruv", "Delhi", "Delhi");
        savingRecord u2 = new savingRecord(1000002, "TT", "UP", "Noida", 400);
        savingRecord u3 = new savingRecord(1000003, "Bisht", "UK", "Dehradun");
        savingRecord u4 = new savingRecord(1000004, "Amit", "Karnataka", "BLR", 900);
        savingRecord u5 = new savingRecord(1000005, "Samir", "Telangana", "Hyderabad", 700);
        u1.display();
        u1.deposit(500);
        u1.display();
        u1.withdraw(200);
        //u1.display();
        u5.display();
    }
}