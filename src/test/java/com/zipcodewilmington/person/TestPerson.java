package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetFavFood(){
        Person person = new Person();
        String expected = "pizza";

        // When
        person.setFavFood(expected);
        String actual = person.getFavFood();

        // Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testHasPet(){
        Person person = new Person();
        boolean expected = true;

        // When
        person.setHasPet(expected);
        boolean actual = person.getHasPet();

        // Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testAmountOfJobs() {
        // Given
        Person person = new Person();
        Integer expected = 2;

        // When
        person.setAmountOfJobs(expected);

        // Then
        Integer actual = person.getAmountOfJobs();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testAmountOfVehicles() {
        // Given
        Person person = new Person();
        Integer expected = 3;

        // When
        person.setAmountOfVehicles(expected);

        // Then
        Integer actual = person.getAmountOfVehicles();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testHobbie(){
        Person person = new Person();
        String expected = "hiking";

        // When
        person.setHobbie(expected);
        String actual = person.getHobbie();

        // Then
        Assert.assertEquals(expected, actual);
    }

}
