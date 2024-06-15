package PlacementPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KaprekarNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int p=scanner.nextInt();
		int q=scanner.nextInt();
		for(int i=p;i<=q;i++) {
			if(CheckingKaprekar(i)) {
				System.out.print(i+" ");
			}
		}

	}
	static boolean CheckingKaprekar(int n) {
		Boolean ans=false;
			int temp=n;
			int h=1;
			while(temp>0) {
				temp/=10;
				h*=10;
			}
			int square=n*n;
			int last=square%h;
			square/=h;
			if(last+square==n) {
				ans=true;
			}
			return ans;
	}

}
