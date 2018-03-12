# 2.1 What are the relationships with other architecture styles?(Quais são as relações com outros estilos de arquitetura?)
 
![1 imagem](https://user-images.githubusercontent.com/13456954/37304550-a8d067d6-2610-11e8-8e5c-e46cf08f4b4b.jpg)


Business services are coarse-grained services that define core business operations. They are usually represented through XML, Web Services Definition Language (WSDL) or Business Process Execution Language (BPEL).
Enterprise services implement the functionality defined by business services. They rely on application services and infrastructure services to fulfill business requests.
Application services are fine-grained services that are bound to a specific application context. These services can be invoked directly through a dedicated user interface.
Infrastructure services implement non-functional tasks such as authentication, auditing, security, and logging. They can be invoked from either application services or enterprise services.

 
 
![2 imagem](https://user-images.githubusercontent.com/13456954/37304552-a8fd8d88-2610-11e8-8c2e-86ee3163093b.jpg)
 
![3 imagem](https://user-images.githubusercontent.com/13456954/37304554-a92f6970-2610-11e8-911c-896c69d8feb9.png)
![4 imagem](https://user-images.githubusercontent.com/13456954/37304556-a95d15dc-2610-11e8-9003-1d89fb1c972e.png)




# 2.2. What are the relations between microservices and Twelve-Factor apps?(Quais são as relações entre microservices e aplicativos doze fatores?)

Tendo em vista que os Twelve-Factor apps são os seguintes:
I. Base de Código
Uma base de código com rastreamento utilizando controle de revisão, muitos deploys
II. Dependências
Declare e isole as dependências
III. Configurações
Armazene as configurações no ambiente
IV. Serviços de Apoio
Trate os serviços de apoio, como recursos ligados
V. Build, release, run
Separe estritamente os builds e execute em estágios
VI. Processos
Execute a aplicação como um ou mais processos que não armazenam estado
VII. Vínculo de porta
Exporte serviços por ligação de porta
VIII. Concorrência
Dimensione por um modelo de processo
IX. Descartabilidade
Maximizar a robustez com inicialização e desligamento rápido
X. Dev/prod semelhantes
Mantenha o desenvolvimento, teste, produção o mais semelhante possível
XI. Logs
Trate logs como fluxo de eventos
XII. Processos de Admin
Executar tarefas de administração/gerenciamento como processos pontuais

O que irei falar abaixo não é regra, mas sim algumas das boas praticas as quais eu entendi como interessante e inerentes à construção de um micro serviço.
•	Os micro serviços devem ser relativamente pequenos.
•	Isolados e de fácil inicialização e para que possibilite a escalabilidade orgânica apenas do serviço desejado, não precisando replicar a aplicação inteira.
•	Para que possamos escalar a aplicação facilmente é interessante que a aplicação seja stateless, possibilitando uma maior facilitação para manter  “sincronia” entre os bancos de dados.
•	A utilização de um mecanismo de controle de versão e “taggeamento” que auxilie no mecanismo de controle de versão e que facilite no desenvolvimento de novos possíveis módulos para serem adicionados ao micro serviço. Referente a utilização do taggeamento que possibilite a identificação de um realese mais estável e de auxilio ao administrados do sistema de ter noção o que contempla cada realese que está em produção, facilitando o “roll-back”.
•	Por serem isolados, facilitam a utilização de seus serviços(API Rest, ...) sem que sejam necessárias “intrusões” ao código.




# 2.3. Choose 3 early adopters case to tell (briefly) the history.

## Amazon (http://www.amazon.com)

“Now, don’t get me wrong. It was architected in multiple tiers, and those tiers had many components in them,” Brigham continued. “But they’re all very tightly coupled together, where they behaved like one big monolith. Now, a lot of startups, and even projects inside of big companies, start out this way. They take a monolith-first approach, because it’s very quick, to get moving quickly. But over time, as that project matures, as you add more developers on it, as it grows and the code base gets larger and the architecture gets more complex, that monolith is going to add overhead into your process, and that software development lifecycle is going to begin to slow down.”
Diante disso, foi tomada a decisão de partir de uma arquitetura monolítica e extremamente acoplada, onde os próprios programadores odiavam e vão continuar odiando para o resto de suas vidas se comunicar. A comunicação por mais que seja necessária não é para se tornar um empecilho no desenvolvimento de um software.

## UBER (http://www.uber.com)
Com a chegada da uber a novos países, cidades e continentes, o crescimento do seu time de desenvolvimento. Gerenciar tudo isso estava se tornando caótico e uma dor de cabeça “desnecessária” dai veio então a adoção de uma arquitetura de micro serviços. Aqui eu achei um breve relato de um engenheiro da uber: 
“That's crazy 10x growth in a crazy short period of time. Who has experienced that? Not many. And as you might expect that sort of unique, compressed, fast paced, high stakes experience has to teach you something new, something deeper than you understood before.”
“Scaling the traffic is not the issue. Scaling the team and the product feature release rate is the primary driver.”

Migraram também para GO a implementação do escalonamento da CPU, houve um ganho de 85%. Ajudando a reduzir a quantidade de workersnodes necessários. 
![cpu](https://user-images.githubusercontent.com/13456954/37305378-071392bc-2613-11e8-8b52-1149705ba8ae.png)


"Project Frontless showed that it is possible for us to rewrite a critical system in an entirely new language with zero downtime. By re-implementing the service without changing any of Schemaless’ existing clients, we were able to implement, validate, and enable an endpoint within days instead of weeks or months. Specifically, the validation process (in which new endpoints were compared against existing implementations in production) gave us confidence that Frontless and Schemaless workers would surface the same results."



## Netflix (https://www.netflix.com/br/)

"In 2014, Uber Engineering built Schemaless, our fault-tolerant and scalable datastore, to facilitate the rapid growth of our company. For context, we deployed more than 40 Schemaless instances and many thousands of storage nodes in 2016 alone."

“When Netflix morphed from being a snail-mail DVD delivery service to a streaming media powerhouse, the company knew it had to make fundamental changes. For one, it needed to move out of its own data center and into the cloud. It also transitioned from a monolithic, Oracle-based database to a microservices architecture—which involves splitting apps into small modular processes that can be deployed independently. And through this process, Netflix underwent a cultural change, reorganizing its developers into smaller, product-focused teams.”





**_“Half the company thought this was stupid.”—Adrian Cockcroft, former Netflix cloud architect_**








Referências:
https://thenewstack.io/led-amazon-microservices-architecture/<p>
https://12factor.net/pt_br/
http://www.clearlytech.com/2014/01/04/12-factor-apps-plain-english/
http://www.bmc.com/blogs/microservices-vs-soa-whats-difference/
https://thenewstack.io/led-amazon-microservices-architecture/
https://eng.uber.com/schemaless-rewrite/
http://highscalability.com/blog/2016/10/12/lessons-learned-from-scaling-uber-to-2000-engineers-1000-ser.html
https://wemakeappsgo.f5.com/cloud/why-netflix-bet-and-won-on-cloud-based-microservices/



