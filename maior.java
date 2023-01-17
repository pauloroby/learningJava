import java.util.Locale;
import java.util.Scanner;

public class maior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			int n, i, mvalor;
			   double maior;
			   
			   System.out.print("Quantos numeros voce vai digitar? ");
			   n = sc.nextInt();
			
			   double[] vet = new double[n];
			   
			   for (i = 0; i < n; i++) {
				   System.out.print("Digite um numero: ");
				   vet[i] = sc.nextDouble();
				   
				   
				   
			   }
			
			   mvalor = 0;
			   maior = 0;	
			   for (i = 0; i < n; i++) {
				   if (vet[i] > maior) {
					   maior = vet[i];
					   mvalor = i;
				   }
					   
				   }
			   System.out.println();
			   
			   System.out.println("MAIOR VALOR: " + String.format("%.1f", maior));
					   
			   System.out.println("POSIÇÃO DE MAIOR VALOR: " + mvalor);
				
				
				
				sc.close();
		}
	}

}
