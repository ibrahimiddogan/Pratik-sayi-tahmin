import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        System.out.println(number);
        Scanner alici = new Scanner(System.in);
        int right =0;
       while (right<3){
           System.out.print("Sayıyı tahmin ediniz : ");
           int guess = alici.nextInt();
           if (number==guess){
               System.out.println("Tebrikler doğru bildiniz sayımız : " + number);
               break;
           } else if (number<guess) {
               System.out.println("Girdiğiniz sayı bizim sayımızdan fazla");
               System.out.println("Kalan hakkınız " + (2-right));

           }else {
               System.out.println("Bulduğunuz sayı bizim sayımızdan küçük");
               System.out.println("Kalan hakkınız " + (2-right));
           }
           right++;
       }
    }
}