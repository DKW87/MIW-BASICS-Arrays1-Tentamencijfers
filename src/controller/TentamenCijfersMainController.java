package controller;

import java.util.Scanner;

/* Dit is een applicatie om docenten te helpen met het analyseren van tentamenresultaten.
 * De applicatie vraagt allereerst om het aantal cijfers dat de docent wil invoeren.
 * Hierna voert de docent de cijfers in. Vervolgens toont het programma het aantal cijfers,
 * het gemiddelde cijfer, het aantal voldoendes en het hoogste cijfer.
 * Mvg,
 * Danny Kwant */
public class TentamenCijfersMainController {

    // public methods
    public static double krijgGemiddelde(double[] mpArray) {
        double mpSomGemiddeldeCijfer = 0;

        for (int i = 0; i < mpArray.length; i++) {
            mpSomGemiddeldeCijfer = mpSomGemiddeldeCijfer + mpArray[i];
        }
        return mpSomGemiddeldeCijfer / mpArray.length;
    }

    public static int krijgAantalVoldoendes(double[] mpArray) {
        int mpAantalVoldoendes = 0;
        final double mpVoldoende = 5.5;

        for (int i = 0; i < mpArray.length; i++) {
            if (mpArray[i] >= mpVoldoende) {
                mpAantalVoldoendes++;
            }
        }
        return mpAantalVoldoendes;
    }

    public static double krijgHoogsteCijfer(double[] mpArray) {
        double hoogsteCijfer = 0;
        for (int i = 0; i < mpArray.length; i++) {
            if (mpArray[i] > hoogsteCijfer) {
                hoogsteCijfer = mpArray[i];
            }
        }
        return hoogsteCijfer;
    }

    public static void main(String[] args) {

        // variabelen
        int aantalCijfers;
        int aantalVoldoendes;
        double gemiddeldeCijfer;
        double hoogsteCijfer;


        // scanner
        Scanner userInput = new Scanner(System.in);

        do {

            System.out.print("Hoeveel cijfers wil je invoeren? ");
            aantalCijfers = userInput.nextInt();
            if (aantalCijfers == 0) {
                System.out.println("Aantal cijfers moet groter zijn dan 0!");
            }

        } while (aantalCijfers == 0);

        double[] arrayStudentCijfer = new double[aantalCijfers];

        for (int i = 0; i < arrayStudentCijfer.length; i++) {

            System.out.printf("Cijfer student %2d: ", i + 1);
            arrayStudentCijfer[i] = userInput.nextDouble();

        }

        // Gemiddelde cijfer van array berekenen dmv method
        gemiddeldeCijfer = krijgGemiddelde(arrayStudentCijfer);

        // Aantal voldoendes in array berekenen dmv method
        aantalVoldoendes = krijgAantalVoldoendes(arrayStudentCijfer);

        // hoogste cijfer van array ophalen dmv method
        hoogsteCijfer = krijgHoogsteCijfer(arrayStudentCijfer);

        System.out.printf("Aantal cijfers   : %d%n", aantalCijfers);
        System.out.printf("Gemiddelde cijfer: %.1f%n", gemiddeldeCijfer);
        System.out.printf("Aantal voldoendes: %d%n", aantalVoldoendes);
        System.out.printf("Hoogste cijfer   : %.1f%n", hoogsteCijfer);

    }

}
