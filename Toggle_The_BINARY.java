package PlacementPrograms;
import java.util.*;

public class Toggle_The_BINARY {
	static String DOMCryptoBinary(int n) {
		 String str="";
		if(n==0) {
			return "1";
		}else {
			while(n>0) {
			str=(n%2)+str;
			n/=2;
			}
		}
		return str;
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		String str=DOMCryptoBinary(num);
		System.out.println(str);
        int[] arr=new int[str.length()];
        for(int i=0;i<str.length();i++) {
        	if(str.charAt(i)=='1') {
        	arr[i]=0;
        	}
        	else 
			arr[i]=1;
        }
        int ans=0,pow=1;
        for(int i=str.length()-1;i>=0;i--) {
        	ans+=(arr[i]*pow);
        	pow*=2;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(ans);
	}

}
