package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Mario;

public class JanelaMarioGame extends Application {

        public static void main(String[] args) {
            launch(args);
}

@Override
public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../view/FXMLMarioGame.fxml"));
        primaryStage.setTitle("SUPER MARIO BROS");
        primaryStage.setScene(new Scene(root, 700, 400));
        primaryStage.show();

        }
}