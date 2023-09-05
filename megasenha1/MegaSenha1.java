/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package megasenha1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author 55119
 * 
 * dia 4 de setembro, aparentemente, o arquivo fxml tem que ser apontado por uma classe fx com os metodos da propria javafx, não podendo ser aplicadas a main class
 */
public class MegaSenha1  {

    /**
     * @param args the command line arguments
     */
    public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Carrega o arquivo FXML
        FXMLLoader loader = new FXMLLoader(getClass().getResource("TelaInicio.fxml"));
        Parent root = loader.load();

        // Obtém o controlador da tela
        TelaInicioController controller = loader.getController();

        // Configura a cena
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Sua Aplicação");
        primaryStage.show();
    }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
        
        
    
    }

}