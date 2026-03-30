import java.util.Scanner;

public class Prestacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota 1: ");
            float not1 = sc.nextFloat();

        System.out.print("Digite a nota 2: ");
            float not2 = sc.nextFloat();

        System.out.print("Digite a nota 3: ");
            float not3 = sc.nextFloat();

        System.out.print("Digite a nota 4: ");
            float not4 = sc.nextFloat();

            float media = (not1 + not2 + not3 + not4) / 4;

            char conceito;

        if (media >= 9.0 && media <= 10.0) {
            conceito = 'A';
        } else if (media >= 7.5) {
            conceito = 'B';
        } else if (media >= 6.0) {
            conceito = 'C';
        } else if (media >= 4.0) {
            conceito = 'D';
        } else {
            conceito = 'E';
        }

        String situacao;

        if (conceito == 'A' || conceito == 'B' || conceito == 'C') {
            situacao = "APROVADO";
        } else {
            situacao = "REPROVADO";
        }
        
        System.out.println("\nNotas: " + not1 + ", " + not2 + ", " + not3 + ", " + not4);
        System.out.println("Média: " + media);
        System.out.println("Conceito: " + conceito);
        System.out.println("Situação: " + situacao);

    }
}
