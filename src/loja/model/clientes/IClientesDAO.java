/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja.model.clientes;

import java.util.List;

/**
 *
 * @author tiflami
 */
public interface IClientesDAO
{
    public void add(Clientes cliente);
    public void delete(Clientes cliente);
    public List list ();
    public void update(Clientes cliente);
    public Clientes findById(Integer id);
}
