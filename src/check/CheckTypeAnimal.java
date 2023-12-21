package check;

import data.AnimalTypeData;

import java.util.Locale;
import java.util.Scanner;

public class CheckTypeAnimal {

    public static String checkStrTypeAnimal(Scanner scanner, String message) {
        while (true) {
            System.out.println(message);
            String animalStr = scanner.next().trim().toUpperCase(Locale.ROOT);
            for (AnimalTypeData animalTypeData : AnimalTypeData.values()) {
                if (animalTypeData.name().equals(animalStr)) {
                    return animalStr;
                }
            }
                System.out.println(String.format("Введенный тип животного %s не поддерживается", animalStr));

        }
    }

}
