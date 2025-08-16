import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args){
        //headsOrTails
        Random ran = new Random();
        boolean isHeads = ran.nextBoolean();
        if(isHeads){
            System.out.println("HEADS");
        }
        else{
            System.out.println("TAILS");
        }

    }
}
