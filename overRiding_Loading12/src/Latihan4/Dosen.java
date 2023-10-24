package Latihan4;

public class Dosen extends Orang {

    private int nip;

    public Dosen(String nama) {
        super(nama);
    }

    public Dosen(String nama, int nip) {
        super(nama);
        this.nip = nip;
    }

    public Dosen(String nama, int nip, int umur) {
        super(nama, umur);
        this.nip = nip;
    }

    public void Info() {
        System.out.println("nama : " + super.nama);

        if (this.nip != 0) {
            System.out.println("nip : " + this.nip);
        } else {
            System.out.println("nip : -");
        }
        
        if (super.umur != 0) {
            System.out.println("umur : " + super.umur);
        } else {
            System.out.println("umur : -");
        }
    }

}
