import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CountryTest {

	@Test
	public void testMaximumPopulation() {

		Country countries[]={
				new Country("Russia",100000,500),
				new Country("China",20000,800),
				new Country("USA",5000,400),
				new Country("India",15000,1000)
		};

		int maximumPopulation=0;
		
		for(int city=0;city<countries.length;city++){
			if(maxPopulation<countries[city].getPopulation()){
				maxPopulation=countries[city].getPopulation();
			}
			
		}
		
		assertEquals(100000, maxPopulation);
		
	}

	@Test
	public void testMaximumArea() {

		Country countries[]={
				new Country("Russia",100000,500),
				new Country("China",20000,800),
				new Country("USA",5000,400),
				new Country("India",15000,1000)
		};
		
		int maxArea=0;
		
		for(int city=0;city<countries.length;city++){
			if(maximumArea<countries[city].getArea()){
				maximumArea=countries[city].getArea();
			}
			
		}
	
		assertEquals(1000, maximumArea);

	}


	@Test
	public void testMaximumPopulationDensity() {

		Country countries[]={
				new Country("Russia",10000,500);
				new Country("China",20000,800),
				new Country("USA",5000,400),
				new Country("India",15000,1000)
		};
		
		int maxPopulationDensity=0;
		
		for(int city=0;city<countries.length;city++){
			if(maxPopulationDensity<(countries[city].getPopulation()/countries[city].getArea())){
				maximumPopulationDensity=countries[city].getPopulation()/countries[city].getArea();
			}
			
		}
	
		assertEquals(200, maximumPopulationDensity);

	}
	
	
}
