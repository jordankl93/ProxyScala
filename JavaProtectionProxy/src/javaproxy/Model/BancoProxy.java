/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproxy.Model;

/**
 *
 * @author Jordan
 */
public class BancoProxy extends BancoUsuarios{
    protected String usuario;
    protected String senha;

    public BancoProxy(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }
    
    @Override
    public String getNumeroUsuarios() {
        if (temPermissaoDeAcesso()) {
            return super.getNumeroUsuarios();
        }
        return "Login incorreto";
    }
 
    @Override
    public String getUsuarioConectados() {
        if (temPermissaoDeAcesso()) {
            return super.getUsuarioConectados();
        }
        return "Login incorreta";
    }
 
    private boolean temPermissaoDeAcesso() {
        return usuario.equals("admin") && senha.equals("admin");
    }
    
}
