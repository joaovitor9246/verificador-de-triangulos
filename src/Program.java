import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double reta1;
        double reta2;
        double reta3;
        boolean naoFormaTriangulos;
        boolean valorInvalidos;

        do {

            System.out.println("Digite o comprimento do primeiro segmento de reta: ");
            reta1 = teclado.nextDouble();

            System.out.println("Digite o comprimento do segundo segmento de reta: ");
            reta2 = teclado.nextDouble();

            System.out.println("Digite o comprimento do terceiro segmento de reta: ");
            reta3 = teclado.nextDouble();

            naoFormaTriangulos = reta1 >= reta2 + reta3 || reta2 >= reta1 + reta3 || reta3 >= reta1 + reta2;
            valorInvalidos = reta1 <= 0 || reta2 <= 0 || reta3 <= 0;

            if (valorInvalidos) {
                System.out.println("Os segmentos de retas não podem ser valores nulos ou negativos !");
            } else if (naoFormaTriangulos){
                System.out.println("Não é possível formar um triângulo com esses segmentos de reta !");
            } else {
                System.out.println("É possível formar um triângulo com esses segmentos de reta !");
            }

        } while (valorInvalidos || naoFormaTriangulos);

        if (reta1 == reta2 && reta2 ==reta3) {
            System.out.println("O triângulo formado é equilátero !");
        } else if ((reta1 == reta2 && reta1 != reta3) || (reta1 == reta3 && reta1 != reta2) || (reta2 == reta3 && reta2 != reta1)) {
            System.out.println("O triângulo formado é isósceles !");
        } else {
            System.out.println("O triângulo formado é escaleno !");
        }

        teclado.close();
    }
}
