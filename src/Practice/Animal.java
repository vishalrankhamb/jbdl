package Practice;

public class Animal extends LifeForm {
    private int weight;
    public Animal(int weight,int age){
        super(age);
        this.weight=weight;
    }
    public int getWeight(){
        return this.weight;
    }
    public void setWeight(int weight){
        this.weight=weight;
    }
    public void eat(){
        System.out.println("Animal eats....");
    }

}
