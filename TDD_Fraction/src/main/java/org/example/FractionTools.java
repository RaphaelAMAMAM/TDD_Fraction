package org.example;

public class FractionTools {

    public String additionFraction(String one, String two) {
        Fraction fractionOne = toOperator(one);
        Fraction fractionTwo = toOperator(two);
        if (differentDenominator(fractionOne, fractionTwo)) {
            getSameDenominator(fractionOne, fractionTwo);
        }
        int addedNominator = addNominator(fractionOne, fractionTwo);
        Fraction fractionAdded = new Fraction(addedNominator, fractionOne.getDenominator());
        Fraction simplifiedAddedFraction = tryToSimplify(fractionAdded);
        return getFinalResult(simplifiedAddedFraction);
    }

    public String soustractionFraction(String one, String two) {
        Fraction fractionOne = toOperator(one);
        Fraction fractionTwo = toOperator(two);
        if (differentDenominator(fractionOne, fractionTwo)) {
            getSameDenominator(fractionOne, fractionTwo);
        }
        int substractNominator = substractNominator(fractionOne, fractionTwo);
        Fraction fractionSubstract = new Fraction(substractNominator, fractionOne.getDenominator());
        Fraction simplifiedSubstractFraction = tryToSimplify(fractionSubstract);
        return getFinalResult(simplifiedSubstractFraction);
    }

    public String multiplicationFraction(String one, String two) {
        Fraction fractionOne = toOperator(one);
        Fraction fractionTwo = toOperator(two);
        return multiplicationFraction(fractionOne, fractionTwo);
    }

    private String multiplicationFraction(Fraction fractionOne, Fraction fractionTwo) {
        int multipliedNominator = fractionOne.getNominator() * fractionTwo.getNominator();
        int multipliedDenominator = fractionOne.getDenominator() * fractionTwo.getDenominator();
        Fraction multipliedFraction = new Fraction(multipliedNominator, multipliedDenominator);
        Fraction simplifiedMultipliedFraction = tryToSimplify(multipliedFraction);
        return getFinalResult(simplifiedMultipliedFraction);
    }

    public String divisionFraction(String one, String two) {
        Fraction fractionOne = toOperator(one);
        Fraction fractionTwo = toOperator(two);
        if (!divisionIsPossible(fractionTwo)) {
            return null;
        }
        Fraction inversedFractionTwo = inverseFraction(fractionTwo);
        return multiplicationFraction(fractionOne, inversedFractionTwo);
    }

    private int getNominator(String operator) {
        return Integer.parseInt(operator.split(";")[0]);
    }

    private int getDenominator(String operator) {
        return Integer.parseInt(operator.split(";")[1]);
    }

    private Fraction toOperator(String operator) {
        return new Fraction(getNominator(operator), getDenominator(operator));
    }

    private boolean divisionIsPossible(Fraction fraction) {
        return fraction.getNominator() != 0;
    }

    private Fraction inverseFraction(Fraction fraction) {
        return new Fraction(fraction.getDenominator(), fraction.getNominator());
    }

    private boolean differentDenominator(Fraction opeOne, Fraction opeTwo) {
        return !(opeOne.getDenominator() == opeTwo.getDenominator());
    }

    private int addNominator(Fraction opeOne, Fraction opeTwo) {
        return opeOne.getNominator() + opeTwo.getNominator();
    }

    private int substractNominator(Fraction fractionOne, Fraction fractionTwo) {
        return fractionOne.getNominator() - fractionTwo.getNominator();
    }

    private void getSameDenominator(Fraction fractionOne, Fraction fractionTwo) {
        fractionOne.setNominator(fractionOne.getNominator() * fractionTwo.getDenominator());
        fractionTwo.setNominator(fractionTwo.getNominator() * fractionOne.getDenominator());
        int temp = fractionOne.getDenominator();
        fractionOne.setDenominator(fractionOne.getDenominator() * fractionTwo.getDenominator());
        fractionTwo.setDenominator(temp * fractionTwo.getDenominator());
    }

    private Fraction tryToSimplify(Fraction fraction) {
        if (nominatorIsBiggerThanDenominator(fraction)) {
            return simplifyWhenNominatorIsBiggerThanDenominator(fraction);
        }
        if (!nominatorIsBiggerThanDenominator(fraction)) {
            return simplifyWhenNominatorIsSmallerThanDenominator(fraction);
        }
        return new Fraction(1, 1);
    }

    private boolean nominatorIsBiggerThanDenominator(Fraction fraction) {
        return fraction.getNominator() > fraction.getDenominator();
    }

    private Fraction simplifyWhenNominatorIsBiggerThanDenominator(Fraction fraction) {
        for (int i = fraction.getNominator(); i > 0; i--) {
            if (fraction.getNominator() % i == 0 && fraction.getDenominator() % i == 0) {
                return new Fraction(fraction.getNominator() / i, fraction.getDenominator() / i);
            }
        }
        return fraction;
    }

    private Fraction simplifyWhenNominatorIsSmallerThanDenominator(Fraction fraction) {
        for (int i = fraction.getDenominator(); i > 0; i--) {
            if (fraction.getNominator() % i == 0 && fraction.getDenominator() % i == 0) {
                return new Fraction(fraction.getNominator() / i, fraction.getDenominator() / i);
            }
        }
        return fraction;
    }

    private String getFinalResult(Fraction fraction) {
        if (fraction.getNominator() == fraction.getDenominator()) return "1";
        if (fraction.getNominator() == 0) return "0";
        if (fraction.getDenominator() == 1) return String.valueOf(fraction.getNominator());
        return fraction.getNominator() + "/" + fraction.getDenominator();
    }
}
