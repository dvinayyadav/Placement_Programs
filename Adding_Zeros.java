package PlacementPrograms;

import java.util.Scanner;

public class Adding_Zeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt(),m=scanner.nextInt();
		String string=Integer.toString(m);
		for(int i=n;i<=m;i++) {
			String str1=Integer.toString(i);
			while(string.length()>str1.length()) {
				str1='0'+str1;
			}
			System.out.print(str1+" ");
		}
        
	}

}
