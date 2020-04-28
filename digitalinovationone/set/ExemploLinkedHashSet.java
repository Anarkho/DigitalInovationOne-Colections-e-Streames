package digitalinovationone.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        // Adiciona os numeros ao set
        sequenciaNumerica.add(1);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(16);

        System.out.println(sequenciaNumerica); //respeita ordem de inserção diferente de hashset
        ////////////////////////////////////////
        // Remove o numero do set
        sequenciaNumerica.remove(4);

        System.out.println(sequenciaNumerica);
        ////////////////////////////////////////
        // Retorna a quantidade de itens no set
        System.out.println(sequenciaNumerica.size());
        ////////////////////////////////////////
        // Navega em todos os itens do iterator
        Iterator<Integer> iterator = sequenciaNumerica.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for (Integer numero: sequenciaNumerica) {
            System.out.println("=="+numero);
        }
        ////////////////////////////////////////
        sequenciaNumerica.clear();
        // Retorna se o set estiver vazio ou não
        System.out.println(sequenciaNumerica.isEmpty());

    }
}
