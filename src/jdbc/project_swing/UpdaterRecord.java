package jdbc.project_swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdaterRecord extends JFrame {
    public static void main(String[] args) {

        //Create the frame on the event dispatching thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UpdaterRecord();
            }
        });

    }

    private JLabel messageLabel; //to hold message to user
    private JLabel nameLabel;
    private JLabel mobileLabel;
    private JLabel idLabel;
    private JLabel cityLabel;
    private JLabel salaryLabel;
    private JTextField nameTextField; //to hold a name text
    private JTextField mobile_noTextField; //to hold a mobile number
    private JTextField idTextField; //to hold id text
    private JTextField cityTextField; //to hold city text
    private JTextField salaryTextField; //to hold salary text
    private JButton updateRecordButton; //to hold button


    public UpdaterRecord(){

        //Window Title
        setTitle("Application");

        //size of window
        setSize(700, 700);

        //set layout
        setLayout(null);

        //specify an action for close button
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //create Labels
        messageLabel = new JLabel("Update Record Of An Employee");
        messageLabel.setFont(new Font("San Serif", Font.BOLD, 20));
        nameLabel = new JLabel("Name:");
        mobileLabel = new JLabel("Mobile No:");
        idLabel = new JLabel("Id No:");
        cityLabel = new JLabel("City:");
        salaryLabel = new JLabel("Salary:");

        //create text fields
        nameTextField = new JTextField();
        nameTextField.setToolTipText("Enter name of Employee");
        mobile_noTextField = new JTextField();
        mobile_noTextField.setToolTipText("Enter mobile number");
        idTextField = new JTextField();
        idTextField.setToolTipText("Enter id number");
        cityTextField = new JTextField();
        cityTextField.setToolTipText("City");
        salaryTextField = new JTextField();
        salaryTextField.setToolTipText("Enter Employees Salary");


        //create button component
        updateRecordButton = new JButton("Update Record");
        updateRecordButton.setMnemonic(KeyEvent.VK_S);
        updateRecordButton.setBackground(Color.GRAY);
        updateRecordButton.setForeground(Color.BLACK);

        //tell what the save button does
        updateRecordButton.addActionListener( e -> {
            if (e.getSource() == updateRecordButton){
                String getName, getMobile, getId, getCity, getSalary; //get all text
                getName = nameTextField.getText();
                getMobile = mobile_noTextField.getText();
                getId = idTextField.getText();
                getCity = cityTextField.getText();
                getSalary = salaryTextField.getText();

                try{

                    Class.forName(JDBC_DRIVER);
                    Connection connection = DriverManager.getConnection(SQL_URL, USER, PASS);

                    //query
                    String query =  "UPDATE employee SET idNo = '"+ getId +"', mobileNo = '" + getMobile +
                            "', city = '" + getCity + "', salary = '" + getSalary + "'WHERE name = '" + getName+ "'";

                    PreparedStatement statement = connection.prepareStatement(query);

                    //execute statement
                    int i = statement.executeUpdate();

                     if (i > 0){
                        JOptionPane.showMessageDialog(null,"Record Updated Successfully",
                                "Updated", JOptionPane.INFORMATION_MESSAGE );
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Update Error!",
                                "Error",JOptionPane.WARNING_MESSAGE);
                    }

                    //close all connections
                    statement.close();
                    connection.close();

                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null,ex.getMessage(), "Error",
                            JOptionPane.ERROR_MESSAGE);
                    // System.err.println(ex.getMessage());
                }

            }
        });

        //set bounds for labels and text fields
        messageLabel.setBounds(100, 30, 400, 30);
        nameLabel.setBounds(80, 70, 200, 30);
        mobileLabel.setBounds(80, 110, 200, 30);
        idLabel.setBounds(80, 150, 200, 30);
        cityLabel.setBounds(80, 190, 200, 30);
        salaryLabel.setBounds(80, 230, 200, 30);
        nameTextField.setBounds(300, 70, 200, 30);
        mobile_noTextField.setBounds(300, 110, 200, 30);
        idTextField.setBounds(300, 150, 200, 30);
        cityTextField.setBounds(300, 190, 200, 30);
        salaryTextField.setBounds(300, 230, 200, 30);
        updateRecordButton.setBounds(200, 280, 200, 30);


        //add components to content pane
        add(messageLabel);
        add(nameLabel);
        add(nameTextField);
        add(mobileLabel);
        add(mobile_noTextField);
        add(idLabel);
        add(idTextField);
        add(cityLabel);
        add(cityTextField);
        add(salaryLabel);
        add(salaryTextField);
        add(updateRecordButton);

        //display
        setVisible(true);
    }

    static final String USER = "root";
    static final String PASS = "CaLl911);c";
    static final String SQL_URL = "jdbc:mysql://localhost/testdatabase?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
}
