import java.util.EventListener;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int kapasitee = 0, secim = 0, sayi;
        Integer tip;
        boolean bool=false;
        Bisiklet bisiklet = new Bisiklet(1, 1);
        Motorsiklet motor = new Motorsiklet(2, 1);
        Araba araba = new Araba(3, 2);
        Kamyonet kamyonet = new Kamyonet(4, 3);
        Otobus otobus = new Otobus(5, 5);
        Tır tir = new Tır(6, 8);
        Scanner input = new Scanner(System.in);
        Scanner tipp = new Scanner(System.in);
        Scanner secimm = new Scanner(System.in);

        do {
            System.out.println("5 ile 50 arası Garaj kapasitesini giriniz");
            kapasitee = input.nextInt();
            if (kapasitee>5 && kapasitee<50)
            {
              bool=true;
            }
            else
            {
                bool=false;
            }

            if (bool)
            {
                garage garage = new garage(kapasitee);
                while (secim != 4) {
                    System.out.println("1-->Arac Yerlestir");
                    System.out.println("2-->Arac Çıkar");
                    System.out.println("3-->Araçları Listele");
                    System.out.println("4-->Çıkış");
                    System.out.println("Secim yapınız");
                    secim = secimm.nextInt();
                    switch (secim) {
                        case 1:

                            System.out.println("TİP DEĞERİ GİR");
                            tip = tipp.nextInt();
                            if (tip == 1) {
                                garage.AracEkle(bisiklet);
                                System.out.println("Mevcut araç sayısı " + garage.AracSayisi());

                            } else if (tip == 2) {

                                garage.AracEkle(motor);
                                System.out.println("Mevcut araç sayısı " + garage.AracSayisi());

                            } else if (tip == 3) {

                                garage.AracEkle(araba);
                                System.out.println("Mevcut araç sayısı " + garage.AracSayisi());

                            } else if (tip == 4) {

                                garage.AracEkle(kamyonet);
                                System.out.println("Mevcut araç sayısı " + garage.AracSayisi());

                            } else if (tip == 5) {


                                garage.AracEkle(otobus);
                                System.out.println("Mevcut araç sayısı " + garage.AracSayisi());

                            } else if (tip == 6) {

                                garage.AracEkle(tir);
                                System.out.println("Mevcut araç sayısı " + garage.AracSayisi());

                            }
                            else
                            {
                                System.out.println("Yanlış Tip Değeri Girdiniz");
                            }

                            break;
                        case 2:
                            System.out.println("TİP DEĞERİ GİR");
                            tip = tipp.nextInt();
                            if (tip == 1) {
                                garage.AracCikart(bisiklet);
                                System.out.println("Mevcut araç sayısı " + garage.AracSayisi());

                            } else if (tip == 2) {

                                garage.AracCikart(motor);
                                System.out.println("Mevcut araç sayısı " + garage.AracSayisi());

                            } else if (tip == 3) {

                                garage.AracCikart(araba);
                                System.out.println("Mevcut araç sayısı " + garage.AracSayisi());

                            } else if (tip == 4) {

                                garage.AracCikart(kamyonet);
                                System.out.println("Mevcut araç sayısı " + garage.AracSayisi());

                            } else if (tip == 5) {

                                garage.AracCikart(otobus);
                                System.out.println("Mevcut araç sayısı " + garage.AracSayisi());

                            } else if (tip == 6) {

                                garage.AracCikart(tir);
                                System.out.println("Mevcut araç sayısı " + garage.AracSayisi());

                            }
                            break;
                        case 3:
                            System.out.println("Araç Listesi :");
                            garage.PrintArac();
                            System.out.println("\n");
                            System.out.println("Mevcut araç sayısı " + garage.AracSayisi());
                            break;

                    }

                }
            }



        }while (!bool);

    }
}













