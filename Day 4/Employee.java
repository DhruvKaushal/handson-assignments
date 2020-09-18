public abstract class Employee extends person {
    private int id;
    private long salary;
    private String designation;
    public Employee(String name,String DOB,String gender,long phone,int id,long salary,String designation,Address address){
        super(name,DOB,gender,phone,address);
        this.id=id;
        this.salary=salary;
        this.designation=designation;
    }
    public void updateSal(long salary){
        this.salary = salary;
    }
    public int getId(){
        return this.id;
    }
    public long getSal(){
        return this.salary;
    }
    public String getDesig(){
        return this.designation;
    }
    public abstract void displayInfo();
}