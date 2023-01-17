import java.util.Locale;
import java.util.Scanner;

public class cadalinha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i, n, j;
		
		System.out.printf("Qual a ordem da matriz? ");
		n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		int[] vet = new int[n];
		
		
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
			System.out.printf("Elemento [%d,%d]: ", i, j);
			mat[i][j] = sc.nextInt();
			}
		}
		
				
		System.out.println("MAIOR ELEMENTO DE CADA LINHA: ");
		for (i = 0; i < n; i++) {
			vet[i] = 0;
			for (j = 0; j < n; j++) {
				if (mat[i][j] > vet[i]) {
					vet[i] = mat[i][j];
				}
				
			}
			
			System.out.printf("%d\n" , vet[i]);
		}
		
		
		
		
		sc.close();
	}

}