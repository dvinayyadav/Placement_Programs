package PlacementPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class RomanLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
	   HashMap<Integer,Character> map=new HashMap<>();
	   map.put(1,'I');
	   map.put(5,'V');
	   map.put(10, 'X');
	   map.put(50,'L');
	   map.put(100,'C');
	   map.put(500,'D');
	   map.put(1000,'M');
	   String string="";
	   ArrayList<Integer> list=new ArrayList<>();
	   int d=10;
	   while(n>0) {
		   int x=n%d;
		   list.add(x);
		   n-=(n%d);
		   d*=10;
	   }
	   for(int i=0;i<list.size();i++) {
		   if(map.containsKey(list.get(i))) {
		   string=map.get(list.get(i))+string;
		   }
		   else {
			   
		   }
	   }
	   System.out.println(list);
	   System.out.println(string);
	}

}
