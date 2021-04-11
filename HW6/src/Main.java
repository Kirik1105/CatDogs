public class Main {
    public static void main(String[] args) {
        int cats = 0;
        int dogs = 0;
        int animals = cats + dogs;
        Animal dog1 = new Dog();
        Animal dog2 = new Dog();
        Animal dog3 = new Dog();
        Animal dog4 = new Dog();
        Animal cat1 = new Cat();
        Animal cat2 = new Cat();
        Animal cat3 = new Cat();
        Animal cat4 = new Cat();
        dog1.run(1000);
        dog2.run(150);
        dog3.swim(5);
        dog4.swim(15);
        cat1.run(1000);
        cat2.run(150);
        cat3.swim(5);
        cat4.swim(15);
        System.out.println("---------------");
        System.out.println("В общем у нас: \n" + Dog.dogs + " Собак\n" + Cat.cats + " Кошек\n" + "И того " + (Dog.dogs + Cat.cats) + " Животных");
    }
}
