package org.example;

import java.util.Optional;

public class Main {
    public static void main(String[] args){

        System.out.println("The type of the day before " + DaysOfWeek.SATURDAY + " is: " + GetDateType.getDateType(DaysOfWeek.SUNDAY));

        System.out.println("------------");

        PersonRepository personRepository = new PersonRepository();
        personRepository.addPerson(new Person(4, "Sanela", DaysOfWeek.SUNDAY));
        personRepository.addPerson(new Person(8, "Barbara", DaysOfWeek.MONDAY));
        personRepository.addPerson(new Person(12, "Silvia", DaysOfWeek.FRIDAY));

        int search = 5;
        Optional<Person> optionalPerson = personRepository.getPersonByID(search);


    }
}