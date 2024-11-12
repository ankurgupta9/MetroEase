package com.MetroEase.MetroEase.dao;

import com.MetroEase.MetroEase.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.sql.*;

@Repository
public class UserDao {

    private static final String JDBC_URL ="jdbc:mysql://mysql.railway.internal:3306/railway";
    private static final String DB_USERNAME ="root";
    private static final String DB_PASSWORD ="gawWcXTtCbaEBTYpITsbHAYCNAGAqImh";
    private static final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    // Find user by trimmed username
    public User findByUsername(String username) {
        try (Connection conn = DriverManager.getConnection(JDBC_URL, DB_USERNAME, DB_PASSWORD);
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM users WHERE username = ?")) {

            stmt.setString(1, username.trim()); // Trim spaces before querying
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                User user = new User();
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                return user;
            }
        } catch (SQLException e) {
            System.out.println("Error finding user: " + e.getMessage());
            e.printStackTrace();
        }
        return null;
    }

    // Save new user with hashed password
    public void save(User user) {
        System.out.println("Saving user: " + user.getUsername().trim() + ", " + user.getPassword()); // Debug statement

        // Encrypt the password before storing it
        String hashedPassword = passwordEncoder.encode(user.getPassword());

        try (Connection conn = DriverManager.getConnection(JDBC_URL, DB_USERNAME, DB_PASSWORD);
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO users (username, password) VALUES (?, ?)")) {

            stmt.setString(1, user.getUsername().trim()); // Trim spaces before saving
            stmt.setString(2, hashedPassword); // Store the hashed password
            int rowsAffected = stmt.executeUpdate();

            System.out.println("Rows affected after save: " + rowsAffected); // Debug statement
        } catch (SQLException e) {
            System.out.println("Error saving user: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Method to verify user login
    public boolean validatePassword(String rawPassword, String storedPasswordHash) {
        return passwordEncoder.matches(rawPassword, storedPasswordHash);
    }
}


