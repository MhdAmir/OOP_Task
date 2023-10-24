package Tugas2;

public class Katak {

    int umur;
    String nama;

    public Katak(int umur, String nama) {
        this.umur = umur;
        this.nama = nama;
    }

    String caraBergerak() {
        if (umur > 2) 
            return "melompat";
        else
            return "berenang";
    }
}
