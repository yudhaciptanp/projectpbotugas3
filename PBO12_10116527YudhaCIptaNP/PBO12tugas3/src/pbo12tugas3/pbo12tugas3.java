/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo12tugas3;

/**
 *
 * Nama  : Yudha Cipta Noer Permana
 * Nim   : 10116527
 * Kelas : IF-12
 * Matkul: PBO12
 */

class Mahasiswa {
   private String nim; 
   private String nama;
   private double quiz;
   private double uts;
   private double uas;
   private double nilai;
   private char index;

   public String getNim() {
        return nim;
    }

   public void setNim(String nim) {
        this.nim = nim;
    }

   public String getNama() {
        return nama;
    }

   public void setNama(String nama) {
        this.nama = nama;
    }

   public double getQuiz() {
        return quiz;
    }

   public void setQuiz(double quiz) {
        this.quiz = quiz;
    }

   public double getUts() {
        return uts;
    }

   public void setUts(double uts) {
        this.uts = uts;
    }

   public double getUas() {
        return uas;
    }

   public void setUas(double uas) {
        this.uas = uas;
    }

   public double getNilai() {
        return nilai;
    }

   public void setNilai(double nilai) {
        this.nilai = nilai;
    }

   public char getIndex() {
        return index;
    }

   public void setIndex(char index) {
        this.index = index;
    }
   
   
   public double nNilai(double nQuiz,double nUts,double nUas) {
        return 0.2 * nQuiz + 0.3 * nUts + 0.5 * nUas;
    }
    
   public void nIndex(double nNilai){
   char indeks;
   String keterangan;
        if (nNilai> 80 && nNilai <= 100) {
           indeks = 'A';
           keterangan = "Sangat Baik";
       } else if (nNilai > 68) {
           indeks = 'B';
           keterangan = "Baik";
       } else if (nNilai > 56 ) {
           indeks = 'C';
           keterangan = "Cukup";
       } else if (nNilai > 45) {
           indeks = 'D';
           keterangan = "Kurang";
       } else {
           indeks = 'E';
           keterangan = "Sangat Kurang";
       }
         System.out.println("Index = "+indeks);
         System.out.println("Keterangan = "+keterangan);
       }
}
public class pbo12tugas3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Mahasiswa oMhs = new Mahasiswa ();
        
        oMhs.setNim("10116527");
        oMhs.setNama("Yudha Cipta Noer Permana");
        oMhs.setQuiz(75);
        oMhs.setUts(45);
        oMhs.setUas(34);
        
        
        System.out.println("Nama : "+oMhs.getNama());
        System.out.println("Nim  : "+oMhs.getNim());
        System.out.println("Quiz : "+oMhs.getQuiz());
        System.out.println("UTS  : "+oMhs.getUts());
        System.out.println("UAS  : "+oMhs.getUas());
        System.out.println("Nilai Akhir  = "+oMhs.nNilai(oMhs.getQuiz(),oMhs.getUts(),oMhs.getUas()));
        oMhs.nIndex(oMhs.nNilai(oMhs.getQuiz(), oMhs.getUts(), oMhs.getUas()));
    }   
}
