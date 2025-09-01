package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class MainMenuController{

    @FXML
    private MediaView mediaView;

    @FXML
    public void initialize(){
        String path = getClass().getResource("/videos/background.mp4").toExternalForm();
        Media media = new Media(path);
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);

        mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
        mediaView.setMediaPlayer(mediaPlayer);
    }


    @FXML
    private void abrirCalculadora() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/calculadora/Calculadora.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(loader.load()));
        stage.setTitle("Calculadora");
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    private void abrirGerador() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/gerador/Gerador.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(loader.load()));
        stage.setTitle("Gerador de Senhas");
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    private void abrirConversor() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/conversor/Conversor.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(loader.load()));
        stage.setTitle("Conversor de Temperatura");
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    private void abrirContador() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/contador/Contador.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(loader.load()));
        stage.setTitle("Contador de Cliques");
        stage.setResizable(false);
        stage.show();
    }

}