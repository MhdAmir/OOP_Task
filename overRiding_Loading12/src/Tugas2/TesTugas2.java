package Tugas2;

public class TesTugas2 {

    public static void main(String[] args) {
        Katak O1 = new Katak(5, "Froggy");
        Kecebong O2 = new Kecebong(2, "Junior Frog", 10);
        
        System.out.println("Obyek = O1");
        System.out.println("umur = " + O1.umur);
        System.out.println("nama = " + O1.nama);
        System.out.println("panjangEkor = ");
        System.out.println("caraBergerak = " + O1.caraBergerak() + "\n");
        
        System.out.println("Obyek = O2");
        System.out.println("umur = " + O2.umur);
        System.out.println("nama = " + O2.nama);
        System.out.println("panjangEkor = " + O2.panjangEkor);
        System.out.println("caraBergerak = " + O1.caraBergerak());
    }
    
}
