import java.util.Scanner;

public class Kubus07 {
    public static double hitungVolume(double sisi) {
        double volume = Math.pow(sisi, 3);
        return volume;
    }

    public static double hitungLuasPermukaan(double sisi) {
        double luasPermukaan = 6 * Math.pow(sisi, 2);
        return luasPermukaan;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = scanner.nextDouble();

        double volume = hitungVolume(sisi);
        System.out.println("Volume kubus: " + volume);

        double luasPermukaan = hitungLuasPermukaan(sisi);
        System.out.println("Luas permukaan kubus: " + luasPermukaan);

        scanner.close();
    }
}