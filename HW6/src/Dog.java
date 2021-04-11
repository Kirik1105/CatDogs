public class Dog extends Animal {
    final int runDist = 500;
    final int swimDist = 10;
    static int dogs = 0;

    Dog() {
        dogs++;
    }

    @Override
    public void run(int dist) {
        if (dist > runDist) {
            System.out.println("Собака пробежала " + runDist + " м и устала");
        } else {
            System.out.println("Собака пробежала " + dist + " м");
        }
    }

    @Override
    public void swim(int dist) {
        if (dist > swimDist) {
            System.out.println("Собака проплыла " + swimDist + " м и начала тонуть");
        } else {
            System.out.println("Собака проплыла " + dist + " м");
        }
    }
}
