import java.util.*;

public class Exer18 {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {

            int contadorLetras = 0;
            int contadorSpace = 0;
            int contadorVogais = 0;

            System.out.print("Digite uma frase: ");
            String frase = scan.nextLine();

            for (int i = 0; i < frase.length(); i++) {
                char letraAtual = Character.toLowerCase(frase.charAt(i));

                if (letraAtual == 32)
                    contadorSpace++;

                if (Character.isAlphabetic(letraAtual)) {
                    contadorLetras++;

                    if (letraAtual == 'a' || letraAtual == 'e' || letraAtual == 'i' || letraAtual == 'o'
                            || letraAtual == 'u') {
                        contadorVogais++;
                    }
                }
            }

            System.out.println("\nSua frase: " + frase);
            System.out.println("Total de letras nesta frase: " + contadorLetras);
            System.out.println("Total de vogais nesta frase: " + contadorVogais);
            System.out.println("Total de espaços nesta frase: " + contadorSpace);
        }
    }
}
