import java.util.Scanner;

public class DiskonMakanan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan harga makanan:");
        double harga = input.nextDouble();

        System.out.print("Masukkan kode diskon (contoh: DISKON10, DISKON20): ");
        String kodeDiskon = input.next();

        double diskon = 0;//mengganti penggunaan if dengan
        if (kodeDiskon.equalsIgnoreCase("DISKON10")) {
            diskon = 10;
        } else if (kodeDiskon.equalsIgnoreCase("DISKON20")) {
            diskon = 20;
        } else if (kodeDiskon.equalsIgnoreCase("DISKON30")) {
            diskon = 30;
        } else {
            System.out.println("Kode diskon tidak valid.");
        }

        double totalDiskon = harga * (diskon / 100);
        double hargaSetelahDiskon = harga - totalDiskon;

        System.out.println("Total diskon: " + totalDiskon);
        System.out.println("Harga setelah diskon: " + hargaSetelahDiskon);

        input.close();
    }
}
