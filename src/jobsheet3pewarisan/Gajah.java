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
public class Gajah extends Hewan{
     
    public static void testClassMethod(){
        System.out.println("The class method in hewan...");
    }
    
    
    //meng-overide method pada class hewan
    public void testInstanceMethod(){
        System.out.println("The Instance method in Gajah...");
    }
    
    
    public static void main(String[] args){
        Gajah myGajah = new Gajah();
        Hewan myHewan = new Hewan();
        Hewan.testClassMethod();
        Gajah.testClassMethod();
        myHewan.testInstanceMethod();
        myGajah.testInstanceMethod();
        
    }
}
