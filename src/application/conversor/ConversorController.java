package application.conversor;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class ConversorController {

    @FXML private ComboBox<String> comboDe;
    @FXML private ComboBox<String> comboPara;

    @FXML private TextField campoEntrada;
    @FXML private TextField campoSaida;

    @FXML
    private void initialize(){
        comboDe.getItems().addAll("Celsius","Kelvin","Fahrenheit");
        comboPara.getItems().addAll("Celsius","Kelvin","Fahrenheit");
    }

    @FXML
    private void calcular(){

        Double valor = Double.valueOf(campoEntrada.getText());

        String de = comboDe.getValue();
        String para = comboPara.getValue();


        if (de.equals("Celsius")){
            if (para.equals("Celsius")){
                campoSaida.setText(String.format("%.2f",valor));
            } else if (para.equals("Kelvin")) {
                campoSaida.setText(String.format("%.2f",(valor + 273.15)));
            } else if (para.equals("Fahrenheit")) {
                campoSaida.setText(String.format("%.2f",valor * 9/5 + 32));
            }
        }

        if (de.equals("Kelvin")){
            if (para.equals("Kelvin")){
                campoSaida.setText(String.format("%.2f",valor));
            } else if (para.equals("Celsius")) {
                campoSaida.setText(String.format("%.2f",(valor - 273.15)));
            } else if (para.equals("Fahrenheit")) {
                campoSaida.setText(String.format("%.2f",((valor - 273.15) * 9/5 + 32)));
            }
        }

        if (de.equals("Fahrenheit")){
            if (para.equals("Fahrenheit")){
                campoSaida.setText(String.format("%.2f",valor));
            } else if (para.equals("Celsius")) {
                campoSaida.setText(String.format("%.2f",(valor - 32) * 5.0/9.0));
            } else if (para.equals("Kelvin")) {
                campoSaida.setText(String.format("%.2f",((valor - 32) * 5.0/9.0 + 273.15)));
            }
        }
    }

    @FXML
    private void limpar(){
        campoEntrada.setText(null);
        campoSaida.setText(null);
    }
}