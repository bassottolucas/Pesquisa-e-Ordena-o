package View;
 
/**
 * Classe responsável pela apresentação dos dados ao usuário.
 * Não realiza nenhum cálculo, apenas exibe informações já prontas.
 */
public class OrdenacaoView {
 
    /**
     * Exibe o tempo gasto na execução de uma rotina, em milissegundos.
     */
    public void exibirTempo(String algoritmo, long tempoMs) {
        System.out.println("Tempo (" + algoritmo + "): " + tempoMs + " ms");
    }
 
    /**
     * Exibe uma amostra do vetor (até 20 elementos, para não poluir o console).
     */
    public void exibirVetor(String titulo, int[] vetor) {
        System.out.print(titulo + ": ");
        int limite = Math.min(vetor.length, 20);
        for (int i = 0; i < limite; i++) {
            System.out.print(vetor[i] + " ");
        }
        if (vetor.length > limite) {
            System.out.print("...");
        }
        System.out.println();
    }
 
    /**
     * Exibe uma mensagem simples (usada para separar as seções no console).
     */
    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
