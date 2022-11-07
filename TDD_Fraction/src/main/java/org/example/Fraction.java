package org.example;

public class Fraction {

    private int nominator;
    private int denominator;

    public Fraction(int nominator, int denominator) {
        this.nominator = nominator;
        this.denominator = denominator;
    }

    public int getNominator() {
        return nominator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNominator(int nominator) {
        this.nominator = nominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

}
