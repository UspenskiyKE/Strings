package com.company;

public class Main {

    public static <Char> void main(String[] args) {
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
        System.out.println();

        //Задачи повышенной сложности
        System.out.println("Задачи повышенной сложности");
        System.out.println();

        //Задача 5
        System.out.println("Задача 5");
        String fullName2="Ivanov Ivan Ivanovich";
        int pos1=fullName2.indexOf(" ");
        int i=0;
        String lastName2=fullName2.substring(0,pos1);
        i=pos1+1;
        int pos2=fullName2.indexOf(" ",i);
        String firstName2=fullName2.substring(i,pos2);
        i=pos2+1;
        String middleName2=fullName2.substring(i,fullName2.length());
        System.out.println("Имя сотрудника - "+firstName2);
        System.out.println("Фамилия сотрудника - "+lastName2);
        System.out.println("Отчество сотрудника - "+middleName2);
        System.out.println();

        //Задача 6
        System.out.println("Задача 6");
        String fullName3="ivanov ivan ivanovich";
        char[] fullName3Array=fullName3.toCharArray();
        int pos11=0;
        int pos22=fullName3.indexOf(" ")+1;
        int pos33=fullName3.indexOf(" ", pos22)+1;
        char symbol1=fullName3Array[0];
        char symbol2=fullName3Array[pos22];
        char symbol3=fullName3Array[pos33];
        fullName3Array[0]=Character.toUpperCase(symbol1);
        fullName3Array[pos22]=Character.toUpperCase(symbol2);
        fullName3Array[pos33]=Character.toUpperCase(symbol3);
        String correctFullName3=new String(fullName3Array);
        System.out.println("Верное написание Ф. И. О. сотрудника с заглавных букв — "+correctFullName3);
        System.out.println();

        //Задача 7
        System.out.println("Задача 7");
        int i2=0;
        String stroka1="135";
        String stroka2="246";
        StringBuilder sb=new StringBuilder("");
        for (i2 = 0; i2 <stroka1.length() ; i2++) {
            sb.append(stroka1.substring(i2,i2+1)+stroka2.substring(i2,i2+1));
        }
        System.out.println("Данные строки — "+sb.toString());
        System.out.println();

        //Задача 8
        System.out.println("Задача 8");
        String str1="aabccddefgghiijjkk";
        String str1Print="";
        for (int i1 = 0; i1 < str1.length()-1; i1++) {
            if (str1.charAt(i1)==str1.charAt(i1+1)) {
                str1Print+=str1.substring(i1,i1+1);
            }
        }
        System.out.println(str1Print);

    }
}
