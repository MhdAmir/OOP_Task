package Entity2;

public class User {

    private String id;
    private String phone;
    private String username;
    private String password;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean login(String username_phone, String password) {
        if (isNumeric(username_phone)) {
            if (this.phone.equals(username_phone)
                    && this.password.equals(password)) {
                return true;
            } else {
                return false;
            }
        } else {
            if (this.username.equals(username_phone)
                    && this.password.equals(password)) {
                return true;
            } else {
                return false;
            }
        }
    }

    public boolean isNumeric(String str) {
        return str.matches("\\d+");
    }
}
