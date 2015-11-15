/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja.controller.menu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import loja.controller.screen.ILoadScreen;
import loja.controller.screen.ScreenController;

/**
 *
 * @author tiflami
 */
public class MenuAdmController extends MenuAdmScreenController implements ILoadScreen
{
//    ScreenController menuAdmController;


    @Override
    public void setScreenParent(ScreenController screenPage)
    {
        super.controller = screenPage;
    }
    
}
