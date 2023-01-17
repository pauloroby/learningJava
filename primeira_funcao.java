import java.util.Locale;
import java.util.Scanner;


public class primeira_funcao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int a,b,c, higher;
		
		System.out.printf("Enter three numbers: %n");
	
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		higher = max(a,b,c);
		
		showResult(higher);
		
		sc.close();
		
			
	}
	public static int max(int x, int y, int z) {
		int aux;
		if(x > y && x > z) {
			aux = x;
			
		}
		else if (y > z) {
			aux = y;
		}
		else {
			aux = z;
		}
	return aux;
	
	}
	
	public static void showResult(int value) {
		System.out.printf("Higher = %d", value);
	}
	
		
	
}