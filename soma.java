import java.util.Locale;
import java.util.Scanner;

public class soma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			int i, n;
			
			System.out.print("Quantos valores vai ter cada vetor? ");
			n = sc.nextInt();
			
			int[] a = new int[n];
			int[] b = new int[n];
			int[] c = new int[n];
			
			System.out.println("Digite os valores do vetor A:");
			for (i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			
			System.out.println("Digite os valores do vetor B:");
			for (i = 0; i < n; i++) {
				b[i] = sc.nextInt();
			}
			
			
			for (i = 0; i < n; i++) {
				c[i] = a[i] + b[i];
			}
			
			System.out.println("VETOR RESULTANTE:");
			for (i = 0; i < n; i++) {
				System.out.println(c[i]);
			}
			
			sc.close();
		}
	}

}
