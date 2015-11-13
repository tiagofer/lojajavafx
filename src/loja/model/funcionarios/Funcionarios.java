/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja.model.funcionarios;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import loja.model.empresa.Empresa;

/**
 *
 * @author tiflami
 */
@Entity
@Table(name = "Funcionarios")
public class Funcionarios
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFuncionarios;
    private String nome;
    private String cpf;
    @ManyToOne
    private Empresa empresa;
}
