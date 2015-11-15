/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja.controller.screen;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author tiflami
 */
public class ScreenFramework extends Application {
    
    public static String mainLogin = "main";
    public static String mainLoginFile = "/loja/view/login/login.fxml";
    
    public static String mainMenuAdm = "menuadm";
    public static String mainMenuAdmFile = "/loja/view/menuadm/menuadm.fxml";
    
    public static String mainMenuUsu = "menuusuario";
    public static String mainMenuUsuFile = "/loja/view/menu/menuusuario.fxml";
    
    public static String funcionarios = "funcionarios";
    public static String funcionariosFile = "/loja/view/funcionarios/funcionarios.fxml";
    
    public static String clientes = "clientes";
    public static String clientesFile = "/loja/view/clientes/clientes.fxml";
    
    public static String produtos = "produtos";
    public static String produtosFile = "/loja/view/produtos/produtos.fxml";
    
    public static String vendas = "vendas";
    public static String vendasFile = "/loja/view/vendas/vendas.fxml";
 
    
    
//    public static String screen3ID = "screen3";
//    public static String screen3File = "Screen3.fxml";
    
    
    @Override
    public void start(Stage primaryStage) {
        
        ScreenController mainContainer = new ScreenController();
        mainContainer.loadScreen(ScreenFramework.mainLogin, ScreenFramework.mainLoginFile);
        mainContainer.loadScreen(ScreenFramework.mainMenuAdm, ScreenFramework.mainMenuAdmFile);
        mainContainer.loadScreen(ScreenFramework.mainMenuUsu, ScreenFramework.mainMenuUsuFile);
        mainContainer.loadScreen(ScreenFramework.funcionarios, ScreenFramework.funcionariosFile);
        mainContainer.loadScreen(ScreenFramework.clientes, ScreenFramework.clientesFile);
        mainContainer.loadScreen(ScreenFramework.vendas, ScreenFramework.vendasFile);
        mainContainer.loadScreen(ScreenFramework.produtos, ScreenFramework.produtosFile);

//        mainContainer.loadScreen(ScreenFramework.screen3ID, ScreenFramework.screen3File);
        
        mainContainer.setScreen(ScreenFramework.mainLogin);
        
        Group root = new Group();
        root.getChildren().addAll(mainContainer);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
