/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja.model.cargo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import loja.model.contracts.ICargoDAO;
import loja.model.util.JPAUtil;

/**
 *
 * @author tiflami
 */
public class CargoDAO implements ICargoDAO
{

    @Override
    public ObservableList<Cargo> list()
    {
        EntityManager manager = new JPAUtil().getEntityManager();
        Query query = manager.createQuery("select c from Cargo c");
        ObservableList<Cargo> listData = FXCollections.observableArrayList(query.getResultList());
        return listData;
    }
    
}
