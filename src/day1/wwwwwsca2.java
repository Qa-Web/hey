package day1;

import java.io.InputStream;
import java.util.Scanner;

public class wwwwwsca2 {
    public wwwwwsca2(InputStream in) {
    }

    public static void main(String[] args) {

        // Soru 3) Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("yaricapi girin");
        double yaricap=scan.nextDouble();

        System.out.println("Girdiginiz yaricap: "+yaricap);
        System.out.println("cemberin cevresi: "+2*3.14*yaricap);
        System.out.println("dairenin alani: "+3.14*yaricap*yaricap);


    }


}
