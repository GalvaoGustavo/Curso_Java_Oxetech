import java.util.Scanner;

public class ExH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe quanto você recebe por hora: ");
        double valorHoras = sc.nextDouble();
        System.out.println("Digite quantas horas foram trabalhadas: ");
        int horasTrabalhadas = sc.nextInt();

        double salario = horasTrabalhadas * valorHoras;

        System.out.printf("Voce trabalhou %s horas, recebendo o valor $%.2f por hora trabalhada, totalizando o salario de : $%.2f",horasTrabalhadas,valorHoras,salario);



        sc.close();
    }
}
