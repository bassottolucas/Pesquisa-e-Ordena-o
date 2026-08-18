package Model;
 
/**
 * Classe responsável pelos algoritmos de ordenação.
 * Todos os métodos são estáticos e contabilizam o número de
 * comparações e trocas realizadas durante a execução.
 */
public class Ordenacao {
 
    public static void bolha(int[] vetor, long n) {
        boolean trocou;
        int aux;
        long comparacoes = 0, trocas = 0;
 
        do {
            trocou = false;
            for (long i = 0; i < n - 1; i++) {
                comparacoes++;
                if (vetor[(int) i] > vetor[(int) (i + 1)]) {
                    aux = vetor[(int) i];
                    vetor[(int) i] = vetor[(int) (i + 1)];
                    vetor[(int) (i + 1)] = aux;
                    trocas++;
                    trocou = true;
                }
            }
        } while (trocou);
 
        System.out.println("Comparações: " + comparacoes);
        System.out.println("Trocas: " + trocas + "\n");
    }
 
    public static void selecao(int[] vetor, long n) {
        long comparacoes = 0, trocas = 0;
        int aux;
 
        for (long i = 0; i < n - 1; i++) {
            long menor = i;
            for (long j = i + 1; j < n; j++) {
                comparacoes++;
                if (vetor[(int) j] < vetor[(int) menor]) {
                    menor = j;
                }
            }
            if (menor != i) {
                aux = vetor[(int) i];
                vetor[(int) i] = vetor[(int) menor];
                vetor[(int) menor] = aux;
                trocas++;
            }
        }
 
        System.out.println("Comparações: " + comparacoes);
        System.out.println("Trocas: " + trocas + "\n");
    }
 
    public static void insercao(int[] vetor, long n) {
        long comparacoes = 0, trocas = 0;
 
        for (long i = 1; i < n; i++) {
            int chave = vetor[(int) i];
            long j = i - 1;
 
            while (j >= 0) {
                comparacoes++;
                if (vetor[(int) j] > chave) {
                    vetor[(int) (j + 1)] = vetor[(int) j];
                    trocas++;
                    j--;
                } else {
                    break;
                }
            }
            vetor[(int) (j + 1)] = chave;
        }
 
        System.out.println("Comparações: " + comparacoes);
        System.out.println("Trocas: " + trocas + "\n");
    }
 
    public static void agitacao(int[] vetor, long n) {
        long comparacoes = 0, trocas = 0;
        long inicio = 0, fim = n - 1;
        boolean trocou = true;
        int aux;
 
        while (trocou) {
            trocou = false;
 
            // passagem da esquerda para a direita
            for (long i = inicio; i < fim; i++) {
                comparacoes++;
                if (vetor[(int) i] > vetor[(int) (i + 1)]) {
                    aux = vetor[(int) i];
                    vetor[(int) i] = vetor[(int) (i + 1)];
                    vetor[(int) (i + 1)] = aux;
                    trocas++;
                    trocou = true;
                }
            }
            fim--;
 
            if (!trocou) {
                break;
            }
 
            trocou = false;
 
            // passagem da direita para a esquerda
            for (long i = fim; i > inicio; i--) {
                comparacoes++;
                if (vetor[(int) i] < vetor[(int) (i - 1)]) {
                    aux = vetor[(int) i];
                    vetor[(int) i] = vetor[(int) (i - 1)];
                    vetor[(int) (i - 1)] = aux;
                    trocas++;
                    trocou = true;
                }
            }
            inicio++;
        }
 
        System.out.println("Comparações: " + comparacoes);
        System.out.println("Trocas: " + trocas + "\n");
    }
}
