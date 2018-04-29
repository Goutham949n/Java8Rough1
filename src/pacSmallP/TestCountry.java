package pacSmallP;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestCountry {

	public static void main(String[] args) {
		List<Country> couList = Arrays.asList (

				new Country ("Japan", Country.Continent.ASlA,9),
				new Country ("Germany1", Country.Continent.ASlA,99),
				new Country ("India", Country.Continent.ASlA,89),
				new Country ("ltaly", Country.Continent.EUROPE,90),
				new Country ("Germany", Country.Continent.EUROPE,999)); 
		
		List<String> collect2 = couList.stream().map(Country::getName).collect(Collectors.toList());
		
		 List<String> collect = couList.stream().collect(Collectors.mapping(Country::getName, Collectors.toList()));
		
		Map<Country.Continent, List<String>> regionNames = couList.stream ()
				.collect(Collectors.groupingBy (Country ::getRegion, Collectors.mapping(Country::getName, Collectors.toList()))); 
		
	
	Country maxCountry = couList.stream().max((a1,a2) -> {
		    	  
			    	  if(a1.getId()==a2.getId()) {
			    		 return a1.getName().compareTo(a2.getName());
			    	  }
			    	  else{
			    		  return a1.getId().compareTo(a2.getId());
			    	  }
		      }).get();
		
				
	List<Integer> values = Arrays.asList (1, 2, 3); 
	Function<Integer, Integer> func;
	func = a -> a*2;
	values.stream ().map(func).peek(System.out::println).count();
	
	values.stream ().map(n -> n*2)//line n1

	.peek(System.out::print)//line n2

	.count();


	}

}
