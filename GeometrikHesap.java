//Ad Soyad: Cemile akay
//Ogrenci No: 250541099
//Tarih: 05.11.2025
//Açıklama: Görev 2 - Geometrik hesaplama
//Bu program kullanıcıdan dairenin yarıçapını alır ve hesaplamalar yapıp ekrana yazdırır

import java.util.Scanner;
import java.lang.Math;

public class GeometrikHesap {
   public static void main(String[] args) {

     final double PI = 3.14159;

     //Kullanıcıdan bilgi almak için scanner nesnesi oluşturuluyor
     Scanner scanner = new Scanner(System.in);

     System.out.println("=== GEOMETRİK HESAPLAYICI ===");
     System.out.print("Dairenin yaricapini girin (cm):");

     double r = scanner.nextDouble();

     //Scanner nesnesini kapat
     scanner.close();

     //Hesaplamalar
     double daireAlani = PI * Math.pow(r, 2);

     double daireCevresi = 2 * PI * r ;

     double daireCapi = 2 * r ;

     double kureHacmi = (4.0 / 3.0) * PI * Math.pow(r,3);

     double kureYuzeyAlani = 4 * PI * Math.pow(r, 2);

     //Bilgileri ekrana düzenli yazdırma aşaması
     System.out.println("\nSONUCLAR:");
     System.out.println("------------");


        System.out.printf("%-20s : %8.2f %s\n", "Daire Alani", daireAlani, "cm^2");
        System.out.printf("%-20s : %8.2f %s\n", "Daire Cevresi", daireCevresi, "cm");
        System.out.printf("%-20s : %8.2f %s\n", "Daire Capi", daireCapi, "cm");
        System.out.printf("%-20s : %8.2f %s\n", "Kure Hacmi", kureHacmi, "cm^3");
        System.out.printf("%-20s : %8.2f %s\n", "Kure Yuzey Alani", kureYuzeyAlani, "cm^2");


    }

}

