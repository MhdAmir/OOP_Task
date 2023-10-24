package Entity1;

public class Dosen extends User {

    private String pangkat;
    private String golongan;
    private String key;

    public Dosen() {
    }

    public Dosen(String username, String password) {
        super(username, password);
    }

    public boolean login(String username_phone, String password, String key) {
        if (super.login(username_phone, password)
                && this.key.equals(key)) {
            return true;
        } else {
            return false;
        }
    }

    public String getPangkat() {
        return pangkat;
    }

    public void setPangkat(String pangkat) {
        this.pangkat = pangkat;
    }

    public String getGolongan() {
        return golongan;
    }

    public void setGolongan(String golongan) {
        this.golongan = golongan;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

}
