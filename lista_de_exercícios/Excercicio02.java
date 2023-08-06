
package lista_de_exercícios;

import java.util.Scanner;


public class Excercicio02 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite valor 1: ");
        int valor1 = scan.nextInt();
        System.out.println("Digite valor 2: ");
        int valor2 = scan.nextInt();
        
        if (valor1 > valor2) {
            System.out.println(valor1);
        }else{
             System.out.println(valor2);
        }
          
        scan.close();
    }
}
