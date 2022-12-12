import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı giriniz : ");
        int awesomeNum = input.nextInt();
        int sum = 0;
        for (int i = 1; i < awesomeNum; i++) {
            if (awesomeNum % i == 0) {
                sum += i;
            }
        }
        if (awesomeNum == sum) {
            System.out.println(awesomeNum + " Mükemmel sayıdır");
        }else {
            System.out.println(awesomeNum+" Mükemmel olmayan sayıdır");
        }
    }
}