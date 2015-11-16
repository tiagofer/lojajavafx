/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja.controller.menu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import loja.controller.screen.ScreenController;
import loja.controller.screen.ScreenFramework;

/**
 *
 * @author tiflami
 */
public class MenuUsuScreenController
{
    ScreenController controller;
    
    @FXML
    void goToClientes(ActionEvent event) {
        controller.setScreen(ScreenFramework.clientes);
    }

    @FXML
    void goToProdutos(ActionEvent event) {
        controller.setScreen(ScreenFramework.produtos);
    }

    @FXML
    void goToVendas(ActionEvent event) {
        controller.setScreen(ScreenFramework.vendas);
    }

    
}
