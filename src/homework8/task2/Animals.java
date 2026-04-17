package homework8.task2;

import java.util.Deque;
import java.util.LinkedList;

/*
Создать класс, который будет хранить в себе коллекцию с названиями
животных. Реализовать методы удаления и добавления животных по
следующим правилам: добавляется всегда в начало коллекции, а удаляется
всегда из конца. Показать работу объекта этого класса в main методе другого
класса.
 */
public class Animals {

    private final LinkedList<String> animals;

    public Animals(LinkedList<String> animals) {
        this.animals = animals;
    }

    public void addAnimal(String animal) {
        animals.addFirst(animal);
    }

    public void deleteAnimal() {
        animals.removeLast();
    }

    public void showAnimals() {
        System.out.println(animals);
    }
}
