package com.ip.clase;

public class Curs
{
    //Private members
    private String titlu;
    private int credite;
    private int anStudiu;
    private String profesorTitular;

    //Constructor
    public Curs(String titlu,
                int credite,
                int anStudiu,
                String profesorTitular)
    {
        this.titlu = titlu;
        this.credite = credite;
        this.anStudiu = anStudiu;
        this.profesorTitular = profesorTitular;
    }

    //GETTERS

    public String getTitlu()
    {
        return this.titlu;
    }

    public int getCredite()
    {
        return this.credite;
    }

    public int getAnStudiu()
    {
        return this.anStudiu;
    }

    public String getProfesorTitular()
    {
        return this.profesorTitular;
    }

    //SETTERS

    public void setTitlu(String titlu)
    {
        this.titlu = titlu;
    }

    public void setCredite(int credite)
    {
        this.credite = credite;
    }

    public void setAnStudiu(int anStudiu)
    {
        this.anStudiu = anStudiu;
    }

    public void setProfesorTitular(String profesorTitular)
    {
        this.profesorTitular = profesorTitular;
    }
}
