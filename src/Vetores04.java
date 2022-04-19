import java.util.Locale;
import java.util.Scanner;

public class Vetores04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        /*Fazer um programa para ler um vetor de N números reais. Em seguida, mostrar na tela a média aritmética de todos
elementos. Depois mostrar todos os elementos do vetor que estejam abaixo da média.*/
        System.out.print("Tamanho do vetor: ");
        int N = sc.nextInt();

        double[] vet = new double[N];

        System.out.println("Dados do vetor: ");
        for (int i = 0; i < N; i++) {
            vet[i] = sc.nextDouble();
        }

        System.out.println("Calculando a média aritmética...");
        double soma = 0.0;
        double media = 0;
        for (int i = 0; i < N; i++) {
            soma += vet[i];
            media = soma / N;
        }
        System.out.printf("A média é: %.1f%n", media);

        System.out.println("Números abaixo da média: ");
        for (int i = 0; i < N; i++) {
            if (vet[i] < media) {
                System.out.println(vet[i]);
            }
        }

        sc.close();
    }
}
