package com.sraynitjsr._18_java_new_stuff;

record Person(String name, int age) {}

public class MyNewFeaturesInJava {
    public static void start() {
        System.out.println("\nInside Java Latest Features Module");
        Person person1 = new Person("Master Bluster", 48);
        Person person2 = new Person("King Kohli", 34);

        System.out.println("Person 1: " + person1);
        System.out.println("Person 2: " + person2);

        if (person1.name().length() > person2.name().length()) {
            System.out.println("Person 1 has a longer name.");
        } else if (person1.name().length() < person2.name().length()) {
            System.out.println("Person 2 has a longer name.");
        } else {
            System.out.println("Both persons have the same length name.");
        }

        Person person3 = new Person("Rahul", 25);
        System.out.println("Is Person 1 equal to Person 3? " + person1.equals(person3));

        Person person4 = new Person("CR7", 26);
        System.out.println("Is Person 1 equal to Person 4? " + person1.equals(person4));

        System.out.println("Person 1 HashCode: " + person1.hashCode());
        System.out.println("Person 2 HashCode: " + person2.hashCode());

        var name = person1.name();
        var age = person1.age();
        System.out.println("Person 1 - Name: " + name + ", Age: " + age);
    }
}
