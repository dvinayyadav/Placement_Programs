package PlacementPrograms;

import java.util.*;

public class RemovingAdjacentDublicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String string=scanner.next();
		System.out.println(DubliString(string));

	}
	public static String DubliString(String str) {
		Stack<Character> st=new Stack<>();
		for(int i=0;i<str.length();i++) {
			char ch=
					
					str.charAt(i);
			if(st.size()==0) {
				st.push(ch);
			}
			else {
				if(st.peek()!=ch) {
					st.push(ch);
				}
			}
		}
		String anString="";
		while(st.size()>0) {
			anString=st.pop()+anString;
		}
		return anString;
	}

}
