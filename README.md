# java-tipos-br
Tipos comuns do Brasil

O Objetivo desse projeto é diminuir a Obsessão com Tipos primitivos
criando um repositório com os tipos e enumeradores mais comuns do contexto brasileiro.

### Diretrizes para PR
* Toda classe deve ser **final**
* Todo tipo deve ser **imutável**
* Toda classe deve ter **construtores públicos** e **static factories**
* Toda classe deve sobrescrever o **equals** e o **hashcode**
* O nome da classe e a assinatura dos métodos público devem ser em **português**
* Deve haver **comentário** no cabeçalho da classe explicando o tipo que a classe representa
* Todo método público deve ter **comentários** e explicitar as **exceções** que podem ser lançada
* Dentro do possível toda validação de estado deve ser feita pela própria classe que representa o tipo
* Deve haver *testes unitários* 
* As Classes de Testes devem ter o Sufixo **Test**, por exemplo: **CPFTest**
* Todo tipo deve ser criado visando ser utilizado de maneiras simples por conversores de JSON (Jackson, GSON e etc) em aplicações que utiliza REST (ex: Spring Boot)
