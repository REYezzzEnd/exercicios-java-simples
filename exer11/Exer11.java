import java.util.Scanner;

public class Exer11 {
    public static void main(String[] args){

        try(Scanner scan = new Scanner(System.in)){
            
            System.out.println("Digite um numero para saber se ele é Par: ");
            int numero = scan.nextInt();

            String resultado = verificarPar(numero);

            System.out.println(resultado);
        }
    }    

    public static String verificarPar(int numero){
        
        return numero % 2 == 0 ? "O numero " + numero + " é par" : "O numero " + numero + " é impar";
    }
}