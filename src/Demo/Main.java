package Demo;

public class Main {
    int countDigit(long num ){
        if(num==0){
            return 0;
        }
        return 1+countDigit(num/10);
    }
    public static void main(String[] args){
        Main main=new Main();
        System.out.println(main.countDigit(12123));
    }
}
