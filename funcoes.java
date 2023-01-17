import java.util.Locale;
import java.util.Scanner;

public class funcoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i,j;
		String original, s01, s02, s03, s04, s05, s06, s07; 

		original = ("abcde FGHIJ ABC abc DEFG   ");
		
		s01 = original.toLowerCase();
		s02 = original.toUpperCase();
		s03 = original.trim();
		s04 = original.substring(2);
		s05 = original.substring(2, 9);
		s06 = original.replace('a', 'x');
		s07 = original.replace("abc", "xy");
		i = original.indexOf("bc");
		j = original.lastIndexOf("bc");
		
		
		System.out.printf("-Original: -%s-%n",original);
		System.out.printf("-toLowerCase: -%s-%n",s01);
		System.out.printf("-toUpperCase: -%s-%n",s02);
		System.out.printf("-trim: -%s-%n",s03);
		System.out.printf("-substring(2): -%s-%n",s04);
		System.out.printf("-substring(2, 9): -%s-%n",s05);
		System.out.printf("-replace('a', 'x'): -%s-%n",s06);
		System.out.printf("-replace('abc', 'xy'): -%s-%n",s07);
		System.out.printf("-indexOf 'bc': %s%n", i);
		System.out.printf("-lastIndexOf 'bc': %s%n", j);
		
		
		
		
		
		
		sc.close();
	}

}
