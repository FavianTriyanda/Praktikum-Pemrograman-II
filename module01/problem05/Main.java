package module01.problem05;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double phi = 3.14;

        System.out.print("Masukkan jari-jari: ");
        double radius = input.nextDouble();

        System.out.print("Masukkan tinggi: ");
        double height = input.nextDouble();

        double volume = phi * (radius * radius) * height;

        System.out.print("Volume tabung dengan jari jari " + radius + " cm dan tinggi " + height + " cm adalah ");
        System.out.printf("%.3f", volume);
        System.out.print(" m3");
    }
}