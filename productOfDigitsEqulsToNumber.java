package PlacementPrograms;

import java.util.Scanner;

public class productOfDigitsEqulsToNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		System.out.print(Finding(n));

	}
	public static String Finding(int n) {
		if(n<9) {
			n+=10;
			
			return Integer.toString(n);
		}
		for(int i=9;i>=2;i--) {
			String string="";
			while(n>0) {
				if(n%i==0) {
					int num=i;
					string+=num;
					n/=i;	
				}
			}
			return string;
		}
		return "NOT POSSIBLE";
	}

}
