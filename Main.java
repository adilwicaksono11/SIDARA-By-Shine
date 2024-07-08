import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;



public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader loader = new FXMLLoader();
            URL fxmlLocation = Main.class.getResource("/View/Loginpage.fxml");
            System.out.println("FXML Location: " + fxmlLocation);
            if (fxmlLocation == null) {
                throw new IOException("FXML file not found");
            }
            loader.setLocation(fxmlLocation);
            AnchorPane root = loader.load();

            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Loginpage");
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
