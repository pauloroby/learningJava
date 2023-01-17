import java.util.Locale;
import java.util.Scanner;


public class geral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i, n, j, linha, coluna;
		double soma;
		
		System.out.print("Qual a ordem da matriz? ");
		n = sc.nextInt();
		
		double[][] mat = new double[n][n];
		
		for (i = 0; i < n; i++) {
			for(j = 0; j < n; j++) {
				System.out.printf("Elemento [%d,%d]: ", i, j);
				mat[i][j] = sc.nextDouble();
			}
		}
		
		soma = 0;
		for (i = 0; i < n; i++) {
			
			for(j = 0; j < n; j++) {
				if (mat[i][j] > 0) {
				soma = soma + mat[i][j];
				}
			}
		}
		System.out.println();
		System.out.printf("SOMA DOS POSITIVOS: %.1f", soma);
		
		System.out.println();
		System.out.println();
		
		System.out.printf("Escolha uma linha: ");
		linha = sc.nextInt();
		
		System.out.print("LINHA ESCOLHIDA: ");
		for (j = 0; j < n; j++) {
			System.out.printf("%.1f ", mat[linha][j]);
		}
		
		System.out.println();
		System.out.println();
		
		System.out.printf("Escolha uma coluna: ");
		coluna = sc.nextInt();
		
		System.out.print("COLUNA ESCOLHIDA: ");
		for (i = 0; i < n; i++) {
			System.out.printf("%.1f ", mat[i][coluna]);
		}
		
		System.out.println();
		System.out.println();
		
		System.out.print("DIAGONAL PRINCIPAL: ");
		for (i = 0; i < n; i++) {
			System.out.printf("%.1f ", mat[i][i]);
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("MATRIZ ALTERADA: ");		
		for (i = 0; i < n; i++) {
			for(j = 0; j < n; j++) {
				if (mat[i][j] < 0) {
					mat[i][j] = Math.pow(mat[i][j], 2);
				}
				System.out.printf("%.1f  " , mat[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		sc.close();
	}

}
