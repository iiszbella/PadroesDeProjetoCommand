Atividade da disciplina de Padrões de Projeto – Command  

O projeto desenvolvido aplica o padrão Command em um cenário de controle de estoque, simulando operações de entrada e saída de produtos com possibilidade de desfazer ações. 
A ideia central é demonstrar como o Command permite encapsular cada operação em um objeto independente, tornando possível executar, cancelar ou armazenar comandos sem que o cliente precise conhecer os detalhes de implementação.

No modelo proposto, a interface Comando define os métodos executar() e cancelar(), que representam o contrato comum para todas as ações. 
As classes EntradaProdutoComando e SaidaProdutoComando funcionam como comandos concretos, responsáveis por realizar e desfazer operações de movimentação de estoque. 
A classe Produto atua como o receptor, contendo os métodos que realmente alteram a quantidade de itens disponíveis.
Já a classe Estoque representa o invocador, responsável por executar os comandos e manter um histórico das operações realizadas, permitindo desfazer a última ação.
Por fim, a classe Cliente simula o uso do sistema, criando comandos e solicitando sua execução.

Escolhi o cenário de controle de estoque porque ele reflete bem a lógica do Command: cada ação do sistema é tratada como um objeto autônomo, o que facilita o gerenciamento de histórico e a reversão de operações. 
O uso do Command torna o código mais flexível, organizado e extensível, permitindo adicionar novas ações sem modificar a estrutura existente e garantindo maior controle sobre o fluxo de execução.

Diagrama UML - https://drive.google.com/file/d/1b6xyfA_byWLVCgqiulpUBe_Jz7Ky-Blq/view?usp=sharing
