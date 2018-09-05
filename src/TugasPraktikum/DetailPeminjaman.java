/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author Windows 10
 */
class DetailPeminjaman extends Peminjam {
    private String tanggalPeminjaman;
    private String tanggalKembali;
   
    
    public DetailPeminjaman(String tanggalPeminjaman,String tanggalKembali,String peminjam,String buku){
        super(peminjam,buku);
        this.tanggalPeminjaman = tanggalPeminjaman;
        this.tanggalKembali  = tanggalKembali;
        
    }
    public void info(){
        super.info();
        System.out.println("Tanggal Pinjam      : "+tanggalPeminjaman);
        System.out.println("Tanggal Kembali     : "+tanggalKembali);
    }
}
