/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja.controller.clientes;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import loja.controller.login.LoginController;
import loja.controller.screen.ScreenController;
import loja.controller.screen.ScreenFramework;

/**
 *
 * @author tiflami
 */
public abstract class ClientesScreenController
{
    ScreenController controller;
    
    @FXML
    void goToProdutos(ActionEvent event) {
        controller.setScreen(ScreenFramework.produtos);
    }

    @FXML
    void goToVendas(ActionEvent event) {
        controller.setScreen(ScreenFramework.vendas);
    }

    @FXML
    void goToMenu(ActionEvent event) {
        if (LoginController.getUsuarioLogado().equals("admin"))
        {
            controller.setScreen(ScreenFramework.mainMenuAdm);     
        } else {
            controller.setScreen(ScreenFramework.mainMenuUsu);
        }
       
    }
}
