import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o comprimento do primeiro segmento de reta: ");
        double reta1 = teclado.nextDouble();
        
        System.out.println("Digite o comprimento do segundo segmento de reta: ");
        double reta2 = teclado.nextDouble();
        
        System.out.println("Digite o comprimento do terceiro segmento de reta: ");
        double reta3 = teclado.nextDouble();

        if (reta1 <= 0 || reta2 <= 0 || reta3 <= 0) {
            System.out.println("Os segmentos de retas não podem ser valores nulos ou negativos !");
        } else if (reta1 < reta2 + reta3 && reta2 < reta1 + reta3 && reta3 < reta1 + reta2){
            System.out.println("É possível formar um triângulo com esses segmentos de reta !");
        } else {
            System.out.println("Não é possível formar um triângulo com esses segmentos de reta !");
        }
        teclado.close();
    }
}
