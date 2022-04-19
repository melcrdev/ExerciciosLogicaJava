import java.util.Scanner;

public class Vetores02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na tela:
- todos os números pares
- todos os ímpares
- a quantidade de números pares
- a quantidade de números ímpares
*/

        System.out.print("Qual será o tamanho do seu vetor ? ");
        int N = sc.nextInt();

        System.out.println("Coloque os dados abaixo: ");
        int[] vet = new int[N];

        for (int i = 0; i < N; i++) {
            vet[i] = sc.nextInt();
        }

        int quantidadePar = 0;
        int quantidadeImpar = 0;


        for (int i = 0; i < N; i++) {
            if (vet[i] % 2 == 0) {
                System.out.println("O número: " + vet[i] + " é par." );
                quantidadePar += 1;
            }
            else {
                System.out.println("O número: " + vet[i] + " é ímpar.");
                quantidadeImpar += 1;
            }
        }

        System.out.println("Quantidade de números pares: " + quantidadePar);
        System.out.println("Quantidade de números ímpares: " + quantidadeImpar);

        sc.close();
    }
}
