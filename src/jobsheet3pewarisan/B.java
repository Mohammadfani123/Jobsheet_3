/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet3pewarisan;

/**
 *
 * @author Windows 10
 */
class B extends A {
    private int b;
    int total;
    public void setB(int nilai){
        b = nilai;
    }
    public int getB(){
        return b;
    }
    
   
    
    public void tampilkanNilai(){
        super.tampilkanNilai();
        System.out.println("Nilai b : "+getB());
        System.out.println("Total   : "+(getA()+getB()));
    }
}
