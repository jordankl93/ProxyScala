/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproxy.App;

import javaproxy.Model.BancoProxy;
import javaproxy.Model.BancoUsuarios;

/**
 *
 * @author Jordan
 */
public class JavaProxy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hacker acessando");
        BancoUsuarios banco = new BancoProxy("admin", "1234");
        System.out.println(banco.getNumeroUsuarios());
        System.out.println(banco.getUsuarioConectados());

        System.out.println("\nAdministrador acessando");
        banco = new BancoProxy("admin", "admin");
        System.out.println(banco.getNumeroUsuarios());
        System.out.println(banco.getUsuarioConectados());
    }
    
}
