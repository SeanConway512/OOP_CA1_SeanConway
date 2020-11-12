import java.util.Arrays;

public class Country {

    public String name,capital,currency,language;
    private int population,area;
    private City[] cities;

    public Country(String name,String capital,int population,int area,City[] cities,String currency,String language)
    {
      setName(name);
      setCapital(capital);
      setPopulation(population);
      setArea(area);
      setCities(cities);
      setCurrency(currency);
      setLanguage(language);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void setCities(City[] cities) {
        this.cities = cities;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public int getPopulation() {
        return population;
    }

    public int getArea() {
        return area;
    }

    public City[] getCities() {
        return cities;
    }

    public String getCurrency() {
        return currency;
    }

    public String getLanguage() {
        return language;
    }
    public void getMostPopulousCity(){
        return;
    }


    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                ", currency='" + currency + '\'' +
                ", language='" + language + '\'' +
                ", population=" + population +
                ", area=" + area +
                ", cities=" + Arrays.toString(cities) +
                '}';
    }
    public void sortCitiesByName(){
        return;
    }
}
