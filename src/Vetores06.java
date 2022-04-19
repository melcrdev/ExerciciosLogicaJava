import java.util.Locale;
import java.util.Scanner;

public class Vetores06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        /*Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Depois, mostrar na tela o nome
da pessoa mais velha.*/
        System.out.print("Quantidade de dados: ");
        int N = sc.nextInt();

        String[] name = new String[N];
        int[] age = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Nome: ");
            name[i] = sc.next();
            System.out.print("idade: ");
            age[i] = sc.nextInt();
        }

        int maiorIdade = age[0];
        int posicao = 0;
        String pessoa = " ";

        for (int i = 0; i < N; i++) {
            if (age[i] > maiorIdade) {
                maiorIdade = age[i];
                posicao = i;
                pessoa = name[i];
            }
        }

        System.out.println("A pessoa mais velha é: " + pessoa + " e sua posição no array é: " + posicao);

        sc.close();
    }
}
