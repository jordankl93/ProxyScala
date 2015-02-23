import java.util._

package ScalaProxyTrab

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