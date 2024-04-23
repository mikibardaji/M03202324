package Exercici3;


public class User {
    private int id;
    private String name;
    private String password;
    private double balance;

    public User(int id, String name, String password, double balance) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.balance = balance;
    }

    public User(int id) {
        this.id = id;
    }
    
    public User(User other) {
        this.id = other.id;
        this.name = other.name;
        this.password = other.password;
        this.balance = other.balance;
    }   

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getpassword() {
        return password;
    }

    public void setpassword(String password) {
        this.password = password;
    }

    public double getbalance() {
        return balance;
    }

    public void setbalance(double balance) {
        this.balance = balance;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("User{");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", password=").append(password);
        sb.append(", balance=").append(balance);
        sb.append('}');
        return sb.toString();
    }
    
}
