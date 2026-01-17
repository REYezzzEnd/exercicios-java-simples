import java.util.Scanner;

public class Aquecimento {
    public static void main(String[] args){

        try(Scanner scan = new Scanner(System.in)){

            System.out.println("Digite um numero: ");
            int numero = scan.nextInt();

            if(numero == 0){
                System.out.println("Seu numero é 0");

            }else if(numero > 0){
                System.out.println("Seu numero é positivo");

            }else{
                System.out.println("Seu numero é negativo.");
            }

            scan.close();
        }
    }
}