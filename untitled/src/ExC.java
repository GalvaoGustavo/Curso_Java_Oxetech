import java.util.Scanner;

public class ExC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        int n2 = sc.nextInt();
        int n3 = n1+n2;

        System.out.printf("A soma do numero: %d+%d=%d",n1,n2,n3);
     sc.close();
    }
}
