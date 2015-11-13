/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja.model.cargo;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import loja.model.contracts.ICargoDAO;
import loja.model.funcionarios.Funcionarios;

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
    
    @Enumerated(EnumType.STRING)
    private TipoCargo nome;

    @OneToMany(mappedBy = "Funcionarios")
    private Funcionarios idFuncionarios;    
    
    public Integer getIdCargo()
    {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo)
    {
        this.idCargo = idCargo;
    }
}
