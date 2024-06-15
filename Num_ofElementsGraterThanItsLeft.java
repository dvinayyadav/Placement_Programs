package PlacementPrograms;
import java.util.*;

public class Num_ofElementsGraterThanItsLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scanner.nextInt();
		}
		int cnt=1;
		for(int i=1;i<n;i++) {
			if(arr[i]>arr[i-1]) {
				cnt++;
			}
		}
		System.out.print(cnt);

	}

}
