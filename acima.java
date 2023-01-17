import java.util.Locale;
import java.util.Scanner;


public class acima {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int i, j, n, soma;
		
		System.out.print("Qual a ordem da matriz? ");
		n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		
		for(i = 0; i < n; i++) {
			for(j = 0; j < n; j++) {
				System.out.printf("Elemento [%d,%d]: ", i, j);
				mat[i][j] = sc.nextInt();
				
				
			}
		}
		
		soma = 0;
		for(i = 0; i < n; i++) {
			for(j = i+1; j < n; j++) {
				soma = soma + mat[i][j];
				
				
			}
		}
		
		System.out.printf("Soma dos elementos acima da diagonal principal: %d", soma);
		
		
		sc.close();
		
			
	}
}