import java.util.Scanner;
public class harmoniksayi {


        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            //Harmonik Sayıları Bulan Program - For Döngüsü

        /*
        int n;
        System.out.print("Sayı Giriniz :");
        n = input.nextInt();
        double sonuc=0;

        for (double i =1; i<=n; i++){
            sonuc += (1/i);
        }
        System.out.print("Sonuç :" + sonuc);
        */


            //Harmonik Sayıları Bulan Program - While Döngüsü

            int n;
            double sonuc =0;

            System.out.print("Sayı Giriniz :");
            n = input.nextInt();
            double i=1;
            while (i<=n){
                sonuc += (i/n);
                i++;
            }

            System.out.print("Sonuç :" +sonuc);

        }
    }

