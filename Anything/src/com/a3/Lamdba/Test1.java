package com.a3.Lamdba;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: liuyaosen
 * @Date: 2019/1/7 21:47
 */
public class Test1 {
    public static void main(String[] args) {
       /* String[] atp = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka",
                "David Ferrer","Roger Federer",
                "Andy Murray","Tomas Berdych",
                "Juan Martin Del Potro"};
        List<String> stringList = Arrays.asList(atp);
        stringList.forEach((n)-> System.out.println(n));
        stringList.forEach(System.out::println);*/
//        Runnable runnable = () -> System.out.println("hello lamdba");
//        new Thread(runnable).start();

        List<Person> javaProgrammers = new ArrayList<Person>() {
            {
                add(new Person("Elsdon", "Jaycob", "Java programmer", "male", 43, 2000));
                add(new Person("Tamsen", "Brittany", "Java programmer", "female", 23, 1500));
                add(new Person("Floyd", "Donny", "Java programmer", "male", 33, 1800));
                add(new Person("Sindy", "Jonie", "Java programmer", "female", 32, 1600));
                add(new Person("Vere", "Hervey", "Java programmer", "male", 22, 1200));
                add(new Person("Maude", "Jaimie", "Java programmer", "female", 27, 1900));
                add(new Person("Shawn", "Randall", "Java programmer", "male", 30, 2300));
                add(new Person("Jayden", "Corrina", "Java programmer", "female", 35, 1700));
                add(new Person("Palmer", "Dene", "Java programmer", "male", 33, 2000));
                add(new Person("Addison", "Pam", "Java programmer", "female", 34, 1300));
            }
        };

//        javaProgrammers.forEach((i)-> System.out.printf("firstname:%s,lastname:%s%n",i.getFirstName(),i.getLastName()));
//        javaProgrammers.forEach((i)-> System.out.printf("name:%s's salary is %s%n",i.getFirstName()+" "+i.getLastName(),i.getSalary()*1.05));
        Person person1 = javaProgrammers.stream()
                .filter(person -> person.getSalary() > 1900)
                .min((p1, p2) -> p1.getSalary() - p2.getSalary()).get();
//                .forEach((i)-> System.out.println(i.getFirstName()+" "+i.getLastName()));
        System.out.println(person1);

    }
}
