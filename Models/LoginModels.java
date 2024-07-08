package Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Service.config;

public class LoginModels {

    public static boolean login(String email , String Username , String password) {
        String query = "SELECT * FROM register WHERE  email = ? AND Username = ? AND password = ?";
        try (Connection conn = config.getConnection()) {
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, email);
            pstmt.setString(2, Username);
            pstmt.setString(3, password);
            ResultSet rs = pstmt.executeQuery();
            return rs.next(); 
        } catch (SQLException e) {
            System.err.println("Error in login method");
            e.printStackTrace();
            return false;
      }
    }
}

