package CollectionPractice;

public class ClassJ {
  int no_of_tyres;
  String vehicle;
  
  public ClassJ(int no_of_tyres, String vehcile) {
	  this.no_of_tyres=no_of_tyres;
	  this.vehicle=vehcile;
  }

@Override                                  //alt+shift+s
public String toString() {
	return  no_of_tyres + " "+ vehicle ;
}
  
}
