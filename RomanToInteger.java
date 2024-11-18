package PlacementPrograms;

import java.util.*;
import java.util.Scanner;

public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner scanner=new Scanner(System.in);
	String string=scanner.next();
	HashMap<Character,Integer> map=new HashMap<>();
  map.put('I', 1);
  map.put('V',5);
  map.put('X',10);
  map.put('L',50);
  map.put('C',100);
  map.put('D',500);
  map.put('M',1000);
  int num=0;
  for(int i=0;i<string.length()-1;i++) {
	  if(map.get(string.charAt(i))>=map.get(string.charAt(i+1))){
		  num+=map.get(string.charAt(i));
	  }
	  else {
		  num-=map.get(string.charAt(i));
	  }
	  
  }
  num+=map.get(string.charAt(string.length()-1));
  System.out.println(num);
	}

}
