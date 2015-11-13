/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja.controller.funcionarios;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import loja.model.cargo.Cargo;
import loja.model.cargo.CargoDAO;
import loja.model.contracts.ICargoDAO;
import loja.model.funcionarios.Funcionarios;
import loja.model.util.Factory;

/**
 *
 * @author tiflami
 */
public class FuncionariosController implements Initializable
{
    @FXML
    private TableColumn<String, Funcionarios> tblColNome;

    @FXML
    private TableColumn<String, Funcionarios> tblColId;

    @FXML
    private ComboBox<?> cbBoxFuncaoSistema;

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
    private ComboBox<?> cbBoxCargo;

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
    
    private ICargoDAO cargo;
    
    public FuncionariosController ()
    {
        cargo = Factory.createCargoDAO();
        cbBoxCargo.getItems().addAll(cargo.list());
    }

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
       
    }
    
}
