package com.ip;

import com.ip.clase.Student;
import com.ip.clase.Profesor;
import com.ip.clase.Curs;
import com.ip.interfete.Persoana;

public class Main {

    public static void main(String[] args)
    {
        //Creating a course
        Curs IngProgr = new Curs(
                "Ingineria Programarii",
                6,
                2,
                "Adrian Iftene");

        //Creating 3 students
        Student student1 = new Student(
                "Ormond",
                "Beli",
                21,
                "1111111111111",
                "0772728956",
                72, 165,
                "RSL11111111",
                2);
        Student student2 = new Student(
                "Jehohanan",
                "Emanuel",
                25,
                "2222222222222",
                "0772109461",
                80, 178,
                "RSL22222222",
                3);
        Student student3 = new Student(
                "Tariro",
                "Avanti",
                21,
                "3333333333333",
                "0772744906",
                100, 199,
                "RSL33333333",
                1);

        //Printing the course info
        System.out.println("Cursul este " + IngProgr.getTitlu() +" si are ca titular pe "+ IngProgr.getProfesorTitular());

        //Demonstrate polymorphism

        //creating a student
        Persoana pers1 = new Student(
                "Cassiopea",
                "Duff",
                25,
                "444444444444",
                "0772009871",
                70, 180,
                "RSL44444444",
                3);
        System.out.println(pers1.getJob()); //prints out "student"

        //creating a professor
        Persoana pers2 = new Profesor(
                "Miriana",
                "Asmaa",
                32,
                "555555555555",
                "0742856110",
                76,
                188,
                100,
                4600);
        System.out.println(pers2.getJob()); //prints out "profesor"
    }
}
