import java.util.Scanner;

public class ExD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as 4 notas para saber a media. ");
        double cont = 0;
        for (int i=1;i<5;i++){
            System.out.println("DIgite a nota "+i+":");
            cont += sc.nextDouble();
        }
        double media = cont /4;
        System.out.println("A media foi: "+media);
        sc.close();
    }
}
