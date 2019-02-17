package Pra_UTS.Soal1;

import java.util.Scanner;

/**
 *
 * @author Adji Pangestu
 */
public class Main {

    Scanner input;

    Lingkaran c1 = new Lingkaran();
    Lingkaran c2 = new Lingkaran();

    String[] circle1;
    String[] circle2;
    String[] r1;
    String[] r2;

    int himpunan_lingkaran;

    public Main() {
        this.input = new Scanner(System.in);
    }

    public void c1() {

        System.out.print("Masukkan nilai C1 dengan format (x1,y1) di lingkaran ke - 1 : ");
        circle1 = input.next().split(",", 2);
        c1.setX(Integer.parseInt(circle1[0]));
        c1.setY(Integer.parseInt(circle1[1]));

        System.out.print("Masukkan nilai C1 (r1) di lingkaran ke - 1 : ");
        r1 = input.next().split("");
        c1.setR(Integer.parseInt(r1[0]));

        System.out.println("");
    }

    public void c2() {

        System.out.print("Masukkan nilai C2 dengan format (x2,y2) di lingkaran ke - 2 : ");
        circle2 = input.next().split(",", 2);
        c2.setX(Integer.parseInt(circle2[0]));
        c2.setY(Integer.parseInt(circle2[1]));

        System.out.print("Masukkan nilai C2 (r2) di lingkaran ke - 2 : ");
        r2 = input.next().split("");
        c2.setR(Integer.parseInt(r2[0]));

        System.out.println("");
    }

    public void hasil() {
        himpunan_lingkaran = (int) Math.sqrt(Math.pow((c1.getX() - c2.getX()), 2)
                + Math.pow((c1.getY() - c2.getY()), 2));

        if (himpunan_lingkaran >= (c1.getR() + c2.getR())) {
            System.out.println("Hasilnya : ");
            System.out.println("C1 dan C2 Saling Lepas");
        } else if (himpunan_lingkaran < (c1.getR() + c2.getR())) {
            if ((c1.getR() < c2.getR())
                    && (((c1.getX() + c2.getR() < c2.getX() + c2.getR())
                    && (c1.getX() - c1.getR() > c2.getX() - c2.getR())
                    && (c1.getY() + c1.getR() < c2.getY() + c2.getR())
                    && (c1.getY() - c1.getR() > c2.getY() - c2.getR())))) {
                System.out.println("Hasilnya : ");
                System.out.println("C1 ada di dalam C2");
            } else if ((c1.getR() > c2.getR())
                    && (((c1.getX() + c1.getR() > c2.getX() + c2.getR())
                    && (c1.getX() - c1.getR() < c2.getX() - c2.getR())
                    && (c1.getY() + c1.getR() > c2.getY() + c2.getR())
                    && (c1.getY() - c1.getR() < c2.getY() - c2.getR())))) {
                System.out.println("Hasilnya : ");
                System.out.println("C2 ada di dalam C1");
            } else {
                System.out.println("Hasilnya : ");
                System.out.println("C1 dan C2 saling beririsan");
            }
        }
    }

    public static void main(String[] args) {
        Main lingkaran = new Main();

        lingkaran.c1();

        lingkaran.c2();

        lingkaran.hasil();
    }

}
