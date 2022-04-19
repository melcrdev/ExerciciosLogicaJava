import java.util.Locale;
import java.util.Scanner;

public class Vetores05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        /*Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média aritmética somente
dos números pares lidos. */

        System.out.print("Tamanho do vetor: ");
        int N = sc.nextInt();

        int[] vet = new int[N];

        System.out.println("Dados do vetor: ");
        for (int i = 0; i < N; i++) {
            vet[i] = sc.nextInt();
        }

        System.out.println("Calculando a média aritmética de todos os valores pares... ");

        double soma = 0;
        double media = 0.0;
        int cont = 0;
        for (int i = 0; i < N; i++) {
            if (vet[i] % 2 == 0) {
                soma += vet[i];
                cont++;
                media = soma / cont;
            }
        }
        System.out.println("A média aritmética dos pares é: " + media);

        sc.close();
    }
}
