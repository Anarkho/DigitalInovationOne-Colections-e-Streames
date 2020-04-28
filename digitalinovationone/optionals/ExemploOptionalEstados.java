package digitalinovationone.optionals;

import java.util.Optional;



public class ExemploOptionalEstados {
    public static void main(String[] args) {
        Optional<String> optionalString = Optional.of("Valor Presente"); // set temos certeza que existe um valor usamos of
        System.out.println("Valor opcional que está presente");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("não está presente"));

        Optional<String> optionalNull = Optional.ofNullable(null); // se a variavel pode ser nula usamos nullable

        System.out.println("Valor opcional que não está presente");
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null = não está presente"));

        Optional<String> emptyOptional = Optional.empty(); // querendo construir do zero sem nem um valor usamos empty

        System.out.println("Valor opcional que não está presente");
        emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("empty = não está presente"));

        Optional<String> optionalNullerro = Optional.of(null);

        System.out.println("Valor opcional que lança erro NullPointerException");
        optionalNullerro.ifPresentOrElse(System.out::println, () -> System.out.println("erro = não está presente"));

    }
}
