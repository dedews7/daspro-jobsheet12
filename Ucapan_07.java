import java.util.Scanner;
public class Ucapan_07 {
    public static void main(String[] args) {
        String nama = PenerimaUcapan();
        System.out.println("Thank you" +nama+"\nMay the force be with you.");
    }
    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Fikri:"); 
        String namaOrang = sc.nextLine(); 
        return namaOrang; 
    }

    
}