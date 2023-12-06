import java.util.Scanner;

public class Main {
    static Scanner scan;
    static int power(int base, int exporent){
        if (exporent == 0){
            return  1;
        } else if (base==1) {
            return 1;
        }
        return base*power(base,exporent-1);
    }
    public static void main(String[] args) {
        scan = new Scanner(System.in);
        System.out.print("Taban Değer Giriniz : ");
        int base = scan.nextInt();
        System.out.print("Üst Değer Giriniz : ");
        int exp = scan.nextInt();
        System.out.println("========================================");
        System.out.println( "Sonuç : "+power(base, exp));
    }
}