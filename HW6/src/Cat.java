public class Cat extends Animal {
    final int runDist=200;
    final int swimDist=0;
    static int cats=0;
    Cat(){
        cats++;
    }
    @Override
    public void run(int dist) {
        if (dist>runDist){
            System.out.println("Кот пробежал "+runDist+" м и устал");
        }
        else {
            System.out.println("Кот пробежал "+dist+" м");
        }
    }

    @Override
    public void swim(int dist) {
            System.out.println("Коты не умеют плавать");

    }
}
