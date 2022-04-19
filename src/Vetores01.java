import java.util.Locale;
import java.util.Scanner;

public class Vetores01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        /* Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela o maior número
do vetor (supor não haver empates). Mostrar também a posição do maior elemento.*/

        System.out.print("Digite o tamanho do seu vetor: ");
        int N = sc.nextInt();

        double[] vet = new double[N];

        System.out.println("Agora digite seus dados abaixo: ");
        for (int i = 0; i < N; i++) {
            vet[i] = sc.nextDouble();
        }

        double maior = vet[0];
        int posicao = 0;

        for (int i = 0; i < N; i++) {
            if (vet[i] > maior) {
                maior = vet[i];
                posicao = i;
            }
        }

        System.out.printf("O maior valor é: %.1f%n", maior);
        System.out.println("Sua posição é: " + posicao);
        sc.close();
    }
}
