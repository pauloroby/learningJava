import java.util.Locale;
import java.util.Scanner;

public class alturas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			int i, n, cont;
			double media, soma, porcentagem;
			
			System.out.print("Quantas pessoas serao digitadas? ");
			n = sc.nextInt();
			
			String[] nome = new String[n];
			int[] idade = new int[n];
			double[] altura = new double[n];
			
			for (i = 0; i < n; i++) {
				System.out.println("Dados da " + (i + 1) + "a pessoa: ");
				sc.nextLine();
				System.out.print("Nome: ");
				nome[i] = sc.nextLine();
				System.out.print("Idade: ");
				idade[i] = sc.nextInt();
				System.out.print("ALtura: ");
				altura[i] = sc.nextDouble();
			}
			
		   soma = 0;
		   for (i = 0; i < n; i++) {
			   soma = soma + altura[i];
			   		   
		   }
		   cont = 0; 
		   for (i = 0; i < n; i++) {
			   if (idade[i] < 16) {
				  cont++;
				   
			   }
		   }
		   
		   System.out.println();
		   
		    porcentagem =  ((double) cont / n) * 100;
		    media = soma / n;
		    
			System.out.println("Altura media: " + String.format("%.2f", media));
			System.out.println("Pessoas com menos de 16 anos: " + String.format("%.1f", porcentagem) + "%");
			
			for (i = 0; i < n; i++) {
				   if (idade[i] < 16) {
					  System.out.println(nome[i]); 
				   }
			   }
			
			
			
			sc.close();
		}
	}

}
