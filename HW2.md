# 2.1 What are the relationships with other architecture styles?(Quais s�o as rela��es com outros estilos de arquitetura?)
 
![1 imagem](https://user-images.githubusercontent.com/13456954/37304550-a8d067d6-2610-11e8-8e5c-e46cf08f4b4b.jpg)


Business services are coarse-grained services that define core business operations. They are usually represented through XML, Web Services Definition Language (WSDL) or Business Process Execution Language (BPEL).
Enterprise services implement the functionality defined by business services. They rely on application services and infrastructure services to fulfill business requests.
Application services are fine-grained services that are bound to a specific application context. These services can be invoked directly through a dedicated user interface.
Infrastructure services implement non-functional tasks such as authentication, auditing, security, and logging. They can be invoked from either application services or enterprise services.

 
 
![2 imagem](https://user-images.githubusercontent.com/13456954/37304552-a8fd8d88-2610-11e8-8c2e-86ee3163093b.jpg)
 
![3 imagem](https://user-images.githubusercontent.com/13456954/37304554-a92f6970-2610-11e8-911c-896c69d8feb9.png)
![4 imagem](https://user-images.githubusercontent.com/13456954/37304556-a95d15dc-2610-11e8-9003-1d89fb1c972e.png)




# 2.2. What are the relations between microservices and Twelve-Factor apps?(Quais s�o as rela��es entre microservices e aplicativos doze fatores?)

Tendo em vista que os Twelve-Factor apps s�o os seguintes:
I. Base de C�digo
Uma base de c�digo com rastreamento utilizando controle de revis�o, muitos deploys
II. Depend�ncias
Declare e isole as depend�ncias
III. Configura��es
Armazene as configura��es no ambiente
IV. Servi�os de Apoio
Trate os servi�os de apoio, como recursos ligados
V. Build, release, run
Separe estritamente os builds e execute em est�gios
VI. Processos
Execute a aplica��o como um ou mais processos que n�o armazenam estado
VII. V�nculo de porta
Exporte servi�os por liga��o de porta
VIII. Concorr�ncia
Dimensione por um modelo de processo
IX. Descartabilidade
Maximizar a robustez com inicializa��o e desligamento r�pido
X. Dev/prod semelhantes
Mantenha o desenvolvimento, teste, produ��o o mais semelhante poss�vel
XI. Logs
Trate logs como fluxo de eventos
XII. Processos de Admin
Executar tarefas de administra��o/gerenciamento como processos pontuais

O que irei falar abaixo n�o � regra, mas sim algumas das boas praticas as quais eu entendi como interessante e inerentes � constru��o de um micro servi�o.
�	Os micro servi�os devem ser relativamente pequenos.
�	Isolados e de f�cil inicializa��o e para que possibilite a escalabilidade org�nica apenas do servi�o desejado, n�o precisando replicar a aplica��o inteira.
�	Para que possamos escalar a aplica��o facilmente � interessante que a aplica��o seja stateless, possibilitando uma maior facilita��o para manter  �sincronia� entre os bancos de dados.
�	A utiliza��o de um mecanismo de controle de vers�o e �taggeamento� que auxilie no mecanismo de controle de vers�o e que facilite no desenvolvimento de novos poss�veis m�dulos para serem adicionados ao micro servi�o. Referente a utiliza��o do taggeamento que possibilite a identifica��o de um realese mais est�vel e de auxilio ao administrados do sistema de ter no��o o que contempla cada realese que est� em produ��o, facilitando o �roll-back�.
�	Por serem isolados, facilitam a utiliza��o de seus servi�os(API Rest, ...) sem que sejam necess�rias �intrus�es� ao c�digo.




# 2.3. Choose 3 early adopters case to tell (briefly) the history.

## Amazon (http://www.amazon.com)

�Now, don�t get me wrong. It was architected in multiple tiers, and those tiers had many components in them,� Brigham continued. �But they�re all very tightly coupled together, where they behaved like one big monolith. Now, a lot of startups, and even projects inside of big companies, start out this way. They take a monolith-first approach, because it�s very quick, to get moving quickly. But over time, as that project matures, as you add more developers on it, as it grows and the code base gets larger and the architecture gets more complex, that monolith is going to add overhead into your process, and that software development lifecycle is going to begin to slow down.�
Diante disso, foi tomada a decis�o de partir de uma arquitetura monol�tica e extremamente acoplada, onde os pr�prios programadores odiavam e v�o continuar odiando para o resto de suas vidas se comunicar. A comunica��o por mais que seja necess�ria n�o � para se tornar um empecilho no desenvolvimento de um software.

## UBER (http://www.uber.com)
Com a chegada da uber a novos pa�ses, cidades e continentes, o crescimento do seu time de desenvolvimento. Gerenciar tudo isso estava se tornando ca�tico e uma dor de cabe�a �desnecess�ria� dai veio ent�o a ado��o de uma arquitetura de micro servi�os. Aqui eu achei um breve relato de um engenheiro da uber: 
�That's crazy 10x growth in a crazy short period of time. Who has experienced that? Not many. And as you might expect that sort of unique, compressed, fast paced, high stakes experience has to teach you something new, something deeper than you understood before.�
�Scaling the traffic is not the issue. Scaling the team and the product feature release rate is the primary driver.�

## Netflix (https://www.netflix.com/br/)

�When Netflix morphed from being a snail-mail DVD delivery service to a streaming media powerhouse, the company knew it had to make fundamental changes. For one, it needed to move out of its own data center and into the cloud. It also transitioned from a monolithic, Oracle-based database to a microservices architecture�which involves splitting apps into small modular processes that can be deployed independently. And through this process, Netflix underwent a cultural change, reorganizing its developers into smaller, product-focused teams.�



**_�Half the company thought this was stupid.��Adrian Cockcroft, former Netflix cloud architect_**








Refer�ncias:
https://thenewstack.io/led-amazon-microservices-architecture/
https://12factor.net/pt_br/
http://www.clearlytech.com/2014/01/04/12-factor-apps-plain-english/
http://www.bmc.com/blogs/microservices-vs-soa-whats-difference/
https://thenewstack.io/led-amazon-microservices-architecture/
https://eng.uber.com/schemaless-rewrite/
http://highscalability.com/blog/2016/10/12/lessons-learned-from-scaling-uber-to-2000-engineers-1000-ser.html
https://wemakeappsgo.f5.com/cloud/why-netflix-bet-and-won-on-cloud-based-microservices/



