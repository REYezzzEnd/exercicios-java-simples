package exer8;
import java.util.Scanner;

public class Exer8 {
    public static void main(String[] args) {
        
        try(Scanner scan = new Scanner(System.in)){
            
            int[] numeros = new int[10];

            System.out.println("Digite 10 numeros abaixo: ");

            for(int i = 0; i < numeros.length; i++){
                System.out.println("Digite o numero na posição " + (i + 1) + ": ");
                numeros[i] = scan.nextInt();
            }

            System.out.println("numeros Pares:");
            for(int num : numeros){
                if(num % 2 == 0){
                    System.out.printf(" %d ", num);
                }
            }

            System.out.println("\nnumeros Impares:");
            for(int num : numeros){
                if(num % 2 != 0){
                    System.out.printf(" %d ", num);
                }
            }
        }
    }
}
