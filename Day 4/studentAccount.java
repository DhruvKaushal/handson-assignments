public class studentAccount extends person {
    private char grade;
    public studentAccount(String name, String DOB, String gender, long phone, Address ad, char grade) {
        super(name, DOB, gender, phone, ad);
        this.grade = grade;
    }

    public void updateGrade(char grade){
        this.grade=grade;
    }
    @Override
    public void displayInfo(){
        System.out.println("-------------Student data-------------");
        System.out.println("Name: "+ getName());
        System.out.println("Gender: "+ getGender());
        System.out.println("Phone :" + getPhone());
        System.out.println("Grade: "+ this.grade);
        System.out.println("DOB: "+ getDOB());
        addDetails();
    }
}