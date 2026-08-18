package Model;
 
import java.util.Random;
 
/**
 * Classe responsável por métodos auxiliares usados
 * para preparar os vetores antes da ordenação.
 */
public class Utilidades {
 
    /**
     * Preenche o vetor com números aleatórios dentro do intervalo informado.
     */
    public static void popularVetor(int[] vetor, int quantidade, int valorMinimo, int valorMaximo) {
        Random sorteio = new Random();
        for (int i = 0; i < quantidade; i++) {
            vetor[i] = valorMinimo + sorteio.nextInt(valorMaximo - valorMinimo);
        }
    }
 
    /**
     * Retorna uma cópia independente do vetor original, para que cada
     * algoritmo possa ordenar o mesmo conjunto de dados sem interferir
     * na execução dos demais.
     */
    public static int[] copiarVetor(int[] origem) {
        int[] copia = new int[origem.length];
        System.arraycopy(origem, 0, copia, 0, origem.length);
        return copia;
    }
}
