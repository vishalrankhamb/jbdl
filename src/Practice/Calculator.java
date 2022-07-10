package Practice;

public class Calculator {
    int a,b;
    Power power;
    public Calculator(int a,int b,Power power){
        this.a=a;
        this.b=b;
        this.power=power;
    }
    public int getSum(){
        return this.a+this.b;
    }
    public long getPower(){
        return power.pow(a,b);
    }
}
