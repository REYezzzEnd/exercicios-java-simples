package exer10;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exer10 {
    public static void main(String[] args){

        try(Scanner scan = new Scanner(System.in)){

            List<Integer> numeros = new ArrayList<>();
            
            System.out.println("Digite numeros logo abaixo(digite ''0'' para parar): ");

            while (true) { 
                System.out.println("Digite o " + (numeros.size() + 1) + "º: ");
                int numero = scan.nextInt();

                if(numero == 0) break;

                numeros.add(numero);
            }

            numeros.sort(Integer::compareTo);
            System.out.println("Ordem crescente: " + numeros);

            numeros.sort((a,b) -> b.compareTo(a));
            System.out.println("Ordem Decrescente: " + numeros);
        }
    }
}
