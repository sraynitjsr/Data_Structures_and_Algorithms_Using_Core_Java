package com.sraynitjsr._18_java_new_stuff;

record Person(String name, int age) {}

public class MyNewFeaturesInJava {
    public static void start() {
        System.out.println("\nInside Java Latest Features Module");
        Person person1 = new Person("A", 25);
        Person person2 = new Person("B", 30);

        System.out.println(person1);
        System.out.println(person2);

        Person person3 = new Person("A", 25);
        System.out.println(person1.equals(person3));

        Person person4 = new Person("B", 26);
        System.out.println(person1.equals(person4));

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());

        var name = person1.name();
        var age = person1.age();
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
