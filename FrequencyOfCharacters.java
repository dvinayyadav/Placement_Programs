package PlacementPrograms;
import java.util.Scanner;
public class FrequencyOfCharacters {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String str=sc.next();
        str=str.toLowerCase();
        int[] arr=new int[26];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isLetter(ch)){
                int idx=ch-'a';
                arr[idx]++;
            }
        }
        for(int i=0;i<26;i++){
            if(arr[i]>0){
                System.out.println((char)(i+'a')+" "+arr[i]);
            }
        }
	}

}
