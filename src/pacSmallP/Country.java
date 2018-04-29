package pacSmallP;

public class Country {

public enum Continent {ASlA, EUROPE} 

String name;
Continent region;
Integer id;





public Country (String na, Continent reg) {
	
	name = na; region = reg;
}

public String getName () {
	return name;
	} 

public Continent getRegion () {
	return region;
	}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public Country(String name, Continent region, Integer id) {
	super();
	this.name = name;
	this.region = region;
	this.id = id;
}




}
