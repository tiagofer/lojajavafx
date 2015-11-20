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
import javax.persistence.EntityManager;
import loja.controller.screen.ILoadScreen;
import loja.controller.screen.ScreenController;
import loja.model.clientes.Clientes;
import loja.model.clientes.IClientesDAO;
import loja.model.util.Factory;
import loja.model.util.JPAUtil;

public class ClientesController extends ClientesScreenController implements Initializable, ILoadScreen{

    @FXML
    private Button btnInsert;
    
    @FXML
    private Button btnDel;

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
        setFieldsUpdate(null);
                
        tblClientList.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> setFieldsUpdate(newValue));
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
        tblColCelular.setCellValueFactory(new PropertyValueFactory<>("cel"));
        tblColEndereco.setCellValueFactory(new PropertyValueFactory<>("endereco"));
        tblColNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        tblColTelefone.setCellValueFactory(new PropertyValueFactory<>("telefone"));
        tblColId.setCellValueFactory(new PropertyValueFactory<>("idClientes"));
        tblColCpf.setCellValueFactory(new PropertyValueFactory<>("cpf"));
    }
    
    public void setFieldsUpdate(Clientes cliente)
    {
//       cliente = tblClientList.getSelectionModel().getSelectedItem();
        
        if (cliente != null)
        {
            txClientAdress.setText(cliente.getEndereco());
            txClientCel.setText(cliente.getCel());
            txClientName.setText(cliente.getNome());
            txClientTel.setText(cliente.getTelefone());
            txCpf.setText(cliente.getCpf());
        } else 
        {
            txClientAdress.setText("");
            txClientCel.setText("");
            txClientName.setText("");
            txClientTel.setText("");
            txCpf.setText(""); 
        }
       
    }
    
    @FXML
    public void deleteClientes(ActionEvent event)
    {
        Clientes cliente = tblClientList.getSelectionModel().getSelectedItem();
        IClientesDAO clientedao = Factory.createClientesDAO();
        clientedao.delete(cliente);
        listData();
    }
    
    @FXML
    public void updateData(ActionEvent event)
    {
        Clientes cliente = tblClientList.getSelectionModel().getSelectedItem();
        IClientesDAO clientedao = Factory.createClientesDAO();
        cliente.setNome(txClientName.getText());
        cliente.setCel(txClientCel.getText());
        cliente.setEndereco(txClientAdress.getText());
        cliente.setTelefone(txClientTel.getText());
        cliente.setCpf(txCpf.getText());
        clientedao.update(cliente);
        listData();
    }

    @Override
    public void setScreenParent(ScreenController screenPage)
    {
       super.controller = screenPage;
    }
    
    
}