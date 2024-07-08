import java.io.FileNotFoundException;
import java.net.URL;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class OpenScene {
    public void showMainPageScene(Node node) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/Loginpage.fxml"));
            Parent nextPage = loader.load();

            Stage stage = (Stage) node.getScene().getWindow();
            Scene scene = new Scene(nextPage);
            stage.setScene(scene);

        } catch (Exception e) {
            System.out.println("Error in showMainPageScene: " + e.getMessage());
            e.printStackTrace();
        }

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/Registrasi.fxml"));
            Parent nextPage = loader.load();

            Stage stage = (Stage) node.getScene().getWindow();
            Scene scene = new Scene(nextPage);
            stage.setScene(scene);

        } catch (Exception e) {
            System.out.println("Error in showMainPageScene: " + e.getMessage());
            e.printStackTrace();
        }

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/Beranda.fxml"));
            Parent nextPage = loader.load();

            Stage stage = (Stage) node.getScene().getWindow();
            Scene scene = new Scene(nextPage);
            stage.setScene(scene);

        } catch (Exception e) {
            System.out.println("Error in showMainPageScene: " + e.getMessage());
            e.printStackTrace();
        }

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/Materi.fxml"));
            Parent nextPage = loader.load();

            Stage stage = (Stage) node.getScene().getWindow();
            Scene scene = new Scene(nextPage);
            stage.setScene(scene);

        } catch (Exception e) {
            System.out.println("Error in showMainPageScene: " + e.getMessage());
            e.printStackTrace();
        }

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/Tentangkamii.fxml"));
            Parent nextPage = loader.load();

            Stage stage = (Stage) node.getScene().getWindow();
            Scene scene = new Scene(nextPage);
            stage.setScene(scene);

        } catch (Exception e) {
            System.out.println("Error in showMainPageScene: " + e.getMessage());
            e.printStackTrace();
        }

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/Profile.fxml"));
            Parent nextPage = loader.load();

            Stage stage = (Stage) node.getScene().getWindow();
            Scene scene = new Scene(nextPage);
            stage.setScene(scene);

        } catch (Exception e) {
            System.out.println("Error in showMainPageScene: " + e.getMessage());
            e.printStackTrace();
        }
    }


}