package exer2;

import java.util.Scanner;

public class Acharmaior {
    
    public static void main(String[] args){

        try(Scanner scan = new Scanner(System.in)){

        int[] numeros = new int[5];

            for(int i = 0; i < numeros.length; i++){
                System.out.printf("Digite o numero na posicao(%d): ", (i + 1));
                numeros[i] = scan.nextInt();
            }

            int maiorNumero = numeros[0];
            int menorNumero = numeros[0];

            for(int i = 0; i < numeros.length; i++){
                
                if(maiorNumero < numeros[i]){
                    maiorNumero = numeros[i];
                }

                if(menorNumero > numeros[i]){
                    menorNumero = numeros[i];
                }
            }

            System.out.println("Esse é o maior numero: " + maiorNumero);
            System.out.println("Esse é o menor numero: " + menorNumero);

            scan.close();
        }
    }
}