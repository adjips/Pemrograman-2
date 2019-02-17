package Pra_UTS.Soal2;

import java.util.Scanner;

/**
 *
 * @author Adji Pangestu
 */
public class NilaiTerbesar {

    public static void main(String[] args) {
        int input_data = 8;
        Scanner input;
        input = new Scanner(System.in);

        int hasil_data[] = new int[input_data];
        System.out.print("Masukkan 8 nilai angka: ");

        for (int i = 0; i < input_data; i++) {
            hasil_data[i] = input.nextInt();
        }

        for (int j = 0; j < input_data - 1; j++) {
            for (int nilai = 0; nilai < input_data - 1; nilai++) {
                if (hasil_data[nilai] < hasil_data[nilai + 1]) {
                    int x = hasil_data[nilai];
                    hasil_data[nilai] = hasil_data[nilai + 1];
                    hasil_data[nilai + 1] = x;
                }
            }
        }

        System.out.println("");
        System.out.println("Hasil 3 Nilai Terbesar : ");
        System.out.println(hasil_data[0] + "\n" + hasil_data[1] + "\n" + hasil_data[2]);
    }
}
