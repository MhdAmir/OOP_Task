/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Testing;

import Entity1.*;

/**
 *
 * @author mamir
 */
public class testLatihan1 {

    public static void main(String[] args) {
        String jawab = null;
        Mahasiswa fadilah = new Mahasiswa();
        fadilah.setUsername("fadilah");
        fadilah.setPassword("123456");
        fadilah.setPhone("083853501388");
        boolean result = fadilah.login("083853501388", "123456");
        jawab = result ? "Login berhasil" : "Login Gagal";
        System.out.println(jawab);
        
        Dosen fahrul = new Dosen("fahrul", "123456");
        fahrul.setKey("19990129");
        result = fahrul.login("fahrul", "123456", "19990129");
        jawab = result ? "Login berhasil" : "Login Gagal";
        System.out.println(jawab);

    }
}
