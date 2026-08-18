import Controller.OrdenadorController;
 
/**
 * Classe principal da aplicação.
 * Responsável apenas por iniciar o programa criando uma instância do Controller.
 */
public class Main {
    public static void main(String[] args) {
        OrdenadorController controller = new OrdenadorController();
        controller.executar();
    }
}
