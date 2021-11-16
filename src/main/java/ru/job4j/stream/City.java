package ru.job4j.stream;

import java.time.Year;

public class City {
    private String name;
    private String country;
    private String region;
    private Year year;
    private Integer area;
    private Integer population;
    private boolean closed;

    static class Builder {
        private String name;
        private String country;
        private String region;
        private Year year;
        private Integer area;
        private Integer population;
        private boolean closed;

        Builder buildName(String name) {
            this.name = name;
            return this;
        }

        Builder buildCountry(String country) {
            this.country = country;
            return this;
        }

        Builder buildRegion(String region) {
            this.region = region;
            return this;
        }

        Builder buildYear(Year year) {
            this.year = year;
            return this;
        }

        Builder buildArea(Integer area) {
            this.area = area;
            return this;
        }

        Builder buildPopulation(Integer population) {
            this.population = population;
            return this;
        }

        Builder buildClosed(Boolean closed) {
            this.closed = closed;
            return this;
        }

        City build() {
            City city = new City();
            city.name = name;
            city.country = country;
            city.region = region;
            city.year = year;
            city.area = area;
            city.population = population;
            city.closed = closed;
            return city;
        }
    }

    @Override
    public String toString() {
        return "City{"
                + "name='" + name + '\''
                + ", country='" + country + '\''
                + ", region='" + region + '\''
                + ", year=" + year
                + ", area=" + area
                + ", population=" + population
                + ", closed=" + closed
                + '}';
    }

    public static void main(String[] args) {
        City city = new Builder().buildName("Snezhinsk")
                .buildCountry("Russia")
                .buildRegion("Chelyabinsk")
                .buildYear(Year.of(1955))
                .buildArea(299130)
                .buildPopulation(51843)
                .buildClosed(true)
                .build();
        System.out.println(city);
    }
}
