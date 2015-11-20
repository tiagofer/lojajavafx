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
        EntityManager manager = new JPAUtil().getEntityManager();
        manager.getTransaction().begin();
        manager.merge(cliente);
        manager.remove(manager.getReference(Clientes.class, cliente.getIdClientes()));
        manager.getTransaction().commit();
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
    public void update(Clientes cliente)
    {
        EntityManager manager = new JPAUtil().getEntityManager();
        manager.getTransaction().begin();
        manager.merge(cliente);
        manager.getTransaction().commit();
    }

    @Override
    public Clientes findById(Integer id)
    {
        EntityManager manager = new JPAUtil().getEntityManager();
        Query query = manager.createQuery("select c from Clientes c where c.idClientes=:pId");
        query.setParameter("pId", id);
        Clientes cliente = (Clientes) query.getSingleResult();
        return cliente;
    }
    
}
