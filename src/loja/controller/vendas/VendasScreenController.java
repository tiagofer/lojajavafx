/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja.controller.vendas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import loja.controller.login.LoginController;
import loja.controller.screen.ScreenController;
import loja.controller.screen.ScreenFramework;

/**
 *
 * @author tiflami
 */
public class VendasScreenController
{
     @FXML
    private TextField txtPrecoUnitario;

    @FXML
    private Text textoSubTotal;

    @FXML
    private TextField txtTelefoneCliente;

    @FXML
    private HBox hBoxPane;

    @FXML
    private DatePicker dataCompra;

    @FXML
    private TableColumn<?, ?> tblColCod;

    @FXML
    private TextField txtCodCliente;

    @FXML
    private TextField txtDescricaoProduto;

    @FXML
    private TableColumn<?, ?> tblColDescricao;

    @FXML
    private TextField txtEnderecoCliente;

    @FXML
    private TextField txtCodProduto;

    @FXML
    private Button btnInserirCliente;

    @FXML
    private Button btnMenu;

    @FXML
    private Button btnInserirProduto;

    @FXML
    private ComboBox<?> cbClientes;

    @FXML
    private Button btnFecharVendas;

    @FXML
    private TextField txtQuantidadeProduto;

    @FXML
    private TableColumn<?, ?> tblColQuantidade;

    @FXML
    private Text textoTotal;

    @FXML
    private Button btnBuscarCliente;

    @FXML
    private Button btnBuscarProduto;

    @FXML
    private TableColumn<?, ?> tblColProduto;

    @FXML
    private TableColumn<?, ?> tblColValorUn;

    @FXML
    private TextField txtNomeCliente;

    @FXML
    private TableColumn<?, ?> tblColTotal;

    @FXML
    private TextField txtValorTotal;
    
    ScreenController controller;

    @FXML
    void efetivarVenda(ActionEvent event) {

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
