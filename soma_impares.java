import java.util.Locale;
import java.util.Scanner;

public class soma_impares {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			int i, x, y, soma, troca;

			System.out.println("Digite dois numeros:");
			x = sc.nextInt();
			y = sc.nextInt();

			if (x > y) {
			    troca = x;
			    x = y;
			    y = troca;
			}

			soma = 0;
			for (i = x+1; i < y; i++) {
			    if (i % 2 != 0) {
			        soma = soma + i;
			    }
			}

			System.out.printf("SOMA DOS IMPARES = %d\n", soma);

			sc.close();
		}
	}
}