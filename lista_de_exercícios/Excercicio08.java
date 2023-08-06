
package lista_de_exercícios;

import java.util.Scanner;

public class Excercicio08 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite uma palavra: ");
        String palavra = scan.nextLine();
        
        StringBuilder str = new StringBuilder(palavra);
        
        if (palavra.equalsIgnoreCase(str.reverse().toString())) {
            System.out.println("É um palíndromo");
        }else{
            System.out.println("Não é um palíndromo");
        }
    }
}
