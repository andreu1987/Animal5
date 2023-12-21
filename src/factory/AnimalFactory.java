package factory;

import animal.Animal;
import animal.cat.Cat;
import animal.dog.Dog;
import animal.duck.Duck;
import data.AnimalTypeData;

public class AnimalFactory {
    public Animal create(AnimalTypeData animalTypeData) {

        switch (animalTypeData) {
            case CAT: {
                return new Cat();
            }
            case DOG: {
                return new Dog();
            }
            default:{
                return new Duck();

            }
        }

    }

}
