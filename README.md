# ProxyScala
Trabalho de padrão de projeto Proxy na linguagem Scala.

O objetivo principal do padrão de projeto Proxy, propoem fornecer um substituto ou marcador da localização de outro objeto
para controlar o acesso a esse objeto. Em outras palavras esse padrão. A principal vantagem de utilizar o Proxy é que, ao 
utilizar um substituto, podemos fazer desde operações otimizadas até proteção do acesso ao objeto. No entanto isto também 
pode ser visto como um problema, pois, como a responsabilidade de um proxy não é bem definida é necessário conhecer bem seu
comportamento para decidir quando utilizá-lo ou não.

Existem tipos de proxy com funções diferentes. O utilizado no trabalho foi o Protection Proxy que controla o acesso aos objetos, 
por exemplo, verificando se quem chama possui a devida permissão. Porém existem outros tipos como Virtual Proxy que mantem
informações sobre o objeto real, adiando o acesso/criação do objeto em si. O Remote Proxy, por sua vez, fornece um representante
local para um objeto em outro espaço de endereçamento. Por fim, o Smart Reference, este proxy é apenas um susbtituto simples para
executar ações adicionais quando o objeto é acessado, por exemplo para implementar mecanismos de sincronização de acesso ao objeto
original.
