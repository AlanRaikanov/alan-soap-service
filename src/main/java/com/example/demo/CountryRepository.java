package com.example.demo;

import alan.Country;
import alan.Currency;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CountryRepository {

    private static final Map<String, Country> countries = new HashMap<>();

    @PostConstruct
    public void initData() {
        Country kazakhstan = new Country();
        kazakhstan.setName("Kazakhstan");
        kazakhstan.setPopulation(18500000);
        kazakhstan.setCapital("Nur-Sultan");
        kazakhstan.setCurrency(Currency.KZT);
        countries.put(kazakhstan.getName(), kazakhstan);

        Country britain = new Country();
        britain.setName("Britain");
        britain.setPopulation(67886011);
        britain.setCapital("London");
        britain.setCurrency(Currency.GBP);
        countries.put(britain.getName(), britain);

        Country germany = new Country();
        germany.setName("Germany");
        germany.setPopulation(83019200);
        germany.setCapital("Berlin");
        germany.setCurrency(Currency.EUR);
        countries.put(germany.getName(), germany);
    }

    public Country findCountry(String name) {
        return countries.get(name);
    }
}
