package PlacementPrograms;

class Movies{
    String name;
    int rating;
    int moneyCollection;
    int Profit;
    String leadActor;
    String leadActress;
   void display(){
       System.out.println(name);
       System.out.println(rating);
       System.out.println(moneyCollection);
       System.out.println(Profit);
       System.out.println(leadActor);
       System.out.println(leadActress);
   }
}
public class CLass_Object {

	public static void main(String[] args) {
		Movies s=new Movies();
	    s.name="KGF";
	    s.rating=8;
	    s.moneyCollection=200000;
	    s.Profit=5000;
	    s.leadActor="YASH";
	    s.leadActress="Disha";
	    s.display();

	}

}
