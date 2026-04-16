package homework8.task2;

/*
Создать класс, который будет хранить в себе коллекцию с названиями
животных. Реализовать методы удаления и добавления животных по
следующим правилам: добавляется всегда в начало коллекции, а удаляется
всегда из конца. Показать работу объекта этого класса в main методе другого
класса.
 */
import java.util.*;

public class Zoo {

    public static void main(String[] args) {
        List<String> defaultAnimals = List.of("volf", "raccoon", "lion");
        LinkedList<String> allAnimals = new LinkedList<>(defaultAnimals);
        Animals animals = new Animals(allAnimals);
        animals.addAnimal("camel");
        animals.showAnimals();
        animals.addAnimal("tiger");
        animals.showAnimals();
        animals.addAnimal("bear");
        animals.showAnimals();
        animals.deleteAnimal();
        animals.showAnimals();
    }
}
