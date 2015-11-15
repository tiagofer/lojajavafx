/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja.controller.funcionarios;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import loja.controller.login.LoginController;
import loja.controller.screen.ScreenController;
import loja.controller.screen.ScreenFramework;
import loja.model.cargo.Cargo;
import loja.model.cargo.CargoDAO;
import loja.model.funcaosistema.FuncaoSistema;
import loja.model.funcionarios.Funcionarios;
import loja.model.util.Factory;

/**
 *
 * @author tiflami
 */
public abstract class FuncionariosScreenController
{
    @FXML
    private TableColumn<String, Funcionarios> tblColNome;

    @FXML
    private TableColumn<String, Funcionarios> tblColId;

    @FXML
    private ComboBox<FuncaoSistema> cbBoxFuncaoSistema;

    @FXML
    private Button btnInsert;

    @FXML
    private Button btnUpdate;

    @FXML
    private TableColumn<String, Funcionarios> tblColEmpresa;

    @FXML
    private TextField txClientName;

    @FXML
    private TextField txClientTel;

    @FXML
    private TableColumn<String, Funcionarios> tblColCpf;

    @FXML
    private ComboBox<Cargo> cbBoxCargo;

    @FXML
    private TableColumn<String, Funcionarios> tblColCargo;

    @FXML
    private Button btnMenu;

    @FXML
    private TextField txClientAdress;

    @FXML
    private TableView<Funcionarios> tblFuncionarios;

    @FXML
    private Button btnDel;
    
    private CargoDAO cargodao;
    
    ScreenController controller;
    
    public void configureComboBox()
    {
        cargodao = Factory.createCargoDAO();
        cbBoxCargo.setItems(cargodao.list());
    }
    
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
