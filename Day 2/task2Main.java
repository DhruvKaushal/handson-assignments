class task2Main {
    public static void main(String[] args){
        EmpRecords[] e = new EmpRecords[5];
        e[0] = new EmpRecords(1, "Dhruv", 51000);
        e[1] = new EmpRecords(2, "Tez", 44000);
        e[2] = new EmpRecords(3, "Slow", 60000);
        e[3] = new EmpRecords(4, "Raj", 33000);
        e[4] = new EmpRecords(5, "Anup", 55000);
        for(EmpRecords x : e){
            if(x.salary > 50000){
                x.display();
            }
        }
    }
}