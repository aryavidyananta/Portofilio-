//Tugas Array Menjumlahkan Nilai Array
// Nama: I Putu Arya Vidyananta
// NIM: 2215091079
// Kelas 3B


package Array;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        int[] array = new int[100];
        int a, i, pilih, jumlah;
        Scanner input = new Scanner(System.in);
        System.out.println("Program Menjumlahkan Nilai pada Array");
        System.out.println("Jumlah Array");
        a = input.nextInt();

        for (i = 0; i < a; i++) {
            System.out.printf("a[%d] = ", i);
            array[i] = input.nextInt();
        }

        System.out.println("Jumlah yang mana?");
        System.out.println("1. Semua");
        System.out.println("2. Ganjil");
        System.out.println("3. Genap");
        System.out.print("Pilih = ");

        // Menambahkan pengamanan input
        if (input.hasNextInt()) {
            pilih = input.nextInt();
            
            //menghitung semua nilai pada array
            if (pilih == 1) {
                jumlah = 0;
                for (i = 0; i < a; i++) {
                    jumlah = jumlah + array[i];
                }
                System.out.println("Jumlah nilai array = " + jumlah);
                
                //menghitung nilai pada index ganjil
            } else if (pilih == 2) {
                jumlah = 0;
                for (i = 0; i < a; i++) {
                    if (i % 2 == 1) {
                        jumlah += array[i];
                    }
                }
                System.out.println("Jumlah nilai pada index ganjil = " + jumlah);
                
                //menghitung nilai pada index genap
            } else if (pilih == 3) {
                jumlah = 0;
                for (i = 0; i < a; i++) {
                    if (i % 2 == 0) {
                        jumlah += array[i];
                    }
                }
                System.out.println("Jumlah nilai array untuk index genap = " + jumlah);
            } 
            
        	} 
        }
    }

