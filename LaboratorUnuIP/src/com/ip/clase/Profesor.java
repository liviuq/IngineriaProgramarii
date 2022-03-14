package com.ip.clase;

import com.ip.claseabstracte.PersoanaAbstracta;

import java.util.ArrayList;

public class Profesor extends PersoanaAbstracta
{
    //Private members
    private int numarAngajat;
    private int salariu;
    private ArrayList<String> cursuriSustinute;

    //Constructor
    public Profesor(String nume,
                    String prenume,
                    int varsta,
                    String CNP,
                    String nrTelefon,
                    int masa,
                    int inaltime,
                    int numarAngajat,
                    int salariu)
    {
        super(nume, prenume, varsta, CNP, nrTelefon, masa, inaltime);
        this.numarAngajat = numarAngajat;
        this.salariu = salariu;
        cursuriSustinute = new ArrayList<String>();
    }

    //GETTERS
    public int getNumarAngajat()
    {
        return this.numarAngajat;
    }

    public int getSalariu()
    {
        return this.salariu;
    }

    public ArrayList<String> getCursuriSustinute()
    {
        return cursuriSustinute;
    }

    //SETTERS
    public void setNumarAngajat(int numarAngajat)
    {
        this.numarAngajat = numarAngajat;
    }

    public void setSalariu(int salariu)
    {
        this.salariu = salariu;
    }

    public void addCurs(String curs)
    {
        cursuriSustinute.add(curs);
    }

    public void removeCurs(String curs)
    {
        cursuriSustinute.remove(curs);
    }

    //Overridden method
    @Override
    public String getJob()
    {
        return  "Profesor";
    }
}
