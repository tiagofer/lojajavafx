/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja.model.cargo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import loja.model.contracts.ICargoDAO;

/**
 *
 * @author tiflami
 */
@Entity
@Table(name = "Cargo")
public class Cargo
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCargo;
    private String nome;

    public Integer getIdCargo()
    {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo)
    {
        this.idCargo = idCargo;
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
