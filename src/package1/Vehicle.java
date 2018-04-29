package package1;

public class Vehicle {
	String type = "4W";
	Byte bt = 127;
    int maxSpeed = 100;
    Vehicle(String type, int maxSpeed){
    	this.maxSpeed = maxSpeed;
    	this.type = type;
    }
}

class Car extends Vehicle{
	String trans;
	
	Car(String trans){
		super("", 9);
		this.trans = trans;
	}
	
	Car(String type, int maxSpeed, String trans){
		
		super(type, maxSpeed);
		this.trans = trans;
		
		//this(trans);
	}
}
