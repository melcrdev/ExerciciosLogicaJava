import java.util.Locale;
import java.util.Scanner;

public class Vetores07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        /*Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram no 1º e 2º semestres.
Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir os nomes dos alunos aprovados,
considerando aprovados aqueles cuja média das notas seja maior ou igual a seis*/

        System.out.print("Quantidade de dados: ");
        int N = sc.nextInt();

        String[] name = new String[N];
        double[] n1 = new double[N];
        double[] n2 = new double[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Nome do Aluno: ");
            name[i] = sc.next();
            System.out.print("Nota do 1º semestre: ");
            n1[i] = sc.nextDouble();
            System.out.print("Nota do 2º semestre: ");
            n2[i] = sc.nextDouble();
        }
        System.out.println("Alunos Aprovados: ");

        double media = 0.0;

        for (int i = 0; i < N; i++) {
            media = (n1[i] + n2[i]) / 2.0;
            if (media >= 6.0) {
                System.out.println(name[i]);
            }
        }
        sc.close();
    }
}
