package vaccinationbookingsystem;

public class Admin extends Person {
    
    public Admin(String name, int age, String phoneNo, String passportNo) {
        super(name,age, phoneNo, passportNo); // inovke the parent consturcuter
    }

    public Admin(){
        super(); // inovke the parent consturcuter 
    }
}
