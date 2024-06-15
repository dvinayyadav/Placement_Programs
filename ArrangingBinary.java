package PlacementPrograms;

import java.util.*;
public class ArrangingBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 String string=sc.next();
 String string2=sc.next();
char[] arr=string.toCharArray();
char[] arr1=string2.toCharArray();
Arrays.sort(arr);
Arrays.sort(arr1);
System.out.println(Arrays.toString(arr));
System.out.println(Arrays.toString(arr1));
System.out.println(Arrays.equals(arr,arr1));
	}

}
