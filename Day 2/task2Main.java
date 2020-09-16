class task2Main {
    public static void main(String[] args){
        EmpRecords[] e = new EmpRecords[5];
        address[] a = new address[5];
        a[0] = new address("Delhi", "Delhi", 100022);
        a[3] = new address("Karanataka", "BLR", 103223);
        e[0] = new EmpRecords(1, "Dhruv", 51000, a[0]);
        e[1] = new EmpRecords(2, "Tez", 44000, a[1]);
        e[2] = new EmpRecords(3, "Slow", 60000, a[2]);;
        e[3] = new EmpRecords(4, "Raj", 33000, a[3]);        
        e[4] = new EmpRecords(5, "Anup", 55000, a[4]);
        for(EmpRecords x : e){
            if(x.salary >50000){
                x.display();
            }
        }
        System.out.println("----------------Part 2-----------------");
        for(EmpRecords x : e){
            if(x.Addr != null){
                x.display();
            }
        }
    }
}