import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args){
        Random ran = new Random();
        int age;
        age = ran.nextInt(0,10);
        System.out.println(age);
    }
}
