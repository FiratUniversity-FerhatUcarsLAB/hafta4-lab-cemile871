//Ad soyad: Cemile Akay
//Ogrenci No: 250541099
//Tarih: 05.11.2025
//Açıklama: Görev 3 - Maaş Hesaplama
//Bu program kullanıcıdan bilgi alıp maaş hesaplar 


import java.util.Scanner;
import java.text.DecimalFormat;

public class MaasHesap {
  public static void main(String[] args) {

      final double SGK_ORANI = 0.14;
      final double GELIR_VERGISI_ORANI = 0.15;
      final double DAMGA_VERGISI_ORANI = 0.00759;

      //Kullanıcıdan bilgi almak için scanner nesnesi oluşturma
      Scanner scanner = new Scanner(System.in);


      //Ad bilgisi alma
      System.out.print("Calisan Adi Soyadi: ");
      String adSoyad = scanner.nextLine();

      //Maaş bilgisi alma
      System.out.print("Aylık Brut Maas TL: ");
      double brutMaas = scanner.nextDouble();

      //Haftalık çalışma saati bilgisi alma
      System.out.print("Haftalık Calısma Saati: ");
      int haftalıkCalısmaSaati = scanner.nextInt();

      //Mesai saati bilgisi alma
      System.out.print("Mesai Saati: ");
      int mesaiSaati = scanner.nextInt();

      //Scanner nesnesini kapatma
      scanner.close();

      // Gelirler (brut maas, mesai ucreti)
       double mesaiUcreti =(brutMaas / 160) * mesaiSaati * 1.5;
       double  toplamGelir = brutMaas + mesaiUcreti;

      // Kesintiler (SGK, gelir vergisi, damga vergisi)
       double SGK = toplamGelir * 0.14;
       double gelirVergisi = toplamGelir * 0.15;
       double damgaVergisi = toplamGelir * 0.00759;
       double toplamKesinti = SGK + gelirVergisi + damgaVergisi;

       // Net maas
       double netMaas = toplamGelir - toplamKesinti;

       // Hesaplanacak istatistikler (kesiti oranı, saatlik net kazanc, günlük net kazanç)
       double kesitiOrani = (toplamKesinti / toplamGelir) * 100;

       // 22 gün * 8 saat = 176 saat/ay (ayda 22 gün 176 saat çalışıyor)
       double saatlikNetKazanc = netMaas / 176;
       double gunlukNetKazanc = netMaas / 22;

       //Hesaplamalar ve bilgileri ekrana düzenli yazdırma aşaması
        System.out.println("============================================");
        System.out.println("                MAAS BORDROSU               ");
        System.out.println("============================================");

        System.out.println("Calisan: " + adSoyad);

        System.out.println();

        //Gelirleri hesaplama
        System.out.println("GELİRLER:");
        System.out.printf("%-30s : %8.2f %s\n", "   Brut Maas ", brutMaas, "TL");
        System.out.printf("%-30s : %8.2f %s\n", "   Mesai Ucreti (10 saat) ", mesaiUcreti, "TL");

        System.out.println("   -----------------------------");
        System.out.printf("%-30s : %8.2f %s\n", "   TOPLAM GELIR ", toplamGelir, "TL");

        System.out.println();

        //Kesinti ve net maaş hesaplama
        System.out.println("KESINTILER:");
        System.out.printf("%-30s : %8.2f %s\n", "   SGK Kesintisi (14.0%) ", SGK, "TL");
        System.out.printf("%-30s : %8.2f %s\n", "   Gelir Vergisi (15.0%) ", gelirVergisi, "TL");
        System.out.printf("%-30s : %8.2f %s\n", "   Damga Vergisi (0.8%) ", damgaVergisi, "TL");

        System.out.println("   -----------------------------");
        System.out.printf("%-30s : %8.2f %s\n", "   TOPLAM KESINTI ", toplamKesinti, "TL");
        System.out.printf("%-30s : %8.2f %s\n", "NET MAAS ", netMaas, "TL");
        System.out.println("============================================");

    }

}

