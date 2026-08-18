package Controller;

import model.Ordenacao;
import model.Utilidades;
import view.OrdenacaoView;

/**
 * Classe responsável pelo controle da aplicação: prepara os dados,
 * aciona os algoritmos de ordenação e mede o tempo de execução de
 * cada um, repassando os resultados para a View exibir.
 */
public class OrdenadorController {

    private final OrdenacaoView view = new OrdenacaoView();

    public void executar() {
        int tamanho = 100000;
        int[] vetorBase = new int[tamanho];

        long inicio = System.nanoTime();
        Utilidades.popularVetor(vetorBase, tamanho, 0, 100000);
        long fim = System.nanoTime();
        view.exibirTempo("Popular vetor", (fim - inicio) / 1_000_000);

        // Cada algoritmo recebe sua própria cópia do vetor original,
        // garantindo que todos ordenem exatamente o mesmo conjunto de dados
        int[] vetorBolha = Utilidades.copiarVetor(vetorBase);
        int[] vetorSelecao = Utilidades.copiarVetor(vetorBase);
        int[] vetorInsercao = Utilidades.copiarVetor(vetorBase);
        int[] vetorAgitacao = Utilidades.copiarVetor(vetorBase);

        view.exibirMensagem("--- Bolha ---");
        inicio = System.nanoTime();
        Ordenacao.bolha(vetorBolha, vetorBolha.length);
        fim = System.nanoTime();
        view.exibirTempo("Bolha", (fim - inicio) / 1_000_000);

        view.exibirMensagem("--- Seleção ---");
        inicio = System.nanoTime();
        Ordenacao.selecao(vetorSelecao, vetorSelecao.length);
        fim = System.nanoTime();
        view.exibirTempo("Seleção", (fim - inicio) / 1_000_000);

        view.exibirMensagem("--- Inserção ---");
        inicio = System.nanoTime();
        Ordenacao.insercao(vetorInsercao, vetorInsercao.length);
        fim = System.nanoTime();
        view.exibirTempo("Inserção", (fim - inicio) / 1_000_000);

        view.exibirMensagem("--- Agitação ---");
        inicio = System.nanoTime();
        Ordenacao.agitacao(vetorAgitacao, vetorAgitacao.length);
        fim = System.nanoTime();
        view.exibirTempo("Agitação", (fim - inicio) / 1_000_000);
    }
}
