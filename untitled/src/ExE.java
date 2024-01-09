import java.util.Scanner;

public class ExE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de METROS para ser convertido em centimetros:");
        int metros = sc.nextInt();

        int conversao = metros * 100;

        System.out.printf("Os %d metros convertido em centimetros, fica: %d centimetros. ",metros,conversao);

        sc.close();
    }
}
