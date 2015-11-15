/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja.controller.produtos;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import loja.controller.screen.ILoadScreen;
import loja.controller.screen.ScreenController;

/**
 *
 * @author tiflami
 */
public class ProdutosController extends ProdutosScreenController implements Initializable,ILoadScreen
{

    @Override
    public void setScreenParent(ScreenController screenPage)
    {
        super.controller = screenPage;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
