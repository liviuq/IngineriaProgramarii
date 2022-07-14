package com.ip.interfete;

public interface Persoana
{
    //GETTERS
    String getPrenume();
    String getNume();
    String getCNP();
    String getNrTelefon();
    int getMasa();
    int getInaltime();

    //SETTERS
    void setPrenume(String prenume);
    void setNume(String nume);
    void setCNP(String CNP);
    void setNrTelefon(String nrTelefon);
    void setMasa(int masa);
    void setInaltime(int inaltime);
    void setVarsta(int varsta);

    //This is the method that we will override in Student and Profesor
    default String getJob(){ return "Basic job";}
}
