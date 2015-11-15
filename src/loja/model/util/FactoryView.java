/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja.model.util;

import loja.view.clientes.MainClientes;
import loja.view.login.MainLogin;
import loja.view.menu.MainMenu;
import loja.view.menuadm.MainMenuAdm;

/**
 *
 * @author tiflami
 */
public class FactoryView
{
    public static MainLogin createMainLogin()
    {
        return new MainLogin();
    }
    
    public static MainClientes createMainClientes()
    {
        return new MainClientes();
    }
    
    public static MainMenu createMainMenu()
    {
        return new MainMenu();
    }
    
    public static MainMenuAdm createMainMenuAdm()
    {
        return new MainMenuAdm ();
    }
}
