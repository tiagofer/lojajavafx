package loja.testes;


//import java.util.ArrayList;
//import static java.util.Collections.list;
//import java.util.List;
//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;
import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import loja.model.cargo.CargoDAO;
import loja.model.contracts.ICargoDAO;
import loja.model.contracts.IFuncionariosDAO;
import loja.model.funcionarios.Funcionarios;
import loja.model.util.Factory;
//import loja.model.contracts.IFuncionariosDAO;
//import loja.model.funcionarios.Funcionarios;
//import loja.model.funcionarios.FuncionariosDAO;
//import loja.model.util.Factory;
import org.junit.Assert;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tiflami
 */

public class TesteFuncionarios
{
    IFuncionariosDAO funcionarios = Factory.createFuncionarioDAO();
    ObservableList<Funcionarios> funcList =  FXCollections.observableArrayList();
    
    @Test
    public void testeBuscaFuncionarios()
    {
        Assert.assertEquals(0, funcionarios.list().size());
    }
    
    @Test 
    public void testeFindByNameFuncionarios()
    {
        boolean retorno;
        retorno = funcionarios.findByName("Tiago");
        Assert.assertEquals(false, retorno);
    }
    
    @Test
    public void testeFindByCpfFuncionarios()
    {
        boolean retorno;
        retorno = funcionarios.findByCpf("3221232321");
        Assert.assertEquals(false, retorno);
    }
    
}
