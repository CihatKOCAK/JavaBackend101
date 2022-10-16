package Giris;

public class Baslangic {
    public static void main(String[] args) {

        //tam sayılar
        byte bit8 = 127; // -128 <= x < 128
        short bit16 = 123; //16 bit
        int bit32 = 14125; //32 bit
        long bit64 = 125189275; //64 bit

        //ondalık sayılar
        float bit32F = 32.4F;
        double bit64D = 123.123;

        //char
        char bit16C = 'b';
        char bit16v2 = 127; //ascii kodu da yazılabilir.

        char c1 = 'S', c2 = 'L', c3 = 'M';

        System.out.println("İfadelerin Toplamı = " + c1+c2+c3); //string ifade olarak yazdırır
        System.out.println(c1+c2+c3); //ascii kodlarını toplar

        //boolean
        boolean d = true;
        boolean f = false;

        //string

        //java'da stringler charlardan oluşan classlardır o yüzden baş harfi büyük yazılır!!!

        String str = "qweasdqwe";


        System.out.println("bit16 = " + bit16);


        System.out.println("Hello World!");
        System.out.print("Have we go! \"1\" " );
        //System.out.println(5 > 13);
        System.out.print("\n3\n2\n1");

    }
}
