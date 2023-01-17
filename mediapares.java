import java.util.Locale;
import java.util.Scanner;

public class mediapares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			int n, i, soma, cont;
			double media;
			
			System.out.print("Quantos elementos vai ter o vetor? ");
			n = sc.nextInt();
			
			int[] vet = new int[n];
			
			for (i = 0; i < n; i++) {
				System.out.print("Digite um numero: ");
				vet[i] = sc.nextInt();
							
			}
			cont = 0;
			soma = 0;
			for (i = 0; i < n; i++) {
				if (vet[i] % 2 == 0) {
					soma = soma + vet[i];
					cont++;
				}
							
			}
			 
			if (cont == 0) {
				System.out.println("NENHUM NUMERO PAR");
			}
			else {
				media = (double)soma / cont;
				System.out.println("MEDIA DOS PARES = " + String.format("%.1f", media));
			}
			
			
			
			
			
			sc.close();
		}
	}

}