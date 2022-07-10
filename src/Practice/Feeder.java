package Practice;

public class Feeder {
    public void feed(Animal animal){
        System.out.println(animal.getWeight());
        animal.eat();
    }
}
