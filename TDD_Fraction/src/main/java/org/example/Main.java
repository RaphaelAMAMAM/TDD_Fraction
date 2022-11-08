package org.example;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static FractionTools tool = new FractionTools();

    public static void main(String[] args) {

        while (true) {
            displayMenu();
            String action = askForAction();
            if (userWantToQuit(action)) break;
            displayAction(action);
            String fractionOne = askForFraction();
            String fractionTwo = askForFraction();
            String result = makeOperation(action, fractionOne, fractionTwo);
            System.out.println(result);
            System.out.println("Souhaitez-vous continuer? o = oui, toute autre touche terminera le programme");
            if (userWantToQuit(scanner.nextLine().toLowerCase())) break;
        }
    }

    static void displayMenu() {
        System.out.print("""
                Menu :
                -additionner des fractions (1)
                -soustraire des fractions (2)
                -multiplier des fractions (3)
                -diviser des fractions (4)
                Toute autre touche mettra fin au programme.
                                    
                Que souhaitez-vous faire? :\040""");
    }

    static String askForAction() {
        return scanner.nextLine();
    }

    static boolean userWantToQuit(String action) {
        return (!action.equals("1") && !action.equals("2") && !action.equals("3") && !action.equals("4") && !action.equals("o"));
    }

    static void displayAction(String action) {
        switch (action) {
            case "1" -> System.out.println("Entrez les deux fractions x;y à additionner");
            case "2" -> System.out.println("Entrez les deux fractions x;y à soustraire");
            case "3" -> System.out.println("Entrez les deux fractions x;y à multiplier");
            case "4" -> System.out.println("Entrez les deux fractions x;y à diviser");
        }
    }

    static String makeOperation(String action, String fractionOne, String fractionTwo) {
        String result = "";
        switch (action) {
            case "1" -> result = tool.additionFraction(fractionOne, fractionTwo);
            case "2" -> result = tool.soustractionFraction(fractionOne, fractionTwo);
            case "3" -> result = tool.multiplicationFraction(fractionOne, fractionTwo);
            case "4" -> result = tool.divisionFraction(fractionOne, fractionTwo);
        }
        if (result == null) return "Erreur : calcul impossible. Résultat " + null;
        return result;
    }

    static String askForFraction() {
        System.out.print("Entrez une fraction :");
        while (true) {
            String fraction = scanner.nextLine();
            if (fractionIsWrong(fraction)) {
                System.out.print("""
                        Your fraction is wrong. Please check if
                        -You used x;y format
                        -Denominator is not equal to 0
                                        
                        Please enter new fraction :\040""");
                continue;
            }
            return fraction;
        }
    }

    static boolean fractionIsWrong(String fraction) {
        return !fraction.matches("^-?[0-9]+;-?[1-9][0-9]?+$");
    }
}
