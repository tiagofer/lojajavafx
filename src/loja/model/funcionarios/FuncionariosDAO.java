/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja.model.funcionarios;

import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import loja.model.contracts.IFuncionariosDAO;
import loja.model.util.JPAUtil;

/**
 *
 * @author tiflami
 */
public class FuncionariosDAO implements IFuncionariosDAO
{

    @Override
    public void add(Funcionarios funcionario)
    {
        EntityManager manager = new JPAUtil().getEntityManager();
        manager.getTransaction().begin();
        manager.persist(funcionario);
        manager.getTransaction().commit();
        manager.close();
    }

    @Override
    public void delete(Funcionarios cliente)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ObservableList<Funcionarios> list()
    {
        EntityManager manager = new JPAUtil().getEntityManager();
        Query query = manager.createQuery("Select f from Funcionarios f");
        ObservableList<Funcionarios> list = FXCollections.observableArrayList(query.getResultList());
        return list;
    }

    @Override
    public boolean findByName(String name)
    {
       EntityManager manager = new JPAUtil().getEntityManager();
       Query query = manager.createQuery("Select f from Funcionarios f where f.nome=:pNome");
       query.setParameter("pNome", name);
       return !query.getResultList().isEmpty();    
    }
    
    @Override
    public boolean findByCpf (String cpf)
    {
       EntityManager manager = new JPAUtil().getEntityManager();
       Query query = manager.createQuery("Select f from Funcionarios f where f.cpf=:pCpf");
       query.setParameter("pCpf", cpf);
       return !query.getResultList().isEmpty();              
    }
    
}
