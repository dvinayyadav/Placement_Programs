package PlacementPrograms;

import java.util.*;
public class SubStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method
		 Scanner sc=new Scanner(System.in);
	       String str=sc.next();
	     ArrayList<String> ss= subStrings(str);
	     List<String> l1=ss.stream().sorted((a,b)->Integer.compare(a.length(),b.length())).toList();
	     System.out.print(l1);
	    }
	    public static ArrayList<String> subStrings(String str){
	        ArrayList<String> list=new ArrayList<>();
	        int n=str.length();
	        for(int i=0;i<n;i++){
	            for(int j=i;j<n;j++){
	                String str1="";
	                for(int k=i;k<=j;k++){
	                    str1+=str.charAt(k);
	                }
	                list.add(str1);
	            }
	        }
	        return list;
		}
		

}
