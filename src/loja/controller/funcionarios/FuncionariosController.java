/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja.controller.funcionarios;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import loja.controller.screen.ILoadScreen;
import loja.controller.screen.ScreenController;


/**
 *
 * @author tiflami
 */
public class FuncionariosController extends FuncionariosScreenController implements Initializable, ILoadScreen
{

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
       
    }

    @Override
    public void setScreenParent(ScreenController screenPage)
    {
        super.controller = screenPage;
    }
    
}
