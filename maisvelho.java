import java.util.Locale;
import java.util.Scanner;

public class maisvelho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			int i, n, maior, pmaior;
			
			System.out.print("Quantas pessoas voce vai digitar? ");
			n = sc.nextInt();
			
			String[] nome = new String[n];
			int[] idade = new int[n];
			
			for (i = 0; i < n; i++) {
				System.out.println("Dados da" + (i+1) + "a pessoa:");
				sc.nextLine();
				System.out.print("Nome: ");
				nome[i] = sc.nextLine();
				System.out.print("Idade: ");
				idade[i] = sc.nextInt();
				
			}
			
			maior = 0;
			pmaior = 0;
			for (i = 0; i < n; i++) {
				if(idade[i] > maior) {
					maior = idade[i];
					pmaior = i;
				}
			}
			
			System.out.println("PESSOA MAIS VELHA: " + nome[pmaior]);
			
			sc.close();
		}
	}

}
