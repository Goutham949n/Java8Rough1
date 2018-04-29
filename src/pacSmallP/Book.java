package pacSmallP;

class Book { 
	int id;
String name;

public Book (int id, String name) { 
	this.id = id;
this.name = name;

}

public boolean equals (Object obj) { 
	
	boolean output = false;
Book b = (Book) obj;

if (this.name.equals(b.name)) { 
	output = true;
}

return output;

}

}
