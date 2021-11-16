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
        expected.add(new Address("Moscow", "Lenin street", 453, 5));
        expected.add(new Address("Krasnoyarsk", "53 Octiabria", 6, 2));
        assertEquals(expected, rsl);
    }
}