/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119080.latihan51.gajikaryawan;

/**
 *
 * @author
 * NAMA     : Kevin Pratama Sinaga
 * KELAS    : PBOIF2
 * NIM      : 10119080
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * (OBJECT ORIENTED) Gaji Karyawan
 */
public class Karyawan {
    protected String nik, nama, jabatan;
    protected int golongan;
    
    public String getNik(){
        return this.nik;
    }
    
    public void setNik(String nik){
        this.nik = nik;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getJabatan(){
        return this.jabatan;
    }
    
    public void setJabatan(String jabatan){
        this.jabatan = jabatan;
    }
    
    public int getGolongan(){
        return this.golongan;
    }
    
    public void setGolongan(int golongan){
        this.golongan = golongan;
    }
    
}