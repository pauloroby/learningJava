import java.util.Locale;
import java.util.Scanner;

public class dados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			int i, n, cont, contf;
			double maltura, maioralt, soma, media;
			
			System.out.print("Quantas pessoas serao digitadas? ");
			n = sc.nextInt();
			
			double[] altura = new double[n];
			char[] genero = new char[n];
			
			
			for (i = 0; i < n; i++) {
				System.out.println("Altura da " + (i+1) + "a pessoa: ");
				altura[i] = sc.nextDouble();
				System.out.println("Genero da " + (i+1) + "a pessoa: ");
				genero[i] = sc.next().charAt(0);
				
			}
			
			maltura = altura[0];
			maioralt = altura[0];
			for (i = 0; i < n; i++) {
				if (altura[i] > maioralt) {
					maioralt = altura[i];
				}
				
				if (altura[i] < maltura) {
					maltura = altura[i];
				}
			}
			
			
			soma = 0;
			contf = 0;
			cont = 0;
			for (i = 0; i < n; i++) {
				if (genero[i] == 'f') {
					soma = soma + altura[i];
					contf++;	
				}
				if(genero[i] == 'm') {
					cont++;
				}
			}
			
					
			media = soma / contf;
			System.out.println("MENOR ALTURA = " + String.format("%.2f", maltura));
			System.out.println("MAIOR ALTURA = " + String.format("%.2f", maioralt));
			System.out.println("MEDIA DAS ALTURAS DAS MULHERES = " + String.format("%.2f", media));
			System.out.println("NUMERO DE HOMENS = " + cont);
			sc.close();
		}
	}

}