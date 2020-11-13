package g1;

public class Country {
	private String CountryName;
	private Integer population;
	
	// Public constructor for the countries
	
	public Country(String name, Integer population) {
		this.setName(name);
		this.setPopulation(population);
	}
	
	public String getName() {
		return CountryName;
	}
	public void setName(String name) {
		this.CountryName = name;
	}
	public Integer getPopulation() {
		return population;
	}
	public void setPopulation(Integer population) {
		this.population = population;
	}
}
