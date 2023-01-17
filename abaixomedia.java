import java.util.Locale;
import java.util.Scanner;

public class abaixomedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			int i, n;
			double media, soma;
			
			System.out.print("Quantos elementos vai ter o vetor? ");
			n = sc.nextInt();
			
			double[] vet = new double[n];
			
			for (i = 0; i < n; i++) {
				System.out.print("Digite um numero: ");
				vet[i] = sc.nextDouble();
				
				
			}
			
			soma = 0;
			for (i = 0; i < n; i++) {
				soma = soma + vet[i];
			}
			System.out.println(); 
			
			media = soma / n;
			System.out.println("MEDIA DO VETOR: " + String.format("%.3f", media));
			
			System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
			for (i = 0; i < n; i++) {
				if (vet[i] < media) {
					System.out.println(vet[i]);
				}
			}
			
			sc.close();
		}
	}

}
