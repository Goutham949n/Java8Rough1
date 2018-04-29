package package1;

import java.math.BigDecimal;

public class Test1 {
static void doubling (Integer ref, int pv, String st, Test2 t2) {
ref =20;
pv = 20;
st= "";
t2.a = 44;

}

public static void main(String[] args) {
	Test2 tt = new Test2();
	tt.a = 2;
Integer iObj = new Integer(10);
int iVar = 10;
String st = "i";
doubling(iObj++, iVar++, st, tt);
if(iVar >0) {
	System.out.println("hello");
}{
	System.out.println("hello2");
}
double result = (19.999*100.0f)/200;
System.out.println(iObj+ ", "+iVar+ ", "+st+ ", "+ tt.a + ", "+ result);
}
}

class Test2{
	int a;
}