package Practice;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

public class Main {
    public static void main(String[] args){
        Random random=new Random();
        Set<Review> set=new TreeSet<>(new UserReviewComp());

        for(int i=0;i<=100;i++){
            set.add(new Review(random.nextInt(5),random.nextInt(5)));
        }
        print(set);
    }
    public static void print(Collection<Review> collection){
        for(Review i :collection){
            System.out.println(i.criticReview+" "+i.userReview+" ");
//            collection.remove(i);
        }
    }
}
