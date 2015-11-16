/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja.controller.vendas;

import loja.controller.screen.ILoadScreen;
import loja.controller.screen.ScreenController;

/**
 *
 * @author tiflami
 */
public class VendasController extends VendasScreenController implements ILoadScreen
{
    @Override
    public void setScreenParent(ScreenController screenPage)
    {
        super.controller = screenPage;
    }
    
}
