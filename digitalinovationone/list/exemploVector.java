package digitalinovationone.list;

import java.util.List;
import java.util.Vector;

public class exemploVector {
    public static void main(String[] args) {
        List<String> esportes = new Vector<>();
        // adicionando 4 esportes
        esportes.add("Futebol");
        esportes.add("Basquetebol");
        esportes.add("Ténis de Mesa");
        esportes.add("Handebol");

        System.out.println(esportes);
        //alterando valor da posição 2 do vetor
        esportes.set(2, "Ping Pong");

        //removendo o esporte da posição 2
        esportes.remove(2);

        //removendo esporte handebol do vetor
        esportes.remove("Handebol");

        System.out.println(esportes);
        //retornando primeiro item do vetor
        System.out.println(esportes.get(0));

        //percorrendo esportes
        for (String esporte: esportes) {
            System.out.println(esporte);
        }
        esportes.addAll(esportes); //adicionando uma lista dentro da outra lista

        System.out.println(esportes);
    }
}
