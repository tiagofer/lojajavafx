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
    
    public static ICargoDAO createCargoDAO()
    {
        return new CargoDAO ();
    }
}
