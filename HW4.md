
# 4.1 Service endpoint design consideration

## What is the main concepts and principles of Consumer Driven Contracts (CDC)?

CDC são utilizados para manter a evolução de serviços, sem atrapalhar/derrubar os clientes que utilizam versões "ultrapassadas" do mesmo, sem atrapalhar a compatibilidade tanto das versões antigas quanto das mais novas. CDC facilitam a aplicação de TDD a nivel arquitetural, possibilitando uma melhor estruturação do resultado dos testes.

##  Princípios dos Contratos dirigidos ao consumidor 

- Disponibilizar uma base para os “consumidores” definirem as expectativas(de resultados esperados entregues pelo serviço) com os “contratos” do consumidor e impulsionarem a API do produtor. 
- Permitir que o ciclo de vida do teste do produtor inclui a validação dos contratos do consumidor. 
-  Fornecer stubs de produção reutilizáveis ​​para os consumidores usarem em seus testes de integração. 
-  Minimizar os testes de integração do E2E(End-to-End test).
- Menos tempo para manutenção.
- Menor robustez de testes ponto a ponto do selenium.
- Validar o que você está construindo.


## What are the main solutions (patterns, architectural styles, tools, etc.) to implement:

### Message-oriented services

- (RabbitMQ, ActiveMQ, Kafka, IBMMQ and TIBCO EMS, Iron.io na escala de internet.)
- protocolos IMS ou AMQP padrão para comunicação com JSON como carga útil.
- Mensagens suportam comunicação baseada em HTTP e REST assíncrono, para serviços de longa duração.


### HTTP and REST endpoints

- Mantl (mant 1 . i0) is open source microservices framework come from Cisco for the microservice development and deployments.
- Fabric8 (fabric8 . i0) is an integrated microservices development platform on top of Kubemetes, backed by Red Hat.
-  Hookio (hook . i0) is another microservices deployment platform.
-  Vamp (vamp . 10) is an open source self-hosted platform to manage microservices
- HATEOAS é um dos designs
- padrões emergentes para projetar renderização progressiva e navegações de autoatendimento.
- RFC 5988 - Web Linking é outro padrão futuro.


### Optimized communication protocols

- Avro, Protocol Buffers ou Thrift para comunicação entre serviços.

### API documentations

Cloud Endpoints , um serviço para criar, implantar e gerenciar APIs no Google Cloud Platform (GCP),  pode-se concentrar na lógica e no design da API e lidar com tudo outro.
Swagger


# 4.2 Use of ESB and iPaaS with microservices


Visualizando serviços como uma interface que seja padronizada e de facil escalabilidade em tempo de execução, que crescam de forma linear. E o ESB como roteamento, coordenação, integração e monitoramento de atividade. Fica "facil" perceber que é possivel desenvolver apps por meio de serviços/micro-serviços.

# 4.3 Microservices challenges - Data islands

Na minha concepção a melhor forma de fazer isso é apartir do armazenamento dos dados gerados pelos micro-serviços em alguma ferramenta que injete esses dados quando a proxima carga de dados for inserida no data lake.
