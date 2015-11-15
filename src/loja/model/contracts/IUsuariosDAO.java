/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja.model.contracts;

import loja.model.usuarios.Usuarios;

/**
 *
 * @author tiflami
 */
public interface IUsuariosDAO
{
    public void add(Usuarios usuario);
    public boolean findByLogin(String login);
    public boolean findBySenha(String senha);
}
