package org.example;

import org.example.service.Dog;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog("Шарик", 993);
        dogs[1] = new Dog("Тобик", 52);
        dogs[2] = new Dog("Булочка", 10);

        int min = dogs[0].getAge();
        int n = 0;
        for (int i = 0; i < dogs.length; i++) {
            if (min > dogs[i].getAge()) {
                min = dogs[i].getAge();
                n = i;
            }
        }
        System.out.println("Самая молодая собака: " + dogs[n].getName() + " возраст = " + min);

        Dog oldDog = dogs[0];
        for (Dog dog : dogs) {
            if (oldDog.getAge() < dog.getAge()) {
                oldDog = dog;
            }
        }
        System.out.println("Самая старая собака: " + oldDog.getName() + " возраст = " + oldDog.getAge());

    }
}