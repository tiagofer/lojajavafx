/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja.model.funcaosistema;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
