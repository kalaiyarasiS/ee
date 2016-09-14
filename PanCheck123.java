import java.util.Scanner;

public class PanCheck123 {
	public static final int alp = 26;
	private static Scanner s;

	public int panChe(String str) {
		if (str.length() < alp) {
			return -1;
		}
		for (char c = 'A'; c <= 'Z'; c++) {
			if ((str.indexOf(c) < 0) && (str.indexOf((char) (c + 32)) < 0)) {
				return -1;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("\"Pangram Check\" "+ "\nEnter the String");
		String s1 = s.nextLine();
		PanCheck obj = new PanCheck();
		int rs; 
		rs= obj.panChe(s1);
		if (rs == -1)
			System.out.print("Given String : "+ "\"Not a Pangram\"");
		else
			System.out.print("Given String : " +"\"Pangram\"");
	}
}
