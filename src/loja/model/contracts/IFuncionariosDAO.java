/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja.model.contracts;

import java.util.List;
import javafx.collections.ObservableList;
import loja.model.funcionarios.Funcionarios;

/**
 *
 * @author tiflami
 */
public interface IFuncionariosDAO
{
     public void add(Funcionarios cliente);
    public void delete(Funcionarios cliente);
    public ObservableList<Funcionarios> list ();
    public boolean findByName (String name);
    public boolean findByCpf(String cpf);
}
