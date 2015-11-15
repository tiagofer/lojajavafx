/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja.model.util;

import loja.model.cargo.Cargo;
import loja.model.cargo.CargoDAO;
import loja.model.clientes.Clientes;
import loja.model.clientes.ClientesDAO;
import loja.model.clientes.IClientesDAO;
import loja.model.contracts.ICargoDAO;
import loja.model.contracts.IFuncionariosDAO;
import loja.model.contracts.IUsuariosDAO;
import loja.model.funcionarios.FuncionariosDAO;
import loja.model.usuarios.UsuariosDAO;

/**
 *
 * @author tiflami
 */
public class Factory
{
    public static IClientesDAO createClientesDAO()
    {
        return new ClientesDAO ();
    }
    
    public static Clientes createCliente()
    {
        return new Clientes();
    }
    
    public static Cargo createCargo()
    {
        return new Cargo ();
    }
    
    public static CargoDAO createCargoDAO()
    {
        return new CargoDAO ();
    }
    
    public static IFuncionariosDAO createFuncionarioDAO ()
    {
        return new FuncionariosDAO ();
    }

    public static IUsuariosDAO createUsuariosDAO ()
    {
        return new UsuariosDAO ();
    }
}
