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
public abstract class BancoUsuarios implements IBancoUsuarios {
    private int qtdUsuarios;
    private int usuariosOn;
    
    public BancoUsuarios() {
        qtdUsuarios = (int) (Math.random() * 100);
        usuariosOn = (int) (Math.random() * 10);
    }

    @Override
    public String getNumeroUsuarios() {
        return new String("Total de usuários: " + qtdUsuarios);
    }

    @Override
    public String getUsuarioConectados() {
        return new String("Usuários conectados: " + usuariosOn);
    }   
    
    
}
