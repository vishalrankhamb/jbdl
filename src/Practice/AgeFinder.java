package Practice;

public class AgeFinder {
    LifeForm lifeForm;
    public AgeFinder(LifeForm lifeForm){
        this.lifeForm=lifeForm;
    }
    public int getAge(){
        return lifeForm.getAge();
    }
}
