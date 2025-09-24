import java.util.Scanner;

public class MediaEscolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as 8 notas do aluno (aperte Enter após cada nota).");
        double[] n = new double[8];
        for (int i = 0; i < 8; i++) {
            System.out.print((i + 1) + "ª nota: ");
            if (sc.hasNextDouble()) {
                n[i] = sc.nextDouble();
            } else {
                System.out.println("Entrada inválida. Por favor, digite números (ex: 7.5).");
                sc.next(); // consome token inválido
                i--; // refaz essa iteração
            }
        }

        // Médias bimestrais (cada bimestre = média de 2 notas)
        double b1 = (n[0] + n[1]) / 2.0;
        double b2 = (n[2] + n[3]) / 2.0;
        double b3 = (n[4] + n[5]) / 2.0;
        double b4 = (n[6] + n[7]) / 2.0;

        // Médias semestrais (cada semestre = média de 2 bimestres)
        double s1 = (b1 + b2) / 2.0;
        double s2 = (b3 + b4) / 2.0;

        // Média final (média dos 2 semestres)
        double mediaFinal = (s1 + s2) / 2.0;

        System.out.println("\n-------------------------------");
        System.out.printf("1º Bimestre: %.1f%n", b1);
        System.out.printf("2º Bimestre: %.1f%n", b2);
        System.out.printf("1º Semestre: %.1f%n", s1);
        System.out.println("-------------------------------");
        System.out.printf("3º Bimestre: %.1f%n", b3);
        System.out.printf("4º Bimestre: %.1f%n", b4);
        System.out.printf("2º Semestre: %.1f%n", s2);
        System.out.println("-------------------------------");
        System.out.printf("Média Final: %.1f%n", mediaFinal);

        sc.close();
    }
}
