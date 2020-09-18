public abstract class person{
    private String name;
    private String DOB;
    private String gender;
    private long phone;
    private Address address;
    
    public person(String name, String DOB, String gender, long phone, Address address){
        this.name = name;
        this.DOB = DOB;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
    }
    public String getName(){
        return this.name;
    }

    public String getDOB(){
        return this.DOB;
    }

    public String getGender(){
        return this.gender;
    }

    public long getPhone(){
        return this.phone;
    }
    public void addDetails(){
        System.out.println("city: "+address.city+" State: "+address.state);
    }

    public abstract void displayInfo();
}