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
import loja.controller.screen.ScreenController;
import loja.controller.screen.ScreenFramework;

/**
 *
 * @author tiflami
 */
public class MenuAdmScreenController
{
    ScreenController controller;
    @FXML
    void loadCadastrClientes(ActionEvent event) {
        controller.setScreen(ScreenFramework.clientes);
    }

//    @FXML
//    void loadCadastrarEmpresa(ActionEvent event) {
//        controller.setScreen(ScreenFramework.)
//    }

    @FXML
    void loadCadastroFuncionarios(ActionEvent event) {
        controller.setScreen(ScreenFramework.funcionarios);
    }
    
    @FXML
    void loadCadastrarProdutos(ActionEvent event)
    {
        controller.setScreen(ScreenFramework.produtos);
    }
//    @FXML
//    void loadCadastrarFornecedor(ActionEvent event) {
//        controller.setScreen(ScreenFramework.)
//    }
    
    @FXML
    void goToVendas(ActionEvent event)
    {
        controller.setScreen(ScreenFramework.vendas);
    }
}
