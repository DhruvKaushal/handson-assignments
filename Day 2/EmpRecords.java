class EmpRecords {
    int id;
    String name;
    double salary;
    EmpRecords(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    void display(){
        System.out.println("ID: "+id + " Name: "+name+ " Salary: "+salary);
    }
}