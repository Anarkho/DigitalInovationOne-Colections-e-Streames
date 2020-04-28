package digitalinovationone.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(); // Criando arraylits

        nomes.add("Alex"); // Adicionando elemento ao arraylist
        nomes.add("João");
        nomes.add("Bruna");
        nomes.add("Heitor");
        nomes.add("Gabriel");

        System.out.println("mostrando: " + nomes); // Mostrando arraylist no console
/////////////////////////////////////////////////////////////////////////
        nomes.set(1, "Douglas"); // Alterando nome na posição 1

        System.out.println("\nnome alterado: " + nomes);
/////////////////////////////////////////////////////////////////////////
        Collections.sort(nomes); // Ordenando arraylist em ordem crescente

        System.out.println("\nNomes Ordenados: "+ nomes);
/////////////////////////////////////////////////////////////////////////
        nomes.set(1, "Leticia"); // Atualizando depois da ordenação

        System.out.println("\nNovo nome alterando depois da ordenação"+ nomes);
/////////////////////////////////////////////////////////////////////////
        nomes.remove(4); // Removendo item pela posição

        System.out.println("\nNome removido por indice: "+ nomes);
/////////////////////////////////////////////////////////////////////////
        nomes.remove("Douglas");

        System.out.println("\nNome removido por objeto: "+ nomes);
/////////////////////////////////////////////////////////////////////////
        String nome = nomes.get(0); // Captura nome na posição indicada desde que exista

        System.out.println("\nEu sou "+ nome);
/////////////////////////////////////////////////////////////////////////
        int posicao = nomes.indexOf("Gabriel"); // verifica em que posição esta o objeto

        System.out.println("\nNome esta na posição: "+ posicao); // se objeto n existe na lista retorna -1
/////////////////////////////////////////////////////////////////////////
        int tamanho = nomes.size(); // Retorna o tamanho da lista

        System.out.println("\nEstá lista tem "+tamanho + " elementos");
/////////////////////////////////////////////////////////////////////////
        boolean temnome = nomes.contains("Leticia#"); // Verifica se nome existe no arraylist e retorna true ou false

        System.out.println("\nTem este nome: "+temnome);
/////////////////////////////////////////////////////////////////////////
        for (String nomeDoitem: nomes) {

            System.out.println("-->"+ nomeDoitem);

        } // foreach percorre o arraylist forma comum
////////////////////////////////////////////////////////////////////////
        Iterator <String> iterator = nomes.iterator();
        while (iterator.hasNext() ) { //hasnext enquanto houver um proximo elemento boolean

            System.out.println("|"+iterator.next()+"|"); //next retorna proximo elemento

        }
////////////////////////////////////////////////////////////////////////
        nomes.clear(); // Limpa o arraylist deixando vazio

        boolean ListaEstaVazia = nomes.isEmpty(); // Verifica se arraylist esta vazia

        System.out.println("lista esta vazia: "+ ListaEstaVazia);






    }
}
