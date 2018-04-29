package pacSmallP;


import java.io.*;

public class TestFileStream {

	
	public static void main (String[ ] args) { int i;
	char c = 'z';

	try ( FileInputStream fis = new FileInputStream ("course.txt"); 
		  InputStreamReader isr = new InputStreamReader(fis);) {
		 isr.skip(1);
  while (isr.ready()) { //line n1
	 


	i = isr.read (); 
	
	c = (char) i;
	System.out.print(c);

	}

	} catch (Exception e) { e.printStackTrace();
	}

	}

	
}
