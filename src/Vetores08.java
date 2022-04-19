import java.util.Locale;
import java.util.Scanner;

public class Vetores08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*Tem-se um conjunto de dados contendo a altura e o sexo (M, F) de N pessoas. Fazer um programa que calcule e escreva:
 a maior e a menor altura do grupo
 a média de altura das mulheres
 o número de homens*/
        System.out.print("Quantidade de dados: ");
        int N = sc.nextInt();

        double[] altura = new double[N];
        char[] sexo = new char[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();
            System.out.print("Sexo: ");
            sexo[i] = sc.next().charAt(0);
        }

        double maior = 0.0;
        double menor = altura[0];
        int posicao = 0;

        for (int i = 0; i < N; i++) {
            if (altura[i] > maior) {
                maior = altura[i];
                posicao = i;
            }
        }
        System.out.println("A maior altura é: " + altura[posicao]);

        for (int i = 0; i < N; i++) {
            if (altura[i] <= menor) {
                menor = altura[i];
                posicao = i;
            }
        }
        System.out.println("A menor altura é: " + altura[posicao]);

        double soma = 0.0;
        double media = 0.0;
        int cont = 0;
        for (int i = 0; i < N; i++) {
            if (sexo[i] == 'F') {
                soma = soma + altura[i];
                cont++;
                media = soma / cont;
            }
        }
        System.out.printf("Média altura feminina: %.2f%n" ,media);

        int contadorM = 0;
        for (int i = 0; i < N; i++) {
            if (sexo[i] == 'M') {
                contadorM++;
            }
        }
        System.out.println("O número de homens é: " + contadorM);
        sc.close();
    }
}
