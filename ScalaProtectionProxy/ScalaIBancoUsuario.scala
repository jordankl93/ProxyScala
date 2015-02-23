/*Interface em Scala pode ser representada pelos mixins.
Em Scala, quando uma classe é sub-classe de mixin, ela implementa aquela interface mixin e herda
todo o código contido no nele.*/
import java.util._

package ScalaProxyTrab

trait ScalaIBancoUsuario{

	def getNumeroUsuarios(): String
	def getUsuariosConectados(): String
	
}