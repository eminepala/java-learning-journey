class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String speak() {
        return "Animal is speaking...";
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return this.getName() + " is meowing...";
    }
}

class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return this.getName() + " is barking...";
    }
}

class Horse extends Animal {

    public Horse(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return this.getName() + " is neighing...";
    }
}

class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return this.getName() + " is chirping...";
    }
}

public class Main {

    public static void makeSpeak(Object object) {

        if (object instanceof Dog) {
            Dog dog = (Dog) object;
            System.out.println(dog.speak());
        }
        else if (object instanceof Cat) {
            Cat cat = (Cat) object;
            System.out.println(cat.speak());
        }
        else if (object instanceof Horse) {
            Horse horse = (Horse) object;
            System.out.println(horse.speak());
        }
        else if (object instanceof Animal) {
            Animal animal = (Animal) object;
            System.out.println(animal.speak());
        }
    }

    public static void main(String[] args) {

        Dog dog = new Dog("Karabas");
        Cat cat = new Cat("Tekir");
        Horse horse = new Horse("Sahbatur");
        Animal animal = new Animal("Limon");
        Bird bird = new Bird("Zeytin");

        makeSpeak(dog);
        makeSpeak(cat);
        makeSpeak(horse);
        makeSpeak(animal);
        makeSpeak(bird);
    }
}
