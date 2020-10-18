package pboif2_10119065_latihan3_input;
import java.util.Scanner;
/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini memunculkan hasil input dari keyboard 
 *                        ke layar
 */
public class PBOIF2_10119065_Latihan3_Input {
    
    public static void main(String[] args) {
        System.out.print("Masukkan nama anda: ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah " + nama);
    }
    
}
