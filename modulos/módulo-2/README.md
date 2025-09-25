# Módulo 2 - Manipulando data, hora, texto, valores numéricos e boobleanos

## Tipos Primitivos - o café puro na xícara ( o mundo real )

Imagine que você está na cafeteria.
- Uma **xícara com 120ml de café** é um **primitivo**.
- É direto, simples, sem frescura. O número está ali, "`120`", guardado na xícara.

Na linguagem Java:
- `int` &rarr; representa a **quantidade inteira de xícaras servidas.**
  Ex.: 5 xícaras.

- `double` &rarr; representa a **quantidade exata de café em ml, incluindo casas decimais.**
  Ex.: 120,5 ml.

- `boolean` &rarr; representa se o cliente **quer açúcar ou não.**
  Ex.: true (sim) / false (não)

👉 Os primitivos são **rápidos, leves e guardam apenas o valor puro,** como beber o café direto da xícara sem nada a mais.
---


## Wrappers - café na caixa de entrega (a Matrix e o mundo da abstração)

Quando o café precisa sair do mundo real e entrar no **sistema digital da cafeteria** - o mundo que não vemos, a Matrix - ele não pode existir sozinho. Precisa de um **caixa que represente o café e permita manipulá-lo dentro da abstração**. Essa caixa é o **wrapper**.

Aqui começa a abstração:

Na Matrix, você lembra que as pessoas vivem um realidade simulada, mas na essência são códigos rodando?

- `Integer` &rarr; no mundo real, ainda é a **quantidad de xícaras**. Ex.: 5 xícaras.
    - Na abstração da Matrix, essa quantidade inteira é **colocada em uma caixa digital** que permite armazenar, validar e manipular o valor no sistema. Ex.: caixa digital com 5 xícaras rgistrada no sistema.
 
- `Double` &rarr; no mundo real, é o **café em ml da xícara**. Ex.: 120,5 ml.
    - Na abstração da Matrix, o café é colocado **dentro d uma caixa digital**, que além de guardar o valor, oferece métodos para converter, comparar ou validar. Ex.: caixa digital com 120,5 ml pronta para envio e manipulação.

- `Boolean` &rarr; no mundo real, é a **escolha do cliente:** açúcar ou não. Ex.: true/false.
    - Na abstração da Matrix, essa escolha é **representada dentro de uma caixa,** permitindo que o sistema verifique e utilize essa informação de forma segura. Ex.: caixa indicando true (client quer açúcar) ou false (não quer).


👉 **Resumo da analogia:**

- Mundo real &rarr; café puro na xícara, simples e direto.
- Mundo da Matrix &rarr; café dentro da caixa, com métodos extras e seguro para manipulação digital.
---


## Autoboxing e Unboxing - entrar e sair da Matrix

- **Autoboxing:** o barista anota "120,5 ml" no papel (primitivo) e, ao enviar para o sistema digital, Java coloca automaticamente o café **dentro da caixa (`Double`)**. Ex.: 120,5 ml da xícara &rarr; 120,5 ml ma caixa digital.

- **Unboxing:** a máquina de café precisa apenas do café puro, então o Java tira o valor da caixa e devolve como número puro (`double`). Ex.: 120,5 ml da caixa &rarr; 120,5 ml na xícara.

👉 Permite transitar **sem esforço** entre o mundo real e o mundo da abstração, com era o Neo entrando e saindo da Matrix.
---


## Lista Dinâmica - estante infinita da cafeteria

- Um **array fixo** seria como uma prateleira limitada: só cabem 10 xícaras.
- Uma **lista dinâmica** (_ArrayList_) é uma estante que **cresce automaticamente** conforme chegam novos pedidos.

👉 Por que a lista dinâmica só aceita wrappers:

 - Ela **só aceita objetos**, ou seja, **só pode guardar cafés dentro das caixas** (_Integer, Double, Boolean_).
 - O café puro (_int, double, boolean_) não é objeto e não possui métodos extras e não pode ser manipulado pelo sistema digital.

 Ex.: a lista dinâmica pode ter caixas contendo 5 xícaras, 120,5ml ou true(açúcar), e cresce automaticamentee quando chegam novos pedidos.
---


## Agora vamos para um resumo

  - **Primitivo** &rarr; café puro na xícara (mundo real). Ex: 120,5ml
  - **Wrapper** &rarr; café dentro da caixa de entrega (Matrix). Ex: caixa com 120,5ml pronta para manipulação digital.
  - **Autoboxing** &rarr; Java coloca automaticament o café da xícara na caixa. Ex: 120,5ml da xícara &rarr; 120,5ml na caixa.
  - **Unboxing** &rarr; Java tira o café da caixa para beber na xícara. Ex: 120,5ml da caixa &rarr; 120,5ml na xícara.
  - **Lista Dinâmica** &rarr; estante infinita que só aceita caixas, crecendo conforme novos pedidos. Ex: lista com caixas de 5 xícaras, 120,5ml ou true (açúcar).


[CodeMatrix 01](src/exercicio01.java)