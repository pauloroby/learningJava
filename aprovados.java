import java.util.Locale;
import java.util.Scanner;

public class aprovados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			int i, n;
			double media;
			
			System.out.print("Quantos alunos serao digitados? ");
			n = sc.nextInt();
			
			String[] nome = new String[n];
			double[] n1 = new double[n];
			double[] n2 = new double[n];
			
			
			for (i = 0; i < n; i++) {
				System.out.println("Digite o nome, primra e segunda nota do " + (i+1) + "o aluno: ");
				sc.nextLine();
				nome[i] = sc.nextLine();
				n1[i] = sc.nextDouble();
				n2[i] = sc.nextDouble();
			}
			
			
			
			System.out.println("ALUNOS APROVADOS: ");
			for (i = 0; i < n; i++) {
				media = (n1[i] + n2[i]) / 2;
				if (media >= 6.0) {
					System.out.println(nome[i]);
				}
			}
			
			
			
			
			sc.close();
		}
	}

}
