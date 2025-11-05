/*
 * Ad Soyad: CEMİLE AKAY
 * Ogrenci No: 250541099
 * Tarih: 05.11.2025
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 * Diğer java dosyalarının başında da bu örnek formattaki gibi kısa bilgi giriniz
 */

import java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args) {
        // Scanner objesi olusturun
         Scanner input = new Scanner(System.in);
        
        // Degisken tanimlamalari
        // String ad, soyad;
       String ad = input.next();
       String soyad = input.next();
        
        // int ogrenciNo, yas;
       int ogrenciNo = input.nextInt();
       int yas = input.nextInt();
        
        // double gpa;
       double gpa = input.nextDouble();
        
        // Kullanicidan bilgileri alin
        System.out.println("=== OGRENCI BILGI SISTEMI ===");
        System.out.println();
        
        // Ad
         System.out.print("Adinizi girin: ");
        
        // Soyad
         System.out.print("Soyadinizi girin: ");
        
        // Ogrenci No
         System.out.print("Numaraniz: ");
        
        // Yas
         System.out.print("Yasiniz: ");
        
        // GPA
        System.out.print("GPA (0.00-4.00): ");

        //Scanner nesnesini kapat
        input.close();

        //Durum belirleme
        String durum;
        if (gpa >= 3.00) {
            durum = "Normal Ogrenci";
        } else if (gpa >= 2.00) {
            durum = "Normal Ogrenci";
        } else {
            durum = "Dikkat Etmesi Gereken Ogrenci";
        }

        
        // Bilgileri ekrana yazdirin
        System.out.println("\n=== OGRENCI BILGI SISTEMI ===");
        System.out.println("Ad Soyad: " + ad + " " + soyad);
        System.out.println("Ogrenci No: " + ogrenciNo);
        System.out.println("Yas: " + yas);

        System.out.printf("GPA: %.2f %n", gpa);

        System.out.println("Durum: " + durum);
        System.out.println("===============================");
            
        
    }
}
