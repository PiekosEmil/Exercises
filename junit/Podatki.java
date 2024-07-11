package junit;

import java.util.Scanner;

public class Podatki {
    static final int PROG_PODATKOWY = 85_528;
    static final double KWOTA_ZMNIEJSZAJACA_PODATEK = 556.02;
    static final double I_PROG_PODATKOWY = 0.18;
    static final double II_PROG_PODATKOWY = 0.32;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj przychód roczny");
        int przychod = scanner.nextInt();
        double podatek = obliczPodatek(przychod);
        int result = (int) podatek;
        System.out.println("Podatek: " + result + "zł");

    }

    public static double obliczPodatek(int przychod) {
        if (przychod < PROG_PODATKOWY) {
            return obliczPodatekDlaPierwszegoProguPodatkowego(przychod);
        } else {
            return obliczPodatekDlaDrugiegoProguPodatkowego(przychod);
        }
    }

    private static double obliczPodatekDlaPierwszegoProguPodatkowego(int przychod) {
        double podatek = przychod * I_PROG_PODATKOWY - KWOTA_ZMNIEJSZAJACA_PODATEK;
        if (podatek < 0) {
            return 0;
        } else {
            return podatek;
        }
    }

    private static double obliczPodatekDlaDrugiegoProguPodatkowego(int przychod) {
        return ((przychod - 85_528) * II_PROG_PODATKOWY) + (PROG_PODATKOWY * I_PROG_PODATKOWY - KWOTA_ZMNIEJSZAJACA_PODATEK);
    }
}
