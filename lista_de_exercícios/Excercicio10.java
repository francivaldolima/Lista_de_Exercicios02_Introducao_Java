package lista_de_exercícios;

import java.util.Scanner;

public class Excercicio10 {

    public static void main(String[] args) {
        
        int qtdVogais = 0,qtdEspacosEmBranco=0, qtdConsoantes=0;

        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite uma cadeia de caracteres: ");
        String palavra = scan.nextLine();

        palavra = palavra.toLowerCase();
        
        for (char letra : palavra.toCharArray()) {
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                qtdVogais++;
            } else if (letra == ' ') {
               qtdEspacosEmBranco++;
            } else if((Character.isLetter(letra))){
                qtdConsoantes++;
            }
        }
        
        
        System.out.println(palavra);
        System.out.println("Vogais: " + qtdVogais);
        System.out.println("Espacos Em Branco: " + qtdEspacosEmBranco);
        System.out.println("Consoantes: " + qtdConsoantes);
       

        
    }
}
