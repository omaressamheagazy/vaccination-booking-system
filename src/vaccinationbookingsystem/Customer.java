package vaccinationbookingsystem;

import java.sql.ResultSet;
import java.sql.SQLSyntaxErrorException;
import java.sql.Statement;
import java.util.ArrayList;
import vaccinationbookingsystem.helper.Helper;
import vaccinationbookingsystem.Database.*;

public class Customer extends Person  {
    private Appoinment appoinment;
    public Customer(String name, int age, String phoneNo, String passportNo) {
        super(name,age, phoneNo, passportNo);
    }
    public Customer(){
        super();
    }
    /**
     * 
     * @param passportNumber
     * @return array of appointment 
     * it will be used to show the customer appointment 
     */

    
    public ArrayList<Appoinment> getAppointmentData(String passportNumber) {
        Statement stmt = null;
        try {
            stmt = (Statement) databaseController.connectToDatbase().createStatement();
            ResultSet rs = stmt.executeQuery("SELECT  * FROM Appointment");
            for (int i = 0; rs.next(); i++) {  // reterive the appointmetn data from the database
                if(rs.getString("PassportNo").equals(passportNumber)) {
                    appointmentList.add(new Appoinment(rs.getInt("referece_No"), rs.getString("Appointment_date"),
                            rs.getString("PassportNo"), rs.getString("vaccine_name")));
                }
            }
            return appointmentList;
        } catch (SQLSyntaxErrorException e) {
            Helper.showDialogMessage("SQL syntax that you entered is not correct", "error");
        } catch (java.sql.SQLException e) {
            Helper.showDialogMessage(e.toString(), "error");
        } catch (Exception e) {
            Helper.showDialogMessage(e.toString(), "error");
        }
        return null;
    }

    public Appoinment getAppoinment() {
        return this.appoinment;
    }

    /**
     * 
     * @param vaccineType
     * @param data
     * @param passportNo
     * responsible for making for appointment
     */
    public void makeAppoinment(String vaccineType, String data, String passportNo) {
        appoinment = new Appoinment();
        appoinment.getVaccine().setName(vaccineType);
        appoinment.setDate(data);
        appoinment.getCustomer().setPassportNumber(passportNo);
    }
}


