/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja.controller.produtos;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import loja.controller.login.LoginController;
import loja.controller.screen.ScreenController;
import loja.controller.screen.ScreenFramework;

/**
 *
 * @author tiflami
 */
public abstract class ProdutosScreenController
{
    
    @FXML
    private TableColumn<?, ?> tblColNome;

    @FXML
    private TableColumn<?, ?> tblColQuantidade;

    @FXML
    private Button btnRetornoClientes;

    @FXML
    private TableColumn<?, ?> tblColId;

    @FXML
    private Button btnInsert;

    @FXML
    private Button btnUpdate;

    @FXML
    private Button btnRetornoVendas;

    @FXML
    private TextField txClientName;

    @FXML
    private TextField txClientTel;

    @FXML
    private TableView<?> tblProdutosList;

    @FXML
    private TableColumn<?, ?> tblColDescricao;

    @FXML
    private TableColumn<?, ?> tblColValor;

    @FXML
    private TextField txClientCel;

    @FXML
    private TextField txClientAdress;

    @FXML
    private Button btnDel;

    @FXML
    private Button btnRetornoMenu;
    
    ScreenController controller;

    @FXML
    void goToClientes(ActionEvent event) {
        controller.setScreen(ScreenFramework.clientes);
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
