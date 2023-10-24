package Entity1;

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
//    public boolean login(String phone, String password){
//        if(this.phone.equals(phone) && 
//           this.password.equals(password))
//        {
//           return true; 
//        }
//        else 
//        {
//           return false;
//        }
//    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
