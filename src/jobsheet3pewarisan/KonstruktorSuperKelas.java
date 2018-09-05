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
public class KonstruktorSuperKelas
{
    public static void main(String[] args){
        Employ programmer1 = new Employ("123456", "Yanto",32);
        programmer1.info();
        
        Person aku = new Person("Fani",20);
        aku.info();
    }
}

