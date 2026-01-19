import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exer12 {
    public static void main(String[] args) {
        
        try(Scanner scan = new Scanner(System.in)){

            List<Integer> numeros = new ArrayList<>();

            System.out.println("Digite os numero abaixo(digite -1 para parar): ");

            int i = 1;

            while(true){
                System.out.println("Digite o numero na posicao " + i + ":");
                int numero = scan.nextInt();
                
                if(numero == -1) break;

                numeros.add(numero);
                i++;
            }

            if(numeros.isEmpty()){
                System.out.println("A lista esta vazia.");

            }else{
                int maiorNumero = acharMaiorNumero(numeros);
                System.out.println("O maior numero da lista é o " + maiorNumero);
            }
        }
    }

    public static int acharMaiorNumero(List<Integer> numeros){
        return Collections.max(numeros);
    }
}
