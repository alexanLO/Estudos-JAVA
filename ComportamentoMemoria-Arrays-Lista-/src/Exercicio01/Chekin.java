package Exercicio01;

public class Chekin {
    private String name;
    private String email;

public Chekin(String name, String email){
    this.name = name;
    this.email = email;
}

    public String getName() {
        return name;
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