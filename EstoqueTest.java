public class EstoqueTest {
    public static void main(String[] args) {
        Produto arroz = new Produto("Arroz", 100);
        Estoque estoque = new Estoque();

        // 1. Teste de entrada de produto
        Comando entrada = new EntradaProdutoComando(arroz, 20);
        estoque.executarComando(entrada);
        System.out.println("Após entrada: " + arroz.getQuantidade()); // esperado: 120

        // 2. Teste de saída de produto
        Comando saida = new SaidaProdutoComando(arroz, 15);
        estoque.executarComando(saida);
        System.out.println("Após saída: " + arroz.getQuantidade()); // esperado: 105

        // 3. Teste de desfazer última saída
        estoque.desfazerUltimoComando();
        System.out.println("Após desfazer saída: " + arroz.getQuantidade()); // esperado: 120

        // 4. Teste de desfazer última entrada
        estoque.desfazerUltimoComando();
        System.out.println("Após desfazer entrada: " + arroz.getQuantidade()); // esperado: 100

        // 5. Teste de múltiplas operações seguidas
        estoque.executarComando(new EntradaProdutoComando(arroz, 50)); // 150
        estoque.executarComando(new SaidaProdutoComando(arroz, 30));   // 120
        System.out.println("Após múltiplas operações: " + arroz.getQuantidade()); // esperado: 120

        // 6. Teste de desfazer múltiplas operações
        estoque.desfazerUltimoComando(); // desfaz saída de 30 → volta para 150
        estoque.desfazerUltimoComando(); // desfaz entrada de 50 → volta para 100
        System.out.println("Após desfazer múltiplas operações: " + arroz.getQuantidade()); // esperado: 100
    }
}

