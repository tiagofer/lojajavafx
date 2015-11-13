/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja.model.contracts;

import javafx.collections.ObservableList;
import loja.model.cargo.Cargo;

/**
 *
 * @author tiflami
 */
public interface ICargoDAO
{
    public ObservableList<Cargo> list();
}
