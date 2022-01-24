# Informações

PDF: https://drive.google.com/file/d/1-Xe4qXhyHY4sSge03SvW-mKjE13A0aXv/view?usp=sharing

*Aviso: 
    -A partir do Java 8, interfaces podem ter "defalt methods" ou "defender methods"
    - Isso possui implicações conceituais e práticas, que serão discutidas mais à frente neste capítulo
    -Primeiro vamos trabalhar com a definação "clássica" de interfaces. Depois vamos acrescentar o conceito de defalt methods
 
 ### Definição clássica

Interface é um tipo que define um conjunto de operações que uma classe deve implementar.

A interface estabelece um *contrato* que a classe deve cumprir.

Pra quê interfaces? Para criar sistemas com *baixo acoplamento* e *flexíveis*.

no caso se eu criar uma interface chamada 'Figura' com 2 variaveis 'area' e 'perimetro' caso eu for criar um circulo que é uma figura ela terá que ter uma 'area' e 'perimetro'.

composição: Serviço

com a interface a gente não instancia o contrutor na class generica fazendo com que a class generica seja reutilizada. o Promrama que será responsavel em chamar o construtor.