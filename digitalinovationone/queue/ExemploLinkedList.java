package digitalinovationone.queue;



import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Patricia");
        filaBanco.add("Roberto");
        filaBanco.add("Flavio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);
/////////////////////////////////////////////////////////////////
        String clienteASerAtendido = filaBanco.poll(); // retorna primeiro da lista e o remove da fila/ vazio retorna null

        System.out.println("\nCliente atendido: "+clienteASerAtendido); // mostra cliente atendido

        System.out.println("Restam na fila: "+filaBanco); // novo estado da fila
/////////////////////////////////////////////////////////////////
        String primeiroCliente = filaBanco.peek(); // retorna 1º da fila sem remover se a fila estiver vazia retorna null

        System.out.println("1º na fila: "+primeiroCliente);

        System.out.println(filaBanco);
////////////////////////////////////////////////////////////////
        //filaBanco.clear();  // limpa fila

        String primeiroClienteOuErro = filaBanco.element(); // retorna 1º da fila sem remover se a fila estiver vazia retorna Exception

        System.out.println("1º cliente ou erro: "+primeiroClienteOuErro);
////////////////////////////////////////////////////////////////
        System.out.println("REPETIÇÃO COMUM");
        for (String cliente: filaBanco) {
            System.out.println("--"+cliente);
        }
///////////////////////////////////////////////////////////////
        System.out.println("REPETIÇÃO INTERATOR");
        Iterator<String> InteratorfilaBanco = filaBanco.iterator();

        while (InteratorfilaBanco.hasNext()) {
            System.out.println("== "+ InteratorfilaBanco.next());
        }
/////////////////////////////////////////////////////////////////
        System.out.println("Tem "+filaBanco.size()+" pessoas na fila");
/////////////////////////////////////////////////////////////////
        System.out.println("A fila esta vazia? "+ filaBanco.isEmpty());
/////////////////////////////////////////////////////////////////
        Boolean contido = filaBanco.contains("Pamela");

        System.out.println("A Pamela esta na fila? " + contido);

    }
}
