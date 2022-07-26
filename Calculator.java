import java.util.Scanner;

public class Calculator{

    static int sum(int a, int b){
        int result = a + b;
        System.out.println("Toplam = " + result);
        return result;
    }

    static int minus(int a, int b){
        int result = a - b;
        System.out.println("Sonuç = " + result);
        return result;
    }

    static int times(int a, int b){
        int result = a * b;
        System.out.println("Çarpım sonucu : " + result);
        return result;
    }

    static int divided(int a, int b){
        int result = a / b;
        if(b == 0){
            return 0;
        }
        System.out.println("Bölüm sonucu : " + result);
        return result;
    }

    static int pow(int a,int b){
        int result=1;
        for (int i=1;i<=b;i++) {
            result *= a;
        }
        System.out.println("Sonuc="+result);
        return result;
    }
    static int mod(int a, int b){
        int result=a%b;
        System.out.println("sonuc="+result);
        return result;
    }
    static int dortgenCevre(int a,int b){
        int alan=a*b;
        int cevre=2*(a+b);
        System.out.println("Alan="+alan);
        System.out.println("Cevre="+cevre);
        return cevre;
    }

    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;

        String menu = "1- Toplama İşlemi\n"
        + "2- Çıkarma İşlemi\n"
        + "3- Çarpma İşlemi\n"
        + "4- Bölme işlemi\n"
        + "5- Üslü Sayı Hesaplama\n"
        + "6- Faktoriyel Hesaplama\n"
        + "7- Mod Alma\n"
        + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
        + "0- Çıkış Yap";

        while(true){

            System.out.print(menu);
            System.out.print("Bir işlem seçiniz : ");
            select = scan.nextInt();

            if(select == 0){
                break;
            }

            System.out.print("İlk sayıyı giriniz : ");
            int a = scan.nextInt();
            System.out.print("İkinci sayıyı giriniz : ");
            int b = scan.nextInt();

            switch(select){
                case 1:
                    sum(a,b);
                    break;
                case 2:
                    minus(a, b);
                    break;   
                case 3:
                    times(a, b);
                    break;   
                case 4 :
                    divided(a, b);
                    if(a / b == 0)
                    System.out.println("İkinci sayı 0'dan büyük olmalı.");
                    break;  
                 case 5:
                    pow(a,b);
                    break;
                case 6:
                    mod(a,b);
                    break;
                case 7:
                    dortgenCevre(a,b);
                    break;        
            }
        }
    }


}