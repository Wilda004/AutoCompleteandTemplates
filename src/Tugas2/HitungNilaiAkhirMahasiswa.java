package Tugas2;

import java.util.Scanner;


/**
 * @author Wilda Amanda Aquari
 */



public class HitungNilaiAkhirMahasiswa {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai UTS: ");
        double uts = input.nextDouble();

        System.out.print("Masukkan nilai UAS: ");
        double uas = input.nextDouble();

        System.out.print("Masukkan nilai Tugas: ");
        double tugas = input.nextDouble();

        double nilaiAkhir = hitungNilaiAkhir(uts, uas, tugas);
        String grade = hitungGrade(nilaiAkhir);

        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Grade: " + grade);
    }

    /**
     * @param tugas masukkan nilai tugas
     * @param uts masukkan nilai uts
     * @param uas masukkan nilai uas
     * @implNote program ini untuk menghitung nilai akhir dari mahasiswa dengan memasukkan nilai uts, uas, dan tugas
     * */
    public static double hitungNilaiAkhir(double uts, double uas, double tugas) {
        // Menggunakan rumus tertentu untuk menghitung nilai akhir
        double nilaiAkhir = (0.4 * uts) + (0.4 * uas) + (0.2 * tugas);
        return nilaiAkhir;
    }
/**
 * @return mengembalikan nilai akhir
 * */
    public static String hitungGrade(double nilaiAkhir) {
        if (nilaiAkhir >= 80) {
            return "A";
        } else if (nilaiAkhir >= 70) {
            return "B";
        } else if (nilaiAkhir >= 60) {
            return "C";
        } else if (nilaiAkhir >= 50) {
            return "D";
        } else {
            return "E";
        }
    }
}