package application.contador;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ContadorController {

     @FXML
     private Label labelContador;
     private int contador = 0;

     @FXML
     public void incrementar(){
         contador++;
         atualizarLabel();
     }

    @FXML
    public void diminuir(){
        contador--;
        atualizarLabel();
    }

    @FXML
    public void resetar(){
        contador = 0;
        atualizarLabel();
    }

     public void atualizarLabel(){
         labelContador.setText(String.format("%02d", contador));
     }


}