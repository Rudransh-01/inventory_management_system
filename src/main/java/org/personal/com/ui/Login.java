package org.personal.com.ui;

import org.personal.com.dao.UserDao;
import org.personal.com.dto.UserDto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JPanel loginPanel;
    private JTextField username;
    private JComboBox userType;
    private JPasswordField password;
    private JButton loginButton;
    private JLabel usernameLbl;
    private JLabel passwordLbl;
    private JButton login;
public Login() {
    initComponents();
}

private void initComponents(){

    login.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String usertype = userType.getSelectedItem().toString();
            String user = username.getText();
            String pass = String.valueOf(password.getPassword()) ;

            UserDto userdto = new UserDto(usertype,user,pass);

            UserDao userdao = new UserDao();

           if(userdao.authenticate(userdto)){
               JFrame frame = new JFrame(userdto.getUsername() + " ( "+ userdto.getUsertype()+" )");
               User userPage = new User(userdto,userdao);
               frame.setContentPane(userPage.getUserPanel());
               frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               frame.pack();
               frame.setVisible(true);
           }
           else{
               JOptionPane.showMessageDialog(
                       null,
                       "Invalid username or password.");
           }
        }
    });
}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        frame.setContentPane(new Login().loginPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
