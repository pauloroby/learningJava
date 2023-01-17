import java.util.Locale;
import java.util.Scanner;

public class pares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			int n, i, cont;
			
			System.out.print("Quantos numeros voce vai digitar? ");
			n = sc.nextInt();
			
			int[] vet = new int[n];
			
			for (i = 0; i < n; i++) {
				System.out.print("Digite um numero: ");
				vet[i] = sc.nextInt();
				
			}
			System.out.println();
			
			System.out.println("NUMEROS PARES: ");
			
			for (i = 0; i < n; i++) {
				if (vet[i] % 2 == 0) {
					System.out.print(vet[i] + " ");
				}
			
			}
			
			cont = 0;
			for (i = 0; i < n; i++) {
				if (vet[i] % 2 == 0) {
					cont++;
				}
			}
			
			System.out.println();
			System.out.println();
			
			System.out.println("QUANTIDADE DE PARES = " + cont);
			
			sc.close();
		}
	}

}
