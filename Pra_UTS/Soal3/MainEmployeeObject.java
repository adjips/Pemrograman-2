package Pra_UTS.Soal3;

/**
 *
 * @author Adji Pangestu
 */
public class MainEmployeeObject {

    public static void main(String[] args) {

        Employee manajer = new Manajer(450000, "Adji Pangestu", "Bandung", 4000000);
        Employee staff1 = new Staff("Dede", "Cianjur", 3500000);
        Employee staff2 = new Staff("Taklim", "Cimahi", 3400000);

        System.out.println("Nama Manajer    : " + manajer.getName());
        System.out.println("Alamat Rumah    : " + manajer.getAddress());
        System.out.println("Gaji Manajer    : " + manajer.getSalary());
        System.out.println("");

        System.out.println("Nama Staff      : " + staff1.getName());
        System.out.println("Alamat Rumah    : " + staff1.getAddress());
        System.out.println("Gaji Staff      : " + staff1.getSalary());
        System.out.println("");

        System.out.println("Nama Staff      : " + staff2.getName());
        System.out.println("Alamat Rumah    : " + staff2.getAddress());
        System.out.println("Gaji Staff      : " + staff2.getSalary());
    }

}
