# ERP de Gestão para Loja de Calçados

## Sobre o Projeto
Este projeto consiste no desenvolvimento de um ERP (Enterprise Resource Planning) ou aplicativo de gestão para uma loja que comercializa calçados. O software permitirá o cadastro de produtos, contemplando variações de cores, tamanhos, marcas e modelos.

## Funcionalidades
- **Produtos**: Cadastrar, atualizar, excluir e pesquisar.
- **Clientes**: CRUD completo.
- **Vendas**: Gerenciamento completo das operações de venda.
- **Contas a Pagar/Receber**: Controle financeiro integrado.
- **Usuários**: Cadastro e gerenciamento de usuários para acesso ao sistema.
- **Integração com Mercado Livre**: Sincronização do estoque e emissão automática de notas fiscais para a loja online.
- **Loja Física e Online**: Possibilidade de definir preços distintos para os mesmos produtos, dependendo da modalidade.

## Tecnologias Utilizadas
- **Back-end**: 
  - Spring Boot
  - Maven
  - Lombok
  - JPA (Hibernate)
  - JDK 17
- **Banco de Dados**: 
  - H2 em memória (para testes iniciais; nome do banco: `erp.calcados`)
- **Front-end**: 
  - A definir (interface intuitiva, amigável e de fácil manuseio, compatível com Windows, Android, Mac e iOS)

## Configuração do Banco de Dados (H2)
Para os testes iniciais, o sistema utilizará o banco de dados H2 em memória. As configurações necessárias no arquivo `application.properties` são as seguintes:

```properties
# Configuração do Banco H2
spring.datasource.url=jdbc:h2:mem:erp_calcados
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.datasource.platform=h2

# Configuração do JPA
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=update

# Habilitar Console H2 para consultas
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console


Essa configuração garante que as informações persistam enquanto a aplicação estiver em execução e que as entidades sejam criadas automaticamente ao subir a aplicação localmente.

## Observações do Cliente
- **Facilidade de Uso:** O sistema deve ser fácil de usar, considerando que usuários sem experiência com tecnologia utilizarão a aplicação.
- **Interface Prática e Intuitiva:** A interface deve permitir um bom gerenciamento do estoque, bem como a emissão de relatórios detalhados, incluindo a posição do estoque e das vendas.
- **Relatórios Fotográficos:** Deve ser possível gerar relatórios fotográficos conforme solicitação.
- **Integração com Mercado Livre:** O sistema deve alimentar automaticamente o estoque e gerar nota fiscal automaticamente para as operações online. Para a loja física, a emissão de nota fiscal pode ser opcional.

---

**Status do Projeto:** Em desenvolvimento
