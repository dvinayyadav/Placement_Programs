package PlacementPrograms;

import java.util.Scanner;

public class TechM {
	static String instituteString="Arcus";
	String studentNameString;
	int Id;
	int age;
	String Course;
     TechM(String studentNameString,int Id,String Course){
    	 this.studentNameString=studentNameString;
    	 this.Id=Id;
    	 this.Course=Course;
     }
    public void Display() {
    	
    	System.out.println(studentNameString);
    	System.out.println(Id);
    	System.out.println(Course);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println(instituteString+" Institute Student Details : ");
		TechM objM=new TechM("Vinay",25,"JFS");
		objM.Display();
		TechM objM1=new TechM("Yadav",26,"TESTING");
		objM1.Display();
		TechM objM2=new TechM("Yadav",26,"DATA SCIENCE");
		objM2.Display();
		

	}

}
