package vaccinationbookingsystem.GUI.AdminUI;

import java.util.ArrayList;

import vaccinationbookingsystem.Person;
import vaccinationbookingsystem.Database.databaseController;
import vaccinationbookingsystem.helper.Helper;

/**
 *
 * @author Omar essam
 */
public class AdminDashboard extends javax.swing.JFrame {
    private String adminID = "";
    private int totalCustomerNumber;
    private int totalAppointmentNumber;
    private Person person = new Person();

    /**
     * Creates new form adminProfile
     */
    public AdminDashboard(String adminID) {
        // int appointmentNumber = databaseController.getDataFromDatabase("Appointment").size();
        totalCustomerNumber = databaseController.getDataFromDatabase("Customer").size();
        totalAppointmentNumber = person.getAppointmentData().size();
        this.adminID = adminID;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cusomterProfileLabel = new javax.swing.JLabel();
        cusomterProfileLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        totalAppointmentLabel = new javax.swing.JLabel();
        totalAppointmentValue = new javax.swing.JLabel();
        totalCustomerLabel = new javax.swing.JLabel();
        totalCustomerValue = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        setting = new javax.swing.JMenu();
        appointmentIcon = new javax.swing.JMenuItem();
        profileIcon = new javax.swing.JMenuItem();
        logOutIcon = new javax.swing.JMenuItem();

        cusomterProfileLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vaccinationbookingsystem/Assets/user-icon.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        cusomterProfileLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vaccinationbookingsystem/Assets/user-icon.png"))); // NOI18N
        cusomterProfileLabel1.setText("Welcome admin");

        totalAppointmentLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        totalAppointmentLabel.setText("Total number of appointment");

        totalAppointmentValue.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        totalAppointmentValue.setText(Integer.toString(totalAppointmentNumber));

        totalCustomerLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        totalCustomerLabel.setText("Total number of customers");

        totalCustomerValue.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        totalCustomerValue.setText(Integer.toString(totalCustomerNumber));

        setting.setText("Settings");

        appointmentIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vaccinationbookingsystem/Assets/appointment-icon.png"))); // NOI18N
        appointmentIcon.setText("Appoinment");
        appointmentIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        appointmentIcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointmentIconActionPerformed(evt);
            }
        });
        setting.add(appointmentIcon);

        profileIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vaccinationbookingsystem/Assets/account-icon.png"))); // NOI18N
        profileIcon.setText("Profile");
        profileIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profileIcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileIconActionPerformed(evt);
            }
        });
        setting.add(profileIcon);

        logOutIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vaccinationbookingsystem/Assets/logout-icon.png"))); // NOI18N
        logOutIcon.setText("Logout");
        logOutIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logOutIcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutIconActionPerformed(evt);
            }
        });
        setting.add(logOutIcon);

        jMenuBar1.add(setting);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cusomterProfileLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 122, Short.MAX_VALUE))
                            .addComponent(jSeparator1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(totalAppointmentLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(totalCustomerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(totalAppointmentValue, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(totalCustomerValue, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cusomterProfileLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalAppointmentLabel)
                    .addComponent(totalCustomerLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalCustomerValue, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalAppointmentValue))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    /**
     * if the user clicked on the appointemnt icno, the admin will be redeirected to the appointmetn page
     * @param evt
     */
    private void appointmentIconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointmentIconActionPerformed
        new adminAppointment(adminID).setVisible(true);
        dispose();
    }//GEN-LAST:event_appointmentIconActionPerformed

    /**
     * if the user clicked on the logout icon, the system will redirect the admin to the home page 
     * @param evt
     */
    private void logOutIconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutIconActionPerformed
        Helper.redirectToHomePage();
        dispose();
    }//GEN-LAST:event_logOutIconActionPerformed

    /**
     * if the  admin clicked on the profile icon, the system, will redirect the admin to the appointment page
     * @param evt
     */
    private void profileIconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileIconActionPerformed
        ArrayList<Person> person = databaseController.getDataFromDatabase("Admin");
        Person p = null;
        for (Person person2 : person) {
            if (person2.getPassprotNumber().equals(adminID)) // to catch the specifc person from the arary of perosn
            { 
                p = person2; // assigned the catched person, to p object and dispaly thier profile info
                break;
            }
        }
        new AdminProfile(p).setVisible(true);
        dispose();
    }//GEN-LAST:event_profileIconActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem appointmentIcon;
    private javax.swing.JLabel cusomterProfileLabel;
    private javax.swing.JLabel cusomterProfileLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenuItem logOutIcon;
    private javax.swing.JMenuItem profileIcon;
    private javax.swing.JMenu setting;
    private javax.swing.JLabel totalAppointmentLabel;
    private javax.swing.JLabel totalAppointmentValue;
    private javax.swing.JLabel totalCustomerLabel;
    private javax.swing.JLabel totalCustomerValue;
    // End of variables declaration//GEN-END:variables
}
