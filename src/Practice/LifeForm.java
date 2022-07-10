package Practice;

public abstract class LifeForm {
    int age;
    public LifeForm(int age){
        this.age=age;
    }
    public void breath(){
        System.out.println("Breathes......");
    }
    public int getAge(){
        return this.age;
    }
}
