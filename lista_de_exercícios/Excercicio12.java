
package lista_de_exercícios;

import java.util.Scanner;


public class Excercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quilometrosDirecionados;
        int litrosConsumidos;
        double consumoMedio;
        double quilometragemTotal = 0;
        double litrosTotal = 0;

        System.out.print("Digite os quilômetros dirigidos: ");
        quilometrosDirecionados = scan.nextInt();

        System.out.print("Digite os litros de gasolina consumidos: ");
        litrosConsumidos = scan.nextInt();

       
        consumoMedio = (double) quilometrosDirecionados / litrosConsumidos;

        System.out.println("O consumo médio é " + consumoMedio + " quilômetros/litro.");

        quilometragemTotal += quilometrosDirecionados;
        litrosTotal += litrosConsumidos;

        System.out.println("A quilometragem total é " + quilometragemTotal + " quilômetros.");
        System.out.println("A quantidade total de litros consumidos é " + litrosTotal + " litros.");
    }
}
