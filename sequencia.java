import java.util.Locale;
import java.util.Scanner;

public class sequencia {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			int i, x;

			System.out.print("Digite o valor de X: ");
			x = sc.nextInt();

			for (i=0; i<=x; i++) {
			    if (i % 2 != 0) {
			    	System.out.printf("%d\n", i);
			    }
			}

			sc.close();
		}
	}
}