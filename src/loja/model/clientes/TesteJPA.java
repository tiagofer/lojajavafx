/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja.model.clientes;

import javax.persistence.EntityManager;
import loja.model.util.JPAUtil;

/**
 *
 * @author tiflami
 */
public class TesteJPA
{
    public static void main (String[] args)
    {
        Clientes cliente = new Clientes();
//        cliente.setIdClientes(2);
        cliente.setNome("Flavia");
        cliente.setEndereco("Rua x");
        cliente.setCel("2232222");
        cliente.setTelefone("1232323423");
        
        EntityManager manager = new JPAUtil().getEntityManager();
                        cliente.setNome("tiago");
                        System.out.println(cliente.getNome()); 
                        System.out.println(manager.find(Clientes.class, 1));

        manager.getTransaction().begin();
        manager.persist(cliente);
        manager.getTransaction().commit();
        manager.close();
        
        
    }
}
