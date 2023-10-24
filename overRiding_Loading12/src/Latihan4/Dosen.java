package Latihan4;

public class Dosen extends Orang {

    private int nip;

    public Dosen(String nama) {
        super(nama);
    }

    public Dosen(String nama, int nip) {
        super(nama);
    }

    public Dosen(String nama, int nip, int umur) {
        super(nama, nip);
        this.umur = umur;
    }
    
    public void Info(){
        System.out.println("nama : " + super.nama);
        System.out.println("umur : " + super.umur);
        System.out.println("nip : " + this.nip);
    }

}
