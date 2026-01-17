import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exer7 {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {

            List<String> nomes = new ArrayList<>();
            int contadorNomes = 0;

            while (true) {
                System.out.println("Digite os nomes: ");
                String nome = scan.nextLine();

                if(nome.equalsIgnoreCase("fim")) break;

                contadorNomes++;
                nomes.add(nome);
            }

            nomes.sort(String::compareToIgnoreCase);

            System.out.printf("\n\nNomes digitados: ");

            for(int i = 0; i < nomes.size(); i++){
                if(i != nomes.size() - 1){
                    System.out.printf("%s, ", nomes.get(i));

                }else{
                    System.out.printf("%s", nomes.get(i));
                }
            }

            System.out.println("\nQuantidade de nomes digitados: " + contadorNomes);
        }
    }
}
