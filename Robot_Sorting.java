package PlacementPrograms;

import java.util.*;
public class Robot_Sorting {
	public static String IsChecking(ArrayList<Integer> list) {
		for(int i=1;i<list.size();i++) {
	    	if(list.get(i)<list.get(i-1)) {
	    		return "NO";
	    	}
	    	
	    }
		return "YES";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int[] col=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int red=0,green=0;
		for(int i=0;i<n;i++){
		    col[i]=sc.nextInt();
		    if(col[i]==1){
		        red++;
		    }
		    else{
		        green++;
		    }
		}
		System.out.println(red+" "+green);
		if(red!=green){
		    System.out.println("NO");
		}
		else{
		    int[] r=new int[red];
		    int[] g=new int[green];
		    int j=0,k=0;
		    for(int i=0;i<n;i++){ 
		        if(col[i]==1){
		           System.out.println("red = "+arr[i]);
		           r[j]=arr[i];
		            j++;
		        }
		        else{
		        	System.out.println("green = "+arr[i]);
		        	g[k]=arr[i];
		            k++;
		        }
		    }
		    Arrays.sort(r);
		    Arrays.sort(g);
		  ArrayList<Integer> list=new ArrayList<>();
		    for(int i=0;i<red;i++) {
		    	list.add(g[i]);
		    	list.add(r[i]);
		    	
		    }
		    for(int i:list) {
		    	System.out.print(i+" ");
		    }
		    System.out.println(IsChecking(list));
	}
	}
}


