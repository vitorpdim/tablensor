package application.calculadora;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class CalculadoraController {

    private Double valor1 = null;
    private Double valor2 = null;
    private String operacao = null;

    @FXML
    private TextArea tela;

    //  NÚMEROS E SÍMBOLOS
    @FXML
    void digitar(ActionEvent event) {
        Button botao = (Button) event.getSource();
        String texto = botao.getText();
        tela.setText(tela.getText() + texto);
    }

    //  OPERAÇÕES
    @FXML
    void escolherOperacao(ActionEvent event) {
        try {
            valor1 = Double.parseDouble(tela.getText().replace(",", "."));
            tela.clear();
            Button botao = (Button) event.getSource();
            operacao = botao.getText();
        } catch (NumberFormatException e) {
            tela.setText("Erro");
        }
    }

    //  BOTÃO IGUAL
    @FXML
    void calcular(ActionEvent event) {
        try {
            valor2 = Double.parseDouble(tela.getText().replace(",", "."));

            double resultado = 0;

            switch (operacao) {
                case "+":
                    resultado = valor1 + valor2;
                    break;
                case "-":
                    resultado = valor1 - valor2;
                    break;
                case "X":
                    resultado = valor1 * valor2;
                    break;
                case "/":
                    if (valor2 == 0) {
                        tela.setText("Erro");
                        return;
                    }
                    resultado = valor1 / valor2;
                    break;
                case "%":
                    resultado = (valor1 * valor2) / 100;
                    break;
            }

            tela.setText(String.valueOf(resultado).replace(".", ","));
            valor1 = resultado;
            valor2 = null;

        } catch (NumberFormatException e) {
            tela.setText("Erro");
        }
    }

    //  BOTÕES DE LIMPAR/APAGAR
    @FXML
    void limparTela(ActionEvent event) {
        tela.clear();
    }

    @FXML
    void limparTudo(ActionEvent event) {
        valor1 = null;
        valor2 = null;
        operacao = null;
        tela.clear();
    }
}
