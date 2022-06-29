package vaccinationbookingsystem.Database;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLSyntaxErrorException;
import java.sql.Statement;
import java.util.ArrayList;

import vaccinationbookingsystem.Person;
import vaccinationbookingsystem.helper.Helper;

import java.sql.Connection;

public class databaseController {
    /**
     * 
     * @return return the connection object
     * this fuctioun is resposible for maknig the connectiong with a database
     */
    public static Connection connectToDatbase() {
        try {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://remotemysql.com:3306/ofsj3dwiCu";
            String username = "ofsj3dwiCu";
            String password = "aoiKDdP6x3";
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, username, password);
            return con;
        } catch (Exception e) {
            Helper.showDialogMessage(e.toString(), "error");

        }
        return null;
    }
    /**
     *  this function accept a query that it's reposible for inserting data into the database
     * @param query
     * @throws Exception
     */
    public static void insertToTable(String query) throws Exception {
        Statement stmt = null;
        try {
            stmt = (Statement) connectToDatbase().createStatement();
            stmt.executeUpdate(query);
        } catch (java.sql.SQLIntegrityConstraintViolationException e) {
            Helper.showDialogMessage("You already registered", "info");
        } catch (Exception e) {
            Helper.showDialogMessage("An error happened, please try again", "error");
        }
    }
    
    /**
     * this function accept a query that it's reposible for updateting  data in the database
     * 
     * @param query
     * @throws Exception
     */
    public static void updateTable(String query) throws Exception {
        Statement stmt = null;
        try {
            PreparedStatement preparedStmt = connectToDatbase().prepareStatement(query);
            preparedStmt.executeUpdate();
        } catch (Exception e) {
            Helper.showDialogMessage(e.toString(), "error");
        }
    }

    /**
     * 
     * @param name
     * @param age
     * @param PhoneNo
     * @param passportNo
     * @return a specific query for a cusotmer table, to be used in the insertTable fucntoin 
     */
    public static String cusotmerTableQuery(String name, int age, String PhoneNo, String passportNo) {
        String query = String.format(
                "INSERT INTO Customer(name, age, phoneNo, passportNO) VALUES ('%s', %d, '%s','%s')", name, age,
                PhoneNo, passportNo);
        return query;
    }

    /**
     * 
     * @param name
     * @param age
     * @param PhoneNo
     * @param passportNo
     * @return a specific query for a admin table, to be used in the insertTable fucntoin
     */
    public static String adminTableQuery(String name, int age, String PhoneNo, String passportNo) {
        String query = String.format(
                "INSERT INTO Admin(name, age, phoneNo, passportNO) VALUES ('%s', %d, '%s','%s')", name, age,
                PhoneNo, passportNo);
        return query;
    }
    /**
     * 
     * @param name
     * @param age
     * @param PhoneNo
     * @param passportNo
     * @return a specific query for updating the cusotmer table, to be used in the updateTable fucntoin
     */
    public static String updateCustomerQuery(String name, int age, String PhoneNo, String passportNo) {
        String query = String.format(
                "UPDATE  Customer SET name = '%s', age = %d , phoneNo = '%s'  WHERE  passportNO = '%s'", name, age,
                PhoneNo, passportNo);
        return query;
    }
    /**
     * 
     * @param name
     * @param age
     * @param PhoneNo
     * @param passportNo
     * @return a specific query for updating the admin table, to be used in the updateTable function
     */
    public static String updateAdminQuery(String name, int age, String PhoneNo, String passportNo) {
        String query = String.format(
                "UPDATE  Admin SET name = '%s', age = %d , phoneNo = '%s'  WHERE  passportNO = '%s'", name, age,
                PhoneNo, passportNo);
        return query;
    }
    /**
     * 
     * @param date
     * @param cusotmerID
     * @param vaccineName
     * @return a specific query for inserting data in the appointment table
     */
    public static String appointmentTableQuery(String date, String cusotmerID, String vaccineName) {
        String query = String.format(
                "INSERT INTO Appointment(Appointment_date, PassportNO, vaccine_name) VALUES ('%s', '%s', '%s')", date,
                cusotmerID,
                vaccineName);
        return query;
    }
    /**
     * 
     * @param datbaseName
     * @return f array of person (Users), form database
     */
    public static ArrayList<Person> getDataFromDatabase(String datbaseName) {
        Statement stmt = null;
        ArrayList<Person> list = new ArrayList<Person>();
        try {
            stmt = (Statement) connectToDatbase().createStatement();
            ResultSet rs = stmt.executeQuery("SELECT  * FROM " + datbaseName);
            for (int i = 0; rs.next(); i++) {
                list.add(new Person(rs.getString("Name"), rs.getInt("Age"),
                        rs.getString("PhoneNo"), rs.getString("PassportNo")));
            }
            return list;
        } catch (SQLSyntaxErrorException e) {
            Helper.showDialogMessage("SQL syntax that you entered is not correct", "error");
        } catch (java.sql.SQLException e) {
            Helper.showDialogMessage("Table is emtpy", "warnning");
        } catch (Exception e) {
            Helper.showDialogMessage("unexpected error happened", "error");
        }
        return null;
    }
    /**
     * chekc if given perosn exist or not in the database
     * @param ID
     * @param databaseData
     * @return true --> user is exist, false --> user not exist
     */
    public static boolean isPersonIdExist(String ID, ArrayList<Person> databaseData) {
        ArrayList<Person> list = databaseData;
        for (Person person : list) {
            if (person.getPassprotNumber().equals(ID)) {
                return true;
            }
        }
        return false;
    }
}

/*
 * Database details
 * 
 * 
 * Username: ofsj3dwiCu
 * 
 * Database name: ofsj3dwiCu
 * 
 * Password: aoiKDdP6x3
 * 
 * Server: remotemysql.com
 * 
 * Port: 3306
 * 
 */