/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja.controller.login;

import java.net.URL;
import java.time.Clock;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventDispatcher;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import loja.controller.screen.ILoadScreen;
import loja.controller.screen.ScreenController;
import loja.controller.screen.ScreenFramework;
import loja.model.contracts.IUsuariosDAO;
import loja.model.usuarios.UsuariosDAO;
import loja.model.util.Factory;
import loja.model.util.FactoryView;
import loja.view.login.MainLogin;
import loja.view.menu.MainMenu;
import loja.view.menuadm.MainMenuAdm;

/**
 *
 * @author tiflami
 */
public class LoginController implements Initializable, ILoadScreen
{
    @FXML
    private AnchorPane idAnchorPane;

     @FXML
    private PasswordField txPassword;

    @FXML
    private Label lbPassword;

    @FXML
    private Button btnLogin;

    @FXML
    private Label lbLogin;

    @FXML
    private TextField txLogin;
    
    private IUsuariosDAO usuariodao;
    
    private static String usuarioLogado;

    public static String getUsuarioLogado()
    {
        return usuarioLogado;
    }
    
    ScreenController loginController;
    
    @Override
    public void setScreenParent(ScreenController screenPage)
    {
        loginController = screenPage;
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        usuariodao = Factory.createUsuariosDAO();
        btnLogin.setOnAction(new EventHandler<ActionEvent> () 
        {

            @Override
            public void handle(ActionEvent event)
            {
                logar(usuariodao, event);
            }
            
        });
    }
    
    public void logar(IUsuariosDAO usuariodao, ActionEvent event)
    {
        if ((usuariodao.findByLogin(txLogin.getText())) && (usuariodao.findBySenha(txPassword.getText())))
        {
            if (txLogin.getText().equals("admin"))
            {
                try
                {
                    LoginController.usuarioLogado = "admin";
                    goToMainMenuAdm(event);
                    
                } catch (Exception e)
                {
                 e.printStackTrace();
//                    JOptionPane.showMessageDialog(null, "Impossível carregar o Módulo Administrativo", "Erro",JOptionPane.ERROR_MESSAGE);
//                    System.exit(0);
                }
                
            }else
            if (txLogin.getText().equals("usu"))
                {
                 try
                {
                    LoginController.usuarioLogado = "usu";
                    goToMainMenuUsu(event);
                } catch (Exception e)
                {
                    e.printStackTrace();
                }   
                 
                }    
        } else 
        {
            JOptionPane.showMessageDialog(null, "Usuario ou senha incorreto", "Erro",JOptionPane.ERROR_MESSAGE);
        }
    }//fim logar
    
    private void goToMainMenuAdm(ActionEvent event)
    {
        loginController.setScreen(ScreenFramework.mainMenuAdm);
    }
    
    private void goToMainMenuUsu(ActionEvent event)
    {
        loginController.setScreen(ScreenFramework.mainMenuUsu);
    }

}
