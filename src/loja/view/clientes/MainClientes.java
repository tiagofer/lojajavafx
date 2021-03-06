/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja.view.clientes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import loja.controller.screen.ScreenController;

/**
 *
 * @author tiflami
 */
public class MainClientes extends Application
{
    private static Stage stage;
    
    @Override
    public void start(Stage stage) throws Exception
    {
        Parent parent = FXMLLoader.load(getClass().getResource("clientes.fxml"));
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("Cadastro de Clientes - Loja FX");
        stage.show();
        MainClientes.stage = stage;
//        ScreenController.setStages(MainClientes.stage);
    }
    
    public static Stage getStage()
    {
        return stage;
    }
    
    public static void main (String[] args)
    {
        launch(args);
    }
    
}
