package Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Service.config;

public class Uploadfile {
    public static boolean insertData(int ID, String Materi) {
        String query = "INSERT INTO upload (ID, Materi) VALUES (?, ?)";
        try (Connection conn = config.getConnection()) {
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, ID);
            pstmt.setString(2, Materi);
            int rowsAffected = pstmt.executeUpdate();
            System.out.println(rowsAffected + " row(s) inserted.");
            return true; 
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
 }
    }

    
}
