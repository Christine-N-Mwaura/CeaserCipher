import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        boolean ceaserCipherRunning = true;
        EnryptMe encrypt = new EnryptMe();

        while (ceaserCipherRunning) {
            System.out.println("Welcome to Ceaser Cipher program would you like to encrypt, decrypt or exit ?");

            String choice = myScanner.nextLine();
        }
    }


}