import java.util.Locale;
import java.util.Scanner;

public class diagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i, n, j, cont;
		
		System.out.printf("Qual a ordem da matriz? ");
		n = sc.nextInt();
		
		int[][] matriz = new int[n][n];
		
		for (i = 0; i < n; i++) {
			for(j = 0; j < n; j++) {
				System.out.printf("Elemento [%d,%d]: ", i,j);
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("DIAGONAL PRINCIPAL: \n");
		for (i = 0; i < n; i++) {
			System.out.printf("%d ", matriz[i][i]);
		}
		
		cont = 0;
		for (i = 0; i < n; i++) {
			for(j = 0; j < n; j++) {
				if (matriz[i][j] < 0) {
					cont++;
				}
			}
		}
		
		System.out.printf("\nQUANTIDADE DE NEGATIVOS = %d", cont);
		
		sc.close();
	}

}