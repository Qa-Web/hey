package day1;

public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Hello World");

        String x="Hello";  //String kelime veya harf sayi yazdirmamizi saglar
        String y="World";
        System.out.println(x+y);

        int sayi=5;     //tam sayilarda islem yapma ve yazdirmaya yarar
        int sayi2=10;
        System.out.println(sayi+sayi2);
        System.out.println(x+sayi2);

        System.out.println(x+sayi+y); //Hello5World
        System.out.println(sayi2-sayi+y+sayi*sayi2); //5World50

        System.out.println(x+(sayi2-sayi)+(sayi-sayi2)); //Hello5-5
        System.out.println(sayi+ (sayi2+x+y)); //510HelloWorld

        System.out.println(""+sayi+sayi2+x+y); //510HelloWorld

        boolean ogrenciMi=false;
        System.out.println(ogrenciMi);
        boolean karVarMi=false;
        System.out.println(karVarMi);

        double a=10.5;
        double b=4.6;
        System.out.println(a+b);






    }

}
