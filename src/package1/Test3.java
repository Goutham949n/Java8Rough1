package package1;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
	
	public static void main(String[] args) {
		List<Patient> ps = new ArrayList<Patient>();
		Patient p2 = new Patient("Mike");
		ps.add(p2);
		Patient p = new Patient("Mike");
		int f = ps.indexOf(p2);
		if(f>=0) {
			System.out.println("mike found");
		}
		
	}

}

class Patient{
	String name;

	public Patient(String name) {
		super();
		this.name = name;
	}
	
}
