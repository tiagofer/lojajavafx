/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja.model.funcaosistema;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import loja.model.funcionarios.Funcionarios;

/**
 *
 * @author tiflami
 */
@Entity
@Table(name = "FuncaoSistema")
public class FuncaoSistema
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFuncaoSistema;
    private String nome;
    
//    @OneToMany(mappedBy = "Funcionarios")
//    private List<Funcionarios> Funcionarios;
//
//    public List<Funcionarios> getFuncionarios()
//    {
//        return Funcionarios;
//    }

    public Integer getIdFuncaoSistema()
    {
        return idFuncaoSistema;
    }

    public void setIdFuncaoSistema(Integer idFuncaoSistema)
    {
        this.idFuncaoSistema = idFuncaoSistema;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }
           
}
