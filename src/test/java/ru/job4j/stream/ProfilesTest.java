package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ProfilesTest {

    @Test
    public void collect() {
        Address address1 = new Address("Kemerovo", "Moskovsky prospect", 45, 1);
        Address address2 = new Address("Moscow", "Lenin street", 453, 5);
        Address address3 = new Address("Krasnoyarsk", "53 Octiabria", 6, 2);
        Profile profile1 = new Profile(address1);
        Profile profile2 = new Profile(address2);
        Profile profile3 = new Profile(address3);
        List<Profile> profileList = new ArrayList<>(Arrays.asList(profile1, profile2, profile3));
        Profiles profiles = new Profiles();
        List<Address> rsl = profiles.collect(profileList);
        List<Address> expected = new ArrayList<>();
        expected.add(new Address("Kemerovo", "Moskovsky prospect", 45, 1));
        expected.add(new Address("Krasnoyarsk", "53 Octiabria", 6, 2));
        expected.add(new Address("Moscow", "Lenin street", 453, 5));
        assertEquals(expected, rsl);
    }

    @Test
    public void collectDistinct() {
        Address address1 = new Address("Kemerovo", "Moskovsky prospect", 45, 1);
        Address address2 = new Address("Moscow", "Lenin street", 453, 5);
        Address address3 = new Address("Krasnoyarsk", "53 Octiabria", 6, 2);
        Address address4 = new Address("Krasnoyarsk", "53 Octiabria", 6, 2);
        Address address5 = new Address("Krasnoyarsk", "53 Octiabria", 6, 2);
        Address address6 = new Address("Moscow", "Lenin street", 453, 5);
        Profile profile1 = new Profile(address1);
        Profile profile2 = new Profile(address2);
        Profile profile3 = new Profile(address3);
        Profile profile4 = new Profile(address4);
        Profile profile5 = new Profile(address5);
        Profile profile6 = new Profile(address6);
        List<Profile> profileList = new ArrayList<>(
                Arrays.asList(profile1, profile2, profile3, profile4, profile5, profile6)
        );
        Profiles profiles = new Profiles();
        List<Address> rsl = profiles.collect(profileList);
        List<Address> expected = new ArrayList<>();
        expected.add(new Address("Kemerovo", "Moskovsky prospect", 45, 1));
        expected.add(new Address("Krasnoyarsk", "53 Octiabria", 6, 2));
        expected.add(new Address("Moscow", "Lenin street", 453, 5));
        assertEquals(expected, rsl);
    }
}