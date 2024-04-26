/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan5;

/**
 *
 * @author Lab 2201010614
 * tgl:2024-04-26
 */
public class Pertemuan5 {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        aritmatika Amatik = new aritmatika();
    
        int hsltambah = 0;
        
        hsltambah = Amatik.tambah(80, 90);
        System.out.println("Hasil: "+hsltambah);
        
        Hitungluassegi3 HLS3 = new Hitungluassegi3();
        HLS3.SetAlas (5);
        HLS3.SetTinggi (8);
        double hsl = HLS3.HitungLsegi3();
        HLS3.TampilHasil();
    }
    
}
