package lista_de_exercícios;

public class Excercicio07 {

    public static void main(String[] args) {

        for (int i = 3; i <= 100; i++) {
            if (i % 3 == 0) {
                int resultadoInt = i / 2;
                double resultadoDouble = (double) i / 2;

                System.out.println("Resultado Int: " + resultadoInt);
                System.out.println("Resultado Double: " + resultadoDouble);

            }
        }
    }
}
