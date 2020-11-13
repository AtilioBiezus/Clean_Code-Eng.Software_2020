package g1;

public class MainG1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Testing the methods and constructors of the two classes
		
		
		// Adding the data by the constructor methods
		
		Continent continent1 = new Continent("America");		
		Country country1 = new Country("Brazil", 200000);
		Country country2 = new Country("Argentina", 70000);
		Country country3 = new Country("Chile", 100000);
		Country country4 = new Country("Uruguay", 55403);
		Country country5 = new Country("Colombia", 20000);
		
		// Adding the countries in the Array
		
		continent1.addCountry(country1);
		continent1.addCountry(country2);
		continent1.addCountry(country3);
		continent1.addCountry(country4);
		continent1.addCountry(country5);
		
		// Getting the total population of each continent
		
		continent1.SumPopulation();
		
		// Getting the country with the less population
		
		continent1.lessPopulation();
	}

}
