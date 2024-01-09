import java.util.Scanner;

public class ExF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("DIgite o raio de um circulo:");
        double raio = sc.nextDouble();

        double area = Math.PI * (raio * raio);
        System.out.printf("A area do circulo é: %.4f",area);

        sc.close();
    }
}
