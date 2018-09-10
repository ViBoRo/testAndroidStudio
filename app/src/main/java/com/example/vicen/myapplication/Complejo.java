package com.example.vicen.myapplication;

public class Complejo {
    private double real, imaginario;

    public Complejo(double r, double i) {
        this.real = r;
        this.imaginario = i;
    }
    public void suma(Complejo a, Complejo b){

        this.real = a.real+ b.real;
        this.imaginario= a.imaginario + b.imaginario;
    }

    public String toString(){
        return real + "," + imaginario;
    }
}
