import java.util.Scanner;

public class UcapanTerimakasihModifikasi_07 {
   
    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }

    public static void ucapanTerimakasih() {
        String nama = PenerimaUcapan(); 
        System.out.println("Thank you " + nama + "\nMay the force be with you.");
    }

    public static void ucapanTambahan(String ucapan) {
        System.out.println(ucapan);
    }
        
    
    public static void main(String[] args) {
        ucapanTerimakasih();
        String ucapan = "and also i miss u.";
        ucapanTambahan(ucapan);
    }

}
