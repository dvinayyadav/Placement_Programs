package PlacementPrograms;

public class PracticeOnObjects {
      String nameString;
      int Rollno;
      String courseString;
      public PracticeOnObjects(String str,int num,String c) {
		// TODO Auto-generated constructor stub
    	  this.nameString=str;
    	  this.Rollno=num;
    	  this.courseString=c;
    	  
	}
      public PracticeOnObjects(String str,int num) {
  		// TODO Auto-generated constructor stub
      	  this.nameString=str;
      	  this.Rollno=num;
      	  
  	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticeOnObjects objects=new PracticeOnObjects("Vinay", 38, "Mca");
		
		System.out.println(objects.nameString);
		System.out.println(objects.Rollno);
		System.out.println(objects.courseString);
       PracticeOnObjects objects2=new PracticeOnObjects("Yadav", 25);
       System.out.println(objects2.nameString);
		System.out.println(objects2.Rollno);
		System.out.println(objects2.courseString);
		//obj.hashcode();
		System.out.println(objects.hashCode());
		System.out.println(objects2.hashCode());
		//obj.toString();
		System.out.println(objects.toString());
		System.out.println(objects2.toString());
		System.out.println(objects2.equals(objects));
		
		
		
	}

}
