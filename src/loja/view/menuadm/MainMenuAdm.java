/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja.view.menuadm;

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
public class MainMenuAdm extends Application
{
           private static Stage stage;
    
    @Override
    public void start(Stage stage) throws Exception
    {
        Parent parent = FXMLLoader.load(getClass().getResource("menuadm.fxml"));
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("Modulo Administrativo - Loja FX");
        stage.show();
        MainMenuAdm.stage = stage;
//        ScreenController.setStages(MainMenuAdm.stage);
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
