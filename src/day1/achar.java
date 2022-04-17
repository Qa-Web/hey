package day1;

public class achar {
    public static void main(String[] args) {

        char ilkHarf;
        ilkHarf='a';
        System.out.println(ilkHarf);

        String isim="Sefa";
        String soyIsim="Cebeci";

        System.out.println("Isminiz :"+ isim);
        System.out.println("Soyisminiz : "+soyIsim);

       /*
       1- Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP) bir program yaziniz
 Orn  : sayi1=10; ve sayi2=20;
  kod calistiktan sonra
  sayi1=20 ve sayi2=10

         */

/*
           int sayi1=10;
           int sayi2=20;
        System.out.println("Swapdan once sayi1="+sayi1+" sayi2="+sayi2);

       sayi1= sayi1+sayi2; //sayi1=30 sayi2=20
       sayi2= sayi1-sayi2; //sayi2=10 sayi1=30
       sayi1= sayi1-sayi2; //sayi1=20 sayi2=10
        System.out.println("Swapdan sonra sayi1= "+sayi1+"sayi2= "+sayi2);
*/
        int sayi1=10;
        int sayi2=20;
        System.out.println("Swapdan once sayi1="+sayi1+" sayi2="+sayi2);
        int temp=sayi1;
        sayi1=sayi2;

        sayi2=temp;
        System.out.println("Swapdan sonra sayi1= "+sayi1+"sayi2= "+sayi2);





    }
}
