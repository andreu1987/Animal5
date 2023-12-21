package animal.duck;

import animal.Animal;

public class Duck extends Animal implements IFlying {

    public void say(){
        System.out.println("Кря");

    }
    public void fly() {
        System.out.println("Я лечу");
    }
}