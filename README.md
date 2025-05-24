#### Questão 1
##### a) Verdadeira
##### b) Falsa: O relacionamento "tem um" (ou "has-a") é implementado via composição (ou agregação), não herança.
##### c) Falsa: Quando uma subclasse redefine um método da superclasse com a mesma assinatura, isso se chama sobrescrita (override), não sobrecarga.

#### Questão 2
##### O uso de private em superclasses garante um encapsulamento mais forte, tornando o código mais seguro e fácil de manter, pois isola a implementação interna. Já o protected permite que subclasses acessem diretamente membros da superclasse, o que facilita a reutilização e extensão, mas pode comprometer o encapsulamento e tornar o código mais frágil e acoplado. Por isso, é recomendado usar private por padrão e recorrer ao protected apenas quando for realmente necessário oferecer pontos de extensão controlados.

#### Questão 3
##### A chamada ao construtor da superclasse explícita ou implícita é obrigatória para garantir que toda a hierarquia de objetos seja corretamente construída, respeitando o encapsulamento, a herança e a integridade do objeto.



