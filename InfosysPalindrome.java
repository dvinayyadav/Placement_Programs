package PlacementPrograms;
import java.util.*;
public class InfosysPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	       int n=sc.nextInt();
	       String str=Integer.toString(n);
	       while(!isPalindrome(str)){
	           int rev=isReverse(str);
	           n+=rev;
	           str=Integer.toString(n);
	           
	       }
	       System.out.println(str);
	  
	    }
	    public static boolean isPalindrome(String str){
	        int i=0,j=str.length()-1;
	        while(i<j){
	            if(str.charAt(i)!=str.charAt(j)){
	                return false;
	            }
	            i++;
	            j--;
	        }
	        return true;
	    }
	    public static int isReverse(String str){
	        String ss="";
	        for(int i=0;i<str.length();i++){
	            ss=str.charAt(i)+ss;
	        }
	        return Integer.valueOf(ss);


	}

}
