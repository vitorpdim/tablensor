package application.gerador;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import java.security.SecureRandom;

public class GeradorController{

    @FXML private CheckBox chkMaiusculas;
    @FXML private CheckBox chkMinusculas;
    @FXML private CheckBox chkNumeros;
    @FXML private CheckBox chkEspeciais;

    @FXML private Button btnGerarSenha;
    @FXML private Button btnCopiarSenha;

    @FXML private TextField campoSenha;

    private final SecureRandom aleatorio = new SecureRandom();

    private static final String MINUSCULAS = "qwertyuiopasdfghjklzxcvbnm";
    private static final String MAIUSCULAS = "QWERTYUIOPASDFGHJKLZXCVBNM";
    private static final String NUMEROS = "0123456789";
    private static final String ESPECIAIS = "!@#$%&*()<>^~?[]+-";

    @FXML
    public void initialize(){
        btnGerarSenha.setOnAction(e -> gerarSenha());
        btnCopiarSenha.setOnAction(e -> copiarSenha());
    }

    private void gerarSenha(){
        int tamanho = 8 + aleatorio.nextInt(8);
        StringBuilder conjunto = new StringBuilder();

        if (chkMaiusculas.isSelected()){
            conjunto.append(MAIUSCULAS);
        }

        if (chkMinusculas.isSelected()){
            conjunto.append(MINUSCULAS);
        }

        if (chkNumeros.isSelected()){
            conjunto.append(NUMEROS);
        }

        if (chkEspeciais.isSelected()){
            conjunto.append(ESPECIAIS);
        }

        if (conjunto.length() == 0){
    campoSenha.setText("Selecione ao menos uma opção");
    return;
        }

        StringBuilder senha = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            int indice = aleatorio.nextInt(conjunto.length());
                    senha.append(conjunto.charAt(indice));
        }
        campoSenha.setText(senha.toString());
    }

    private void copiarSenha(){
        String senha = campoSenha.getText();

        if (senha != null && !senha.isEmpty()) {
            ClipboardContent conteudo = new ClipboardContent();
            conteudo.putString(senha);
            Clipboard.getSystemClipboard().setContent(conteudo);
        }
    }
}

