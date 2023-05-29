import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static TimeUnit second = TimeUnit.SECONDS;
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Podaj liczbe do odliczania:");
        Integer sleep = input.nextInt();
        System.out.println("Twoja bomba wybuchnie za:");
        for(int i = sleep; i > 0; i--) {
            second.sleep(sleep / sleep);
            System.out.println(i);
        }
        second.sleep(1);
        System.out.println("Boom!!!");
    }
}
