package check;

import data.AnimalColorData;

import java.util.Locale;
import java.util.Scanner;

public class CheckColor {

    public static String checkStrColor(Scanner scanner, String message){
        while (true) {
            System.out.println(message);
            String colorStr = scanner.next().trim().toUpperCase(Locale.ROOT);
            for (AnimalColorData animalColorData : AnimalColorData.values()) {
                if (animalColorData.name().equals(colorStr)) {
                    return colorStr;
                }
            }
            System.out.println(String.format("Введенный цвет %s не поддерживается", colorStr));
        }
    }

}
