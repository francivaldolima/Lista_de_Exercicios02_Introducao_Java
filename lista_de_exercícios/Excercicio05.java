
package lista_de_exercícios;

import java.util.Scanner;


public class Excercicio05 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String[] diasDaSemana = {"Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado", "Domingo"};
        
        System.out.println("Digite número de 1 a 7: ");
        int numero = scan.nextInt();
        
        if (numero >= 1 && numero <= 7) {
            String dia = diasDaSemana[numero - 1];
            System.out.println("O dia da semana correspondente é: " + dia);
        } else {
            System.out.println("Opção Inválida");
        }
        
        scan.close();
    }
}
