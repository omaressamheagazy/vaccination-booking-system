package vaccinationbookingsystem;

enum availableAppoinment {
    SUNDAY,
    MONDAY,
    FRIDAY
}
public class Appoinment {
    private String date;
    private int referenceNo;
    private Vaccine vaccine = new Vaccine();
    private Customer customer = new Customer();
    public Appoinment() {
    }
    public Appoinment(int referenceNo, String data, String passportNo, String vaccineType) {
        this.referenceNo = referenceNo;
        this.vaccine.setName(vaccineType);
        this.date = data;
        this.customer.setPassportNumber(passportNo);
    };
    public String getDate() {
        return this.date;
    }
    public Vaccine getVaccine() {
        return this.vaccine;
    }
    public Customer getCustomer() {
        return this.customer;
    }
    public int getReferenceNo() {
        return this.referenceNo;
    }

    public void setDate(String date) {
        this.date = date;
    } 
    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    } 
    public void set(Customer customer) {
        this.customer = customer;
    } 
}
