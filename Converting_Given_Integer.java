package PlacementPrograms;

import java.util.Scanner;

public class Converting_Given_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
int n=scanner.nextInt();
String string="";
while(n>0) {
	int num=9-(n%10);
	n/=10;
	string=num+string;
}
System.out.println(string);
	}

}
