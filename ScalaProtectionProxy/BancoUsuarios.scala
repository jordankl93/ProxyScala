import java.util._
import java.math._

package ScalaProxyTrab

class BancoUsuarios extends ScalaIBancoUsuario{
	private var qtdUsuarios: Int = (int) (Math.random() * 100)
	private var usuariosOn: Int = (int) (Math.random() * 10)
	
	override def getNumeroUsuarios(): String = "Total de usuários: " + qtdUsuarios	
	override def getUsuariosConectados(): String = "Usuários conectados: " + usuariosOn
	
}