/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja.testes;

import loja.model.clientes.Clientes;
import loja.model.clientes.IClientesDAO;
import loja.model.util.Factory;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author tiflami
 */
public class TesteClientes
{
    IClientesDAO clientesdao = Factory.createClientesDAO();
    
//    @Test
//    public void testFindById() {
//        
//        Clientes cliente = Factory.createCliente();
//        Integer userid = 3;
//        Clientes clienteEsperado = Factory.createCliente();
//        cliente = clientesdao.findById(userid);
//        System.out.println(cliente.getNome());
//        Assert.assertEquals(cliente, cliente);
//        
//    }
//    
//    @Test
//    public void testDelete(){
//        Clientes cliente = Factory.createCliente();
//        Integer userid = 3;  
//        Assert.assertEquals(true, clientesdao.delete(userid));
//    }
}
