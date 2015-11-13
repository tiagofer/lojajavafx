/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja.model.empresa;

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
@Table (name = "Empresa")
public class Empresa
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEmpresa;
    private String razaoSocial;
    private String endereco;
    private String cnpj;
    private String telefone;
    private String cel;

    public Integer getIdEmpresa()
    {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa)
    {
        this.idEmpresa = idEmpresa;
    }

    public String getRazaoSocial()
    {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial)
    {
        this.razaoSocial = razaoSocial;
    }

    public String getEndereco()
    {
        return endereco;
    }

    public void setEndereco(String endereco)
    {
        this.endereco = endereco;
    }

    public String getCnpj()
    {
        return cnpj;
    }

    public void setCnpj(String cnpj)
    {
        this.cnpj = cnpj;
    }

    public String getTelefone()
    {
        return telefone;
    }

    public void setTelefone(String telefone)
    {
        this.telefone = telefone;
    }

    public String getCel()
    {
        return cel;
    }

    public void setCel(String cel)
    {
        this.cel = cel;
    }
}
