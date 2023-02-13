package mainPackage;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class qweqwe {

    public static void main(String[] args) {
        List<Planet> planets = Arrays.asList(
                new Planet("Yavin IV", 10200, 1000),
                new Planet("Hoth", 7200, 10000),
                new Planet("Dagobah", 8900, 0),
                new Planet("Endor", 4900, 30000000),
                new Planet("Kamino", 19720, 1000000000));

        List<Planet> diametr = planets.stream().filter(s -> s.getDiameter() < 10000).collect(Collectors.toList());
//        planets.stream().mapToInt(s -> Integer.parseInt(s.getPopulation())).sum();
    }
}

class Planet {
    private String name;
    private int diameter;
    private int population;

    public Planet(String name, int diameter, int population) {
        this.name = name;
        this.diameter = diameter;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public int getDiameter() {
        return diameter;
    }

    public int getPopulation() {
        return population;
    }
}
