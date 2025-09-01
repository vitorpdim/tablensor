package application.calculadora;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CalculadoraModel extends Application{


    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Calculadora.fxml"));
        Parent root = fxmlLoader.load();
        Scene tela = new Scene(root);
        stage.setTitle("Calculadora");
        stage.setResizable(false);
        stage.setScene(tela);
        stage.show();
    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }

}