/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja.model.usuarios;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import loja.model.contracts.IUsuariosDAO;
import loja.model.util.JPAUtil;

/**
 *
 * @author tiflami
 */
public class UsuariosDAO implements IUsuariosDAO
{
    EntityManager manager = new JPAUtil().getEntityManager();
    @Override
    public void add(Usuarios usuario)
    {
        manager.getTransaction().begin();
        manager.persist(usuario);
        manager.getTransaction().commit();
        manager.close();
    }

    @Override
    public boolean findByLogin(String login)
    {
//        EntityManager manager = new JPAUtil().getEntityManager();
        Query query = manager.createQuery("Select u from Usuarios u where u.login=:pLogin");
        query.setParameter("pLogin", login);
//        manager.close();
        return !query.getResultList().isEmpty();
    }

    @Override
    public boolean findBySenha(String senha)
    {
        Query query = manager.createQuery("Select u from Usuarios u where u.senha=:pSenha");
        query.setParameter("pSenha", senha);
//        manager.close();
        return !query.getResultList().isEmpty();
    }
    
}
