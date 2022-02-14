package com.company;

public class Main {

    public static void main(String[] args) {
	// Задача 1
        System.out.println("Задача 1");
        String firstName="Ivan";
        String middleName="Ivanovich";
        String lastName="Ivanov";
        String fullName=lastName+" "+firstName+" "+middleName;
        System.out.println("ФИО сотрудника — "+fullName);
        System.out.println();

        // Задача 2
        System.out.println("Задача 2");
        String fullNameUpper=fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — "+fullNameUpper);
        System.out.println();

        // Задача 3
        System.out.println("Задача 3");
        String fullNameForAdministration = fullName.replace(" ", "; ");
        System.out.println("Данные ФИО сотрудника для административного отдела — "+fullNameForAdministration);
        System.out.println();

        // Задача 4
        System.out.println("Задача 4");
        fullName="Иванов Семён Семёнович";
        String correctedFullName = fullName.replace("ё", "e");
        System.out.println("Данные ФИО сотрудника — "+correctedFullName);


    }
}
