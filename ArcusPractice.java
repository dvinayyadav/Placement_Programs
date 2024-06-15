package PlacementPrograms;

class Student {
    int Id;
    String name;
    int age;
    char grade;
    Student(int Id,String name,int age,char grade){
        this.Id=Id;
        this.name=name;
        this.age=age;
        this.grade=grade;
    }
    Student(int Id,String name,char g){
    	this.Id=Id;
    	this.name=name;
    	this.grade=g;
    }
    void display(){
        System.out.println(Id);
         System.out.println(name);
          System.out.println(age);
           System.out.println(grade);
    }
}
public class ArcusPractice {

	public static void main(String[] args) {
		 Student obj=new Student(25,"Vinay",24,'B');
	        obj.display();
	        Student obj1=new Student(24,"YADAV",'A');
	        obj1.display();

	}

}
