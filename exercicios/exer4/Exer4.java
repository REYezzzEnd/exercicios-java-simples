import java.util.Scanner;

public class Exer4 {
    public static void main(String[] args){

        try(Scanner scan = new Scanner(System.in)){

            System.out.println("Digite sua idade: ");
            int idade = scan.nextInt();

            if(idade < 18){
                System.out.println("Voce é menor de idade");

            }else if(idade >= 18 && idade < 60){
                System.out.println("voce é um adulto.");

            }else{
                System.out.println("voce é um idoso");
            }
        }
    }    
}
