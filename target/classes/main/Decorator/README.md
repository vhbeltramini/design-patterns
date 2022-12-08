# Passo-a-passo para aplicar Decorator

1. Identifique/implemente a classe que se deseja decorar (Componente Concreto);

2. Criar uma classe abstrata ou interface (Componente) com base na classe a ser decorada;

3. Aplique a relação de herança entre os elementos dos itens 1 e 2;

4. Criar um Decorador como classe abstrata que estende/realiza o Componente;

5. Na classe do item 4 fazer um atributo do tipo Componente. Esse atributo é inicializado no construtor;

6. Redirecione os métodos do decorador para a implementação da classe decorada;

7. Nas classes decoradoras concretas sobrescreva os métodos que se deseja alterar o seu comportamento, não esquecendo de invocar do ancestral .

