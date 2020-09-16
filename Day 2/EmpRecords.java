class EmpRecords {
    int id;
    String name;
    double salary;
    address Addr;
    EmpRecords(int id, String name, double salary, address Addr) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.Addr = Addr;
    }
    void display(){
        System.out.println("ID: "+id + " Name: "+name+ " Salary: "+salary);
    }
}