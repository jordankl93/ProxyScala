/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util._
import java.math._

trait ScalaIBancoUsuario{

	def getNumeroUsuarios(): String
	def getUsuariosConectados(): String
	
}

class BancoUsuarios{
	private var qtdUsuarios: Int = (Math.random() * 100).asInstanceOf[Int]
	private var usuariosOn: Int = (Math.random() * 10).asInstanceOf[Int]
	
	def getNumeroUsuarios(): String = "Total de usuários: " + qtdUsuarios	
	def getUsuariosConectados(): String = "Usuários conectados: " + usuariosOn
	
}

class BancoProxyScala(usuario: String, senha: String) extends BancoUsuarios {

	override def getNumeroUsuarios(): String = {
	        if (temPermissaoDeAcesso()) {
	            return super.getNumeroUsuarios()
	        }
	        return "Login incorreto"
    	}
	
	override def getUsuariosConectados(): String = {
	        if (temPermissaoDeAcesso()) {
	            return super.getUsuariosConectados()
	        }
	        return "Login incorreto"
    	}
	
	def temPermissaoDeAcesso(): Boolean = (usuario == "admin") && (senha == "admin")
	
}


object ScalaProxy {
	def main(args: Array[String]) {
		Console.println("Hacker acessando")
	        var banco = new BancoProxyScala("admin", "1234")
	        Console.println(banco.getNumeroUsuarios())
	        Console.println(banco.getUsuariosConectados())
	
	        Console.println("\nAdministrador acessando")
	        banco = new BancoProxyScala("admin", "admin")
	        Console.println(banco.getNumeroUsuarios())
	        Console.println(banco.getUsuariosConectados())
	}
}
