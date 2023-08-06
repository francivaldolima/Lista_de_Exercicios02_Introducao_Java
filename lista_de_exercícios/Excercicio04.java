
package lista_de_exercícios;

import java.util.Scanner;

public class Excercicio04 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite uma distância expressa em milhas:");
        double milhas = scan.nextDouble();
        
        double km = milhas * 1.6;
        
        System.out.println(km + " KM");
        
        scan.close();
    }
}
