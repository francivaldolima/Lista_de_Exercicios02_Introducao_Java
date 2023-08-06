package lista_de_exercícios;

import java.util.Scanner;

public class Excercicio11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a primeira palavra: ");
        String palavra1 = scan.nextLine();

        System.out.print("Digite a segunda palavra: ");
        String palavra2 = scan.nextLine();
        
        int novaPalavra = palavra1.compareTo(palavra2);
        
        if (novaPalavra < 0) {
            System.out.println("Palavras em ordem alfabética: " + palavra1 + ", " + palavra2);
        } else if (novaPalavra > 0) {
            System.out.println("Palavras em ordem alfabética: " + palavra2 + ", " + palavra1);
        } else {
            System.out.println("As palavras são iguais.");
        }
        
        if (palavra1.length() > palavra2.length()) {
             System.out.println( "Palavra com maior número de caracteres: " + palavra1); 
        }else{
           System.out.println( "Palavra com maior número de caracteres: " + palavra2); 
        }
        
    }
}
