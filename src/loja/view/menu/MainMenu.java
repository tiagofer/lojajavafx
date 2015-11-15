/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja.view.menu;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author tiflami
 */
public class MainMenu extends Application
{
       private static Stage stage;
    
    @Override
    public void start(Stage stage) throws Exception
    {
        Parent parent = FXMLLoader.load(getClass().getResource("menuusuario.fxml"));
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("Modulo Vendedor - Loja FX");
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
