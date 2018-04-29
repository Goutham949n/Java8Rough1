package pacSmallP;

public class Test<T> { private T t;
public T get () { return t;
}

public void setT (T t) { this.t = t;
}

public static void main (String args [ ] ) { 
int sum;
	Test<String> type = new Test<>();
Test type1 = new Test ();//line n1 
type.setT("java"); 
type1.setT(100);//line n2
System.out.print(type.get() + " "+ type1.get());

}

}
