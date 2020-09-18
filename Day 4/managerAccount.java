public class managerAccount extends Employee {
    public managerAccount(String name, String DOB, String gender, long phone, int id, long salary, String designation, Address ad) {
        super(name, DOB, gender, phone, id, salary, designation, ad);
    }
    @Override
    public void displayInfo(){
        System.out.println("-------------Manager data-------------");
        System.out.println("ID: "+ getId());
        System.out.println("Name: "+ getName());
        System.out.println("Designation: "+getDesig());
        System.out.println("Salary: "+ getSal());
        System.out.println("Gender: "+ getGender());
        System.out.println("Phone :" + getPhone());
        addDetails();
    }
}