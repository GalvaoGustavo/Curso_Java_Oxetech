import java.util.Scanner;

public class ExG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a area do quadrado: ");
        double quadrado = sc.nextDouble();

        double area = quadrado * quadrado;
        double areaDobro = area * area;

        System.out.printf("A area do quadrado é: %.2f \n" +
                "area em dobro do quadrado é: %.2f",area,areaDobro);

        sc.close();
    }
}
