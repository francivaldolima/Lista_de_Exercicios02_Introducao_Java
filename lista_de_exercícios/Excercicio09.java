package lista_de_exercícios;

import java.util.Locale;
import java.util.Scanner;

public class Excercicio09 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        double r, area;

        System.out.print("Digite o valor do raio do circulo: ");
        r = scan.nextDouble();

        area = 3.14159 * r * r;

        System.out.println("AREA = " + Math.round(area));
        
       

        scan.close();
    }
}
