/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja.model.funcaosistema;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import loja.model.contracts.IFuncaoSistemaDAO;
import loja.model.util.JPAUtil;

/**
 *
 * @author tiflami
 */
public class FuncaoSistemaDAO implements IFuncaoSistemaDAO
{

    @Override
    public ObservableList<FuncaoSistema> list()
    {
        EntityManager manager = new JPAUtil().getEntityManager();
        Query query  = manager.createQuery("select fs from FuncaoSistema fs where nome");
        ObservableList<FuncaoSistema> fsNameList= FXCollections.observableArrayList(query.getResultList());
        return fsNameList;
    }
    
}
