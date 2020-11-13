package g1;

public class Continent {
	private String ContinentName;
	private Country[] Countries;
	
	// Public constructor for the Continents
	
	public Continent(String name) {
		this.setContinentName(name);
		this.Countries = new Country[10];
	}
	
	// This method add countries to the array
	
	public void addCountry(Country country) {
		for (int x = 0; x < Countries.length; x++) {
			if(Countries[x] == null) {
				Countries[x] = country;
				break;
			}
		}
	}
	
	// This method get the total population of each continent
	
	public void SumPopulation() {
		Integer sum = 0;
		
		for (int x = 0; x < Countries.length; x++) {
			if(Countries[x] != null) {
				sum += Countries[x].getPopulation();
			}
		}
		
		System.out.println("A população total do continente, " + this.getContinentName() + " é de: " + sum + "hab.");
	}
	
	// This method returns the country with less population
	
	public void lessPopulation() {
		Integer less = Countries[0].getPopulation();
		
		for (int x = 0; x < Countries.length; x++) {
			if(Countries[x] != null) {
				if(Countries[x].getPopulation() < less) {
					less = Countries[x].getPopulation();
				}
			}
		}
		
		for (int x = 0; x < Countries.length; x++) {
			if(Countries[x].getPopulation() == less) {
				System.out.println("O País: " + Countries[x].getName() + ", é o que possui a menor população, com " + Countries[x].getPopulation() + " hab.");
				break;
			}
		}
	}
	
	public String getContinentName() {
		return ContinentName;
	}
	public void setContinentName(String continentName) {
		ContinentName = continentName;
	}
	public Country[] getCountry() {
		return Countries;
	}
	public void setCountry(Country[] country) {
		Countries = country;
	}
}
