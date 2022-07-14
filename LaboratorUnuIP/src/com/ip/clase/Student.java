package com.ip.clase;

import com.ip.claseabstracte.PersoanaAbstracta;
import java.util.ArrayList;

public class Student extends PersoanaAbstracta
{
    //Private members
    private String numarMatricol;
    private int anStudiu;
    private ArrayList<String> cursuriInscris;

    //Constructor
    public Student(String nume,
                   String prenume,
                   int varsta,
                   String CNP,
                   String nrTelefon,
                   int masa,
                   int inaltime,
                   String numarMatricol,
                   int anStudiu)
    {
        super(nume, prenume, varsta, CNP, nrTelefon, masa, inaltime);
        this.numarMatricol = numarMatricol;
        this.anStudiu = anStudiu;
        cursuriInscris = new ArrayList<String>();
    }

    //GETTERS
    public String getNumarMatricol()
    {
        return this.numarMatricol;
    }

    public int getAnStudiu()
    {
        return this.anStudiu;
    }

    public ArrayList<String> getCursuriInscris()
    {
        return this.cursuriInscris;
    }

    //setter
    public void setNumarMatricol(String nrMatricol)
    {
        this.numarMatricol=nrMatricol;
    }

    public void setAnStudiu(int anStudiu)
    {
        this.anStudiu=anStudiu;

    }

    void addCourse(String course)
    {
        cursuriInscris.add(course);
    }

    void removeCourse(String course)
    {
        cursuriInscris.remove(course);
    }

    //Overloading the bursa method
    public void bursa(int valoare)
    {
        System.out.println("Eu am primit bursa ce valoareaza " + valoare + "RON");
    }

    public void bursa(int valoare, String informatie)
    {
        System.out.println("Aceasta este a doua metoda cu acelasi nume, dar este overloaded. Valoare = " + valoare + " Informatie = " + informatie);
    }

    //Aici facem override la o metoda default din clasa abstracta Persoana
    //Run-time polymorphism
    @Override
    public String getJob()
    {
        return  "Student";
    }
}
