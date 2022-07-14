package com.ip.claseabstracte;

import com.ip.interfete.Persoana;

public abstract class PersoanaAbstracta implements Persoana {

    private String nume;
    private String prenume;
    private int varsta;
    private String CNP;
    private String nrTelefon;
    private int masa;
    private int inaltime;

    public PersoanaAbstracta() {//adaugati aici si restul de variabile
        this.nume = "DEF NAME";
        this.prenume = "DEF SURNAME";
        this.varsta = 0;
        this.CNP = "00000000000000";
        this.nrTelefon = "1234567890";
        this.masa = 0;
        this.inaltime = 0;
    }
    public PersoanaAbstracta(String nume,
                             String prenume,
                             int varsta,
                             String CNP,
                             String nrTelefon,
                             int masa,
                             int inaltime){
        this.nume=nume;
        this.prenume=prenume;
        this.varsta=varsta;
        this.CNP=CNP;
        this.nrTelefon=nrTelefon;
        this.masa=masa;
        this.inaltime=inaltime;
    }

    //GETTERS
    @Override
    public String getNume()
    {
        return this.nume;
    }

    //Aceasta metoda suprascrie metoda abstracta din interfata Persoana
    @Override
    public String getPrenume()
    {
        return this.prenume;
    }

    @Override
    public String getCNP()
    {
        return this.CNP;
    }

    @Override
    public String getNrTelefon()
    {
        return this.nrTelefon;
    }

    @Override
    public int getInaltime() {
        return inaltime;
    }

    @Override
    public int getMasa()
    {
        return this.masa;
    }

    //SETTERS
    @Override
    public void setPrenume(String prenume){
        this.prenume=prenume;
    }

    @Override
    public void setNume(String nume)
    {
        this.nume = nume;
    }

    @Override
    public void setCNP(String CNP)
    {
        this.CNP=CNP;
    }

    @Override
    public void setNrTelefon(String nrTelefon)
    {
        this.nrTelefon=nrTelefon;
    }

    @Override
    public void setMasa(int masa)
    {
        this.masa=masa;
    }

    @Override
    public void setInaltime(int inaltime)
    {
        this.inaltime=inaltime;
    }

    @Override
    public void setVarsta(int varsta)
    {
        this.varsta=varsta;
    }
}
