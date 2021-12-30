package models.entities;

import java.util.Date;

public class Client {
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
}
