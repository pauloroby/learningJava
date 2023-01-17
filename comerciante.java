import java.util.Locale;
import java.util.Scanner;

public class comerciante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			int i, n, abaixo, entre, acima;
			
			double vvenda, vcompra, lucro,  porcentagem;
			
			
			System.out.printf("Serão digitados dados de quantos produtos? ");
			n = sc.nextInt();
			
			String[] nome = new String[n];
			double[] pcompra = new double[n];
			double[] pvenda = new double[n];
			
			for (i = 0; i < n; i++) {
				System.out.printf("Nome: ");
				sc.nextLine();
				nome[i] = sc.nextLine();
				System.out.printf("Preco de compra: ");
				pcompra[i] = sc.nextDouble();
				System.out.printf("Preco de venda: ");
				pvenda[i] = sc.nextDouble();
			}
			
			vcompra = 0;
			vvenda = 0;
			lucro = 0;
			for (i = 0; i < n; i++) {
				vcompra = vcompra + pcompra[i];
				vvenda = vvenda + pvenda[i];
				
			}
			lucro = vvenda - vcompra;
			
			abaixo = 0;
			entre = 0;
			acima = 0;
			for (i = 0; i < n; i++) {
				porcentagem = (pvenda[i] - pcompra[i]) / pcompra[i] * 100;
				if (porcentagem < 10) {
					abaixo++;
				}
				else if (porcentagem < 20) {
					entre++;
				}
				else {
					acima++;
				}
			}
			
			System.out.println();
			
			System.out.println("RELATORIO: ");
			System.out.printf("Lucro abaixo de 10%%: %d \n" , abaixo);
			System.out.printf("Lucro entre 10%% e 20%%: %d \n" , entre);
			System.out.printf("Lucro acima de 20%%: %d \n", acima);
			
			System.out.printf("Valor total de compra: %.2f  \n", vcompra);
			System.out.printf("Valor total de compra: %.2f  \n", vvenda);
			System.out.printf("Valor total de compra: %.2f \n", lucro);
			
			
			
			
			
			sc.close();
		}
	}

}