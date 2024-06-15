package PlacementPrograms;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		String string=Integer.toString(n);
		System.out.print(Integer.parseInt(string,2));

	}

}
