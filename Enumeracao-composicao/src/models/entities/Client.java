package models.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private String name;
    private String email;
    private Date birthdDate;

    public Client(String name, String email, Date birthDate) {
        this.name = name;
        this.email = email;
        this.birthdDate = birthDate;
    }

    // GET-SET
    public String getName() {
        return name;
    }

    public Date getBirthdDate() {
        return birthdDate;
    }

    public void setBirthdDate(Date birthdDate) {
        this.birthdDate = birthdDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return name + " (" + sdf.format(birthdDate) + ") - " + email; 
    }
}
