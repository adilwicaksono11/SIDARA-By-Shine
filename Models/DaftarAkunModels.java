package Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Service.config;

public class DaftarAkunModels {

    public static boolean insertData(int ID, String email, String Username, String password) {
        String query = "INSERT INTO register (ID, Username, email, password) VALUES (?, ?, ?, ?)";
        try (Connection conn = config.getConnection()) {
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, ID);
            pstmt.setString(2, email);
            pstmt.setString(3, Username);
            pstmt.setString(4, password);
            int rowsAffected = pstmt.executeUpdate();
            System.out.println(rowsAffected + " row(s) inserted.");
            return true; 
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
 }
    }
}
