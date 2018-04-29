package pacSmallP;

public class TestRest {

	public static void main(String[] args) {
		final String uri = "http://localhost:8080/SpringRESTExample/rest/Employees";
		 RestTemplate restTemplate = new RestTemplate();
		 String result = restTemplate.getForObject(uri, String.class); 
		 System.out.println(result);
	}

}
