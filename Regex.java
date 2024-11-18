package PlacementPrograms;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String string=scanner.next();
		Pattern pattern=Pattern.compile("[a-zA-Z0-9:-@]+");
		Matcher matcher=pattern.matcher(string);
		if(matcher.matches()) {
			System.out.println("MATCHES");
		}
		else {
			System.out.println("NOT MATCHING");
		}
		while(matcher.find()) {
			System.out.println(string.substring(matcher.start(),matcher.end()));
		}

	}

}
