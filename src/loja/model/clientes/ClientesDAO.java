/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja.model.clientes;

import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import loja.model.util.JPAUtil;

/**
 *
 * @author tiflami
 */
public class ClientesDAO implements IClientesDAO
{

    @Override
    public void add(Clientes cliente)
    {
        EntityManager manager = new JPAUtil().getEntityManager();
        manager.getTransaction().begin();
        manager.persist(cliente);
        manager.getTransaction().commit();
        manager.close();
    }

    @Override
    public void delete(Clientes cliente)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ObservableList<Clientes> list()
    {
         EntityManager manager = new JPAUtil().getEntityManager();
         Query query = manager.createQuery("select m from Clientes m");
         ObservableList<Clientes> clientesData = FXCollections.observableArrayList(query.getResultList());
         return clientesData;
    }

    @Override
    public Clientes find(String name)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
