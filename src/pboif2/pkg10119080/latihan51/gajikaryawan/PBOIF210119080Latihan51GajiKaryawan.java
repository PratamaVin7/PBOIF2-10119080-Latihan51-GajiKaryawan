/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119080.latihan51.gajikaryawan;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Kevin Pratama Sinaga
 * KELAS    : PBOIF2
 * NIM      : 10119080
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * (OBJECT ORIENTED) Gaji Karyawan
 */
public class PBOIF210119080Latihan51GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        Manager manager = new Manager();
        
        System.out.println("===Program Perhitungan Gaji Karyawan===");
        System.out.print("Masukkan NIK : ");
        manager.setNik(scanner.next());
        System.out.print("Masukkan Nama : ");
        manager.setNama(scanner.next());
        System.out.print("Masukkan Golongan (1/2/3) : ");
        manager.setGolongan(scanner.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        manager.setJabatan(scanner.next());
        System.out.print("Masukkan Jumlah Kehadiran : ");
        manager.setKehadiran(scanner.nextInt());
        System.out.println();
        
        int golongan = manager.getGolongan();
        String jabatan = manager.getJabatan();
        int kehadiran = manager.getKehadiran();
        System.out.println("====Hasil Perhitungan====");
        System.out.println("NIK\t : " + manager.getNik());
        System.out.println("NAMA\t : " + manager.getNama());
        System.out.println("GOLONGAN : " + golongan);
        System.out.println("JABATAN\t : " + jabatan);
        System.out.println();
        
        System.out.println("TUNJANGAN GOLONGAN\t: " + manager.tunjanganGolongan
                           (golongan));
        System.out.println("TUNJANGAN JABATAN\t: " + manager.tunjanganJabatan
                           (jabatan));
        System.out.println("TUNJANGAN KEHADIRAN\t: " + manager.tunjanganKehadiran
                           (kehadiran));
        System.out.println();
        System.out.println("Gaji Total\t: " + manager.gajiTotal());   
    }
    
}