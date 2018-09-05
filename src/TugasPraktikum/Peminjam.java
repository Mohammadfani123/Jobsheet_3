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
class Peminjam extends Perpustakaan {
    private String peminjam;
   
    public Peminjam (String peminjam,String buku){
        super(buku);
        this.peminjam = peminjam;
    }
    
    public void info(){
        super.info();
        System.out.println("Nama Peminjam       : "+this.peminjam);
    }
}
