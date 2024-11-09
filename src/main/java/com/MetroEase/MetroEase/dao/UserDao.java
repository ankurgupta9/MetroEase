// package com.MetroEase.MetroEase.dao;

// import com.MetroEase.MetroEase.model.User;
// import org.springframework.stereotype.Repository;
// import java.sql.*;

// @Repository
// public class UserDao {

//     private static final String JDBC_URL = "jdbc:mysql://localhost:3306/metroease_db";
//     private static final String DB_USERNAME = "root";
//     private static final String DB_PASSWORD = "";

//     public User findByUsername(String username) {
//         try (Connection conn = DriverManager.getConnection(JDBC_URL, DB_USERNAME, DB_PASSWORD);
//              PreparedStatement stmt = conn.prepareStatement("SELECT * FROM users WHERE username = ?")) {
//             stmt.setString(1, username);
//             ResultSet rs = stmt.executeQuery();
//             if (rs.next()) {
//                 User user = new User();
//                 user.setUsername(rs.getString("username"));
//                 user.setPassword(rs.getString("password"));
//                 return user;
//             }
//         } catch (SQLException e) {
//             e.printStackTrace();
//         }
//         return null;
//     }

//     public void save(User user) {
//         try (Connection conn = DriverManager.getConnection(JDBC_URL, DB_USERNAME, DB_PASSWORD);
//              PreparedStatement stmt = conn.prepareStatement("INSERT INTO users (username, password) VALUES (?, ?)")) {
//             stmt.setString(1, user.getUsername());
//             stmt.setString(2, user.getPassword());
//             stmt.executeUpdate();
//         } catch (SQLException e) {
//             e.printStackTrace();
//         }
//     }
// }

// package com.MetroEase.MetroEase.dao;

// import com.MetroEase.MetroEase.model.User;
// import org.springframework.stereotype.Repository;
// import java.sql.*;

// @Repository
// public class UserDao {

//     private static final String JDBC_URL = "jdbc:mysql://localhost:3306/metroease_db";
//     private static final String DB_USERNAME = "root";
//     private static final String DB_PASSWORD = "";

//     public User findByUsername(String username) {
//         try (Connection conn = DriverManager.getConnection(JDBC_URL, DB_USERNAME, DB_PASSWORD);
//              PreparedStatement stmt = conn.prepareStatement("SELECT * FROM users WHERE username = ?")) {
//             stmt.setString(1, username);
//             ResultSet rs = stmt.executeQuery();
//             if (rs.next()) {
//                 User user = new User();
//                 user.setUsername(rs.getString("username"));
//                 user.setPassword(rs.getString("password"));
//                 return user;
//             }
//         } catch (SQLException e) {
//             e.printStackTrace();
//         }
//         return null;
//     }

//     public void save(User user) {
//         try (Connection conn = DriverManager.getConnection(JDBC_URL, DB_USERNAME, DB_PASSWORD);
//              PreparedStatement stmt = conn.prepareStatement("INSERT INTO users (username, password) VALUES (?, ?)")) {
//             stmt.setString(1, user.getUsername());
//             stmt.setString(2, user.getPassword());
//             int rowsAffected = stmt.executeUpdate();
//             System.out.println("User saved successfully, rows affected: " + rowsAffected); // Debug statement
//         } catch (SQLException e) {
//             e.printStackTrace();
//         }
//     }
// }

package com.MetroEase.MetroEase.dao;

import com.MetroEase.MetroEase.model.User;
import org.springframework.stereotype.Repository;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import java.sql.*;

@Repository
public class UserDao {

    private static final String JDBC_URL = System.getenv("DB_URL"); //"jdbc:mysql://mysql.railway.internal:3306/railway";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = System.getenv("DB_PASSWORD"); //"gawWcXTtCbaEBTYpITsbHAYCNAGAqImh";

    public User findByUsername(String username) {
        try (Connection conn = DriverManager.getConnection(JDBC_URL, DB_USERNAME, DB_PASSWORD);
                PreparedStatement stmt = conn.prepareStatement("SELECT * FROM users WHERE username = ?")) {
            stmt.setString(1, username);
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

    public void save(User user) {
        System.out.println("Saving user: " + user.getUsername() + ", " +
                user.getPassword()); // Debug statement

        // Check if database connection works
        try (Connection conn = DriverManager.getConnection(JDBC_URL, DB_USERNAME,
                DB_PASSWORD);
                PreparedStatement stmt = conn
                        .prepareStatement("INSERT INTO users (username, password) VALUES (?, ?)")) {
            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getPassword());
            int rowsAffected = stmt.executeUpdate();

            System.out.println("Rows affected after save: " + rowsAffected); // Debug statement
        } catch (SQLException e) {
            System.out.println("Error saving user: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // public void save(User user) {
    // System.out.println("Saving user: " + user.getUsername() + ", " +
    // user.getPassword()); // Debug statement

    // // Hash the password before saving
    // BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    // String hashedPassword = passwordEncoder.encode(user.getPassword());

    // // Check if database connection works
    // try (Connection conn = DriverManager.getConnection(JDBC_URL, DB_USERNAME,
    // DB_PASSWORD);
    // PreparedStatement stmt = conn.prepareStatement("INSERT INTO users (username,
    // password) VALUES (?, ?)")) {
    // stmt.setString(1, user.getUsername());
    // stmt.setString(2, hashedPassword); // Save hashed password instead of plain
    // text

    // int rowsAffected = stmt.executeUpdate();
    // System.out.println("Rows affected after save: " + rowsAffected); // Debug
    // statement
    // } catch (SQLException e) {
    // System.out.println("Error saving user: " + e.getMessage());
    // e.printStackTrace();
    // }
    // }

}
