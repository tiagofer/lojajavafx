/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja.model.util;

import loja.view.clientes.MainClientes;
import loja.view.login.MainLogin;

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
}
