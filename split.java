import java.util.Locale;
import java.util.Scanner;

public class split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String s; 
		
		s = "apple potato lemon banna";
		
		String[] vet = s.split(" ");
		
		System.out.println(vet[0]); 
		System.out.println(vet[1]); 
		System.out.println(vet[2]); 
		System.out.println(vet[3]);
		
		
		
		
		sc.close();
	}

}
