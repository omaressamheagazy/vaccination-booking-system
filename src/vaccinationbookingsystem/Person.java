package vaccinationbookingsystem;

import java.sql.ResultSet;
import java.sql.SQLSyntaxErrorException;
import java.sql.Statement;
import java.util.ArrayList;

import vaccinationbookingsystem.Person;
import vaccinationbookingsystem.helper.Helper;
import vaccinationbookingsystem.Database.*;

public class Person {
    protected ArrayList<Appoinment> appointmentList = new ArrayList<Appoinment>();
    private String name;
    private int age;
    private String phoneNo;
    private String passportNo;

    public Person(String name, int age, String phoneNo, String passportNo) {
        this.name = name;
        this.age = age;
        this.phoneNo = phoneNo;
        this.passportNo = passportNo;
    }

    public Person() {
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getPhoneNumber() {
        return this.phoneNo;
    }

    public String getPassprotNumber() {
        return this.passportNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoneNumber(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setPassportNumber(String passportNo) {
        this.passportNo = passportNo;
    }

    /**
     * 
     * @return arra of appointment
     *         to show all available appointmetn
     */
    public ArrayList<Appoinment> getAppointmentData() {
        Statement stmt = null;
        try {
            stmt = (Statement) databaseController.connectToDatbase().createStatement();
            ResultSet rs = stmt.executeQuery("SELECT  * FROM Appointment");
            for (int i = 0; rs.next(); i++) {
                appointmentList.add(new Appoinment(rs.getInt("referece_No"), rs.getString("Appointment_date"),
                        rs.getString("PassportNo"), rs.getString("vaccine_name")));
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
}
