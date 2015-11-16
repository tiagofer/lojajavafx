/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja.controller.clientes;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import loja.controller.screen.ILoadScreen;
import loja.controller.screen.ScreenController;
import loja.model.clientes.Clientes;
import loja.model.clientes.ClientesDAO;
import loja.model.clientes.IClientesDAO;
import loja.model.util.Factory;

public class ClientesController extends ClientesScreenController implements Initializable, ILoadScreen{

    @FXML
    private Button btnInsert;

    @FXML
    private TableView<Clientes> tblClientList;
    
    @FXML
    private TableColumn<Clientes, String> tblColNome;

    @FXML
    private TableColumn<Clientes, String> tblColTelefone;

    @FXML
    private TableColumn<Clientes, String> tblColCelular;

    @FXML
    private TableColumn<Clientes, Integer> tblColId;
    
    @FXML
    private TableColumn<Clientes, String> tblColEndereco;
    
    @FXML
    private TableColumn<Clientes, String> tblColCpf;
    

    @FXML
    private TextField txClientCel;

    @FXML
    private TextField txClientName;

    @FXML
    private TextField txClientAdress;

    @FXML
    private TextField txClientTel;
    
    @FXML
    private TextField txCpf;
    
    ScreenController clientesController;
    
    @Override
    public void initialize(URL location, ResourceBundle resources)
    {   
        listData();
        btnInsert.setOnAction(new EventHandler<ActionEvent> () {

            @Override
            public void handle(ActionEvent event)
            {
               Clientes cliente = Factory.createCliente();
               IClientesDAO clientedao = Factory.createClientesDAO();
               cliente.setNome(txClientName.getText());
               cliente.setCel(txClientCel.getText());
               cliente.setEndereco(txClientAdress.getText());
               cliente.setTelefone(txClientTel.getText());
               cliente.setCpf(txCpf.getText());
               clientedao.add(cliente);
               initializeTable(clientedao);
               clearFields();
            }
            
        });
    }
    
    public void initializeTable(IClientesDAO clientedao)
    {
        mapCelValue();
        tblClientList.setItems((ObservableList<Clientes>) clientedao.list());
    }
    
    public void clearFields()
    {
        txClientAdress.setText("");
        txClientCel.setText("");
        txClientName.setText("");
        txClientTel.setText("");
        txCpf.setText("");
    }
    
    public void listData()
    {
      IClientesDAO clientedao = Factory.createClientesDAO();
      mapCelValue();
      tblClientList.setItems((ObservableList<Clientes>) clientedao.list());
    }
    
    public void mapCelValue()
    {
        tblColCelular.setCellValueFactory(new PropertyValueFactory<Clientes, String>("cel"));
        tblColEndereco.setCellValueFactory(new PropertyValueFactory<>("endereco"));
        tblColNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        tblColTelefone.setCellValueFactory(new PropertyValueFactory<>("telefone"));
        tblColId.setCellValueFactory(new PropertyValueFactory<>("idClientes"));
        tblColCpf.setCellValueFactory(new PropertyValueFactory<>("cpf"));
    }

    @Override
    public void setScreenParent(ScreenController screenPage)
    {
       super.controller = screenPage;
    }
}