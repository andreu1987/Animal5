import animal.Animal;
import animal.duck.IFlying;
import check.CheckColor;
import check.CheckNumber;
import check.CheckTeam;
import check.CheckTypeAnimal;
import data.AnimalTypeData;
import data.CommandsData;
import factory.AnimalFactory;

import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        List<Animal> animals = new LinkedList<>();
        AnimalFactory animalfactory = new AnimalFactory();

        while (true) {
            // ------------------------ Ввод одной из команд и проверка
            String commandStr = CheckTeam.checkStrTeam(scanner, "Введите одну из команд add/list/exit");
            CommandsData commandsData = CommandsData.valueOf(commandStr);

            switch (commandsData) {
                case ADD: {

                    while (true) {
                        // ------------------------ Ввод типа животного и проверка
                        String inputAnimalType = "Введите одно из животных (CAT(кошка)/ DOG(собака)/ DUCK(утка)";
                        String animalStr = CheckTypeAnimal.checkStrTypeAnimal(scanner, inputAnimalType);
                        Animal animal = animalfactory.create(AnimalTypeData.valueOf(animalStr));

                        // ------------------------ Ввод имени животного
                        System.out.println("Ввидите имя животного");
                        animal.setName(scanner.next());

                        // ------------------------ Ввод цвета животного и проверка
                        String inputColorType = "Введите цвет животного (WHITE,GRAY,BLACK)";
                        String colorStr = CheckColor.checkStrColor(scanner, inputColorType);
                        animal.setColor(colorStr);

                        // ------------------------ Ввод возраста животного и проверка
                        String inputAgeType = "Введите возраст животного (от 0 до 21)";
                        Integer age = CheckNumber.checkIntString(scanner, inputAgeType);
                        animal.setAge(age);

                        // ------------------------ Ввод вес животного и проверка
                        String inputWeightType = "Введите вес животного (от 0 до 21)";
                        Integer weight = CheckNumber.checkIntString(scanner, inputWeightType);
                        animal.setWeight(weight);

                        animals.add(animal);

                        break;
                    }
                    break;

                }
                case LIST: {
                    for (Animal animal : animals) {
                        System.out.println(animal.toString());
                        animal.say();
                        if (animal instanceof IFlying flying) {
                            flying.fly();
                        }
                    }
                    break;

                }

                case EXIT: {
                    System.exit(0); //выход из программы (0 статус = успешное завершение работы)

                }

            }
        }

    }
}
