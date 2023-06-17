package org.personal.com.ui;

import org.personal.com.dao.UserDao;
import org.personal.com.dto.UserDto;

import javax.swing.*;

public class User {
    private JPanel userPanel;
    private JButton signOutButton;
    private JMenu userMenu;
    private UserDto userDto;
    private UserDao userDao;
    private JMenuItem users, products, categories, suppliers, stocks, orders ;



    public User(UserDto userDto, UserDao userDao) {
        this.userDto = userDto;
        this.userDao = userDao;
    }

    public JPanel getUserPanel() {
        createUIComponents();
        userPanel.add(userMenu);
        return userPanel;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        userMenu = new JMenu("Explore");
        products = new JMenuItem("Products");
        users = new JMenuItem("Users");
        categories = new JMenuItem("Categories");
        stocks = new JMenuItem("Stocks");
        suppliers = new JMenuItem("Suppliers");
        orders = new JMenuItem("Orders");
        userMenu.add(products);
        userMenu.add(users);
        userMenu.add(categories);
        userMenu.add(stocks);
        userMenu.add(suppliers);
        userMenu.add(orders);




    }
}
