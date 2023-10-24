package Entity2;

public class Mahasiswa extends User{
    private Dosen dosenWali;
    private String kelas;
    
    public Mahasiswa(){
    }
    
    public Mahasiswa(String username_password, String password){
        super(username_password, password);
    }
    
}
