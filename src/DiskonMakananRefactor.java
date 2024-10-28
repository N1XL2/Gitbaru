import java.util.Scanner;

public class DiskonMakananRefactor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double harga = inputHarga(input);
        String kodeDiskon = inputKodeDiskon(input);

        double diskon = hitungDiskon(kodeDiskon);
        double totalDiskon = hitungTotalDiskon(harga, diskon);
        double hargaSetelahDiskon = hitungHargaSetelahDiskon(harga, totalDiskon);

        tampilkanHasil(totalDiskon, hargaSetelahDiskon);

        input.close();
    }

    private static double inputHarga(Scanner input) {
        System.out.println("Masukkan harga makanan: ");
        return input.nextDouble();
    }

    private static String inputKodeDiskon(Scanner input) {
        System.out.println("Masukkan kode diskon (contoh: DISKON10, DISKON20): ");
        return input.next();
    }

    private static double hitungDiskon(String kodeDiskon) {
        switch (kodeDiskon.toUpperCase()) {
            case "DISKON10":
                return 10;
            case "DISKON20":
                return 20;
            case "DISKON30":
                return 30;
            default:
                System.out.println("Kode diskon tidak valid.");
                return 0;
        }
    }

    private static double hitungTotalDiskon(double harga, double diskon) {
        return harga * (diskon / 100);
    }

    private static double hitungHargaSetelahDiskon(double harga, double totalDiskon) {
        return harga - totalDiskon;
    }

    private static void tampilkanHasil(double totalDiskon, double hargaSetelahDiskon) {
        System.out.println("Total diskon: " + totalDiskon);
        System.out.println("Harga setelah diskon: " + hargaSetelahDiskon);
    }
}
