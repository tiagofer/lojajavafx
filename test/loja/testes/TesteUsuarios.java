/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja.testes;

import junit.framework.Assert;
import loja.model.usuarios.UsuariosDAO;
import org.junit.Test;

/**
 *
 * @author tiflami
 */
public class TesteUsuarios
{
    @Test
    public void testeFindByLogin(){
        UsuariosDAO usuariodao = new UsuariosDAO();
        boolean retorno;
        retorno = usuariodao.findByLogin("admin");
        Assert.assertEquals(true, retorno);
    }
}
