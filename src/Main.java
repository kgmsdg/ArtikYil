import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int yil,kalan100,kalan4,kalan400;
        Scanner inp = new Scanner(System.in);

        System.out.print("Yıl giriniz : ");
        yil = inp.nextInt();
        kalan4 = yil % 4;
        kalan100 = yil % 100;

        if (kalan4 == 0){
            if (kalan100 == 0){
                kalan400 = yil % 400;
                if (kalan400 == 0){
                    System.out.println(yil + " Artık bir yıldır !");
                }else {
                    System.out.println(yil + " Artik bir yıl değildir !");
                }
            }else {
                System.out.println(yil + " Artık bir yıldır !");
            }
        }else {
            System.out.println(yil + " Artık bir yıl değildir !");
        }

    }
}
