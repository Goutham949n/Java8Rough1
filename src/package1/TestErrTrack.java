package package1;

public class TestErrTrack {

	public static void main(String[] args) {
		try{
			throw new NullPointerException("file not found");
		}catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
		

	}

}
