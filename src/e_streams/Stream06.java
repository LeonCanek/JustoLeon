package e_streams;

import java.util.Random;

public class Stream06 {
    public static void main(String[] args){
        Random random = new Random();
        random.ints().limit(10).sorted().forEach(System.out::println);
        System.out.println("***************************************************");
        random.ints().limit(34).sorted().forEach(System.out::println);
        System.out.println("***************************************************");
        random.ints().limit(5).sorted().forEach(System.out::println);
    }
}
