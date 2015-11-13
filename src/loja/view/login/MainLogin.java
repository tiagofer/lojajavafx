/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja.view.login;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author tiflami
 */
public class MainLogin extends Application
{
    
   private static Stage stage;
    
    @Override
    public void start(Stage stage) throws Exception
    {
        Parent parent = FXMLLoader.load(getClass().getResource("login.fxml"));
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("Login - Loja FX");
        stage.show();
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
