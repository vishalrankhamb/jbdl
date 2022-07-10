import java.util.*;

public class Main {
    public  static void main(String[] args){
        Random random=new Random();
//        Calculator calculator=new Calculator(random.nextInt(5), random.nextInt(6));
//        System.out.println(calculator.getSum());
//        Animal animal=new Animal(10,30);
//        Bird bird=new Bird(15,20);
//        Dog dog=new Dog(10,30);
//        LifeForm lifeForm=new Animal(5,20);
//        System.out.println("Animla Weight : "+animal.getWeight());
//        System.out.println("Dog Weight : "+dog.getWeight());
//        System.out.println("Bird Weight : "+bird.getWeight());
//        print(animal);
//        print(dog);
//        print(bird);
//        Feeder feeder=new Feeder();
//        feeder.feed(animal);
//        feeder.feed(bird);
//        feeder.feed(dog);
//        Practice.Power power=new Practice.PowerByMul();
//        Practice.Power power=new Practice.PowerByLib();
//        System.out.println(power.pow(3,3));
//        System.out.println(new AgeFinder(lifeForm).getAge());
//        Calculator calculator=new Calculator(3,3,power);
//        System.out.println(calculator.getPower());

        Set<Review> set=new TreeSet<>();
        for(int i=0;i<100;i++){
            set.add(new Review(random.nextInt(5), random.nextInt(5) ));
        }
        print(set);

    }
    public static void print(Collection<Review> collection){
        for(Review i:collection){
            System.out.println(i.userReview+" "+i.criticReview);
//            collection.remove(i);
        }

    }
//    public static void print(Animal animal){
//        System.out.println(animal.getWeight());
//        animal.eat();
//    }
}
