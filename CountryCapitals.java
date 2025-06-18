import java.util.*;

public class CountryCapitals {
    public static void main(String[] args) {
        HashMap<String,String> capitalCities = new HashMap<>();

        capitalCities.put("India","New Delhi");
        capitalCities.put("USA","Washington");
        capitalCities.put("Germany","Berlin");

        System.out.println("HashMap(Unordered):");

        for(String country :capitalCities.keySet()){
            System.out.println(country+"->"+capitalCities.get(country));
        }

        TreeMap<String,String> sortedCapitals = new TreeMap<>(capitalCities);  //passing the list values 

        System.out.println("TreeMap(Sorted by country name): ");

        for(String country : sortedCapitals.keySet()){
            System.out.println(country+"->"+sortedCapitals.get(country));
        }
    }
}
