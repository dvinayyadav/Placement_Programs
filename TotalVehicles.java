package PlacementPrograms;

import java.util.Scanner;
public class TotalVehicles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int v=scanner.nextInt();
		int w=scanner.nextInt();
		int total=v*2;
		int Four=(w-total)/2;
		System.out.println("4W "+Four);
		System.out.println("2W "+(v-Four));
		
	}

}
