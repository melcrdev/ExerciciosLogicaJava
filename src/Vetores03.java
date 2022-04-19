import java.util.Locale;
import java.util.Scanner;

public class Vetores03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        /* Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um terceiro vetor C onde
cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima o vetor C gerado.*/
        System.out.print("Digite os tamanhos dos seus vetores: ");
        int N = sc.nextInt();

        int[] A = new int[N];
        int[] B = new int[N];

        System.out.println("Coloque os dados do vetor A : ");
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println("Coloque os dados do vetor B : ");
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }

        int[] C = new int[N];

        System.out.println("O vetor C é: ");
        for (int i = 0; i < N; i++) {
            C[i] = A[i] + B[i];
            System.out.println(C[i]);
        }

        sc.close();
    }
}
