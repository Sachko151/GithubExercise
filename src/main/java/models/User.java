package models;

import org.hibernate.annotations.Table;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(appliesTo = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "username", unique = true)
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "phone_number")
    private String phone_number;
    @Column(name = "address")
    private String address;

    @OneToMany(mappedBy = "userId", targetEntity = Article.class)
    private Set<Article> articles;



    public User(long id, String username, String password, String phone_number, String address) {
        // TODO Auto-generated constructor stub
        this.id = id;
        this.username = username;
        this.password = password;
        this.phone_number = phone_number;
        this.address = address;
    }

    public String getaddress() {
        return address;
    }

    public void setaddress(String address) {
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getusername() {
        return username;
    }

    public void setusername(String username) {
        this.username = username;
    }

    public String getpassword() {
        return password;
    }

    public void setpassword(String password) {
        this.password = password;
    }

    public String getphone_number() {
        return phone_number;
    }

    public void setphone_number(String phone_number) {
        this.phone_number = phone_number;
    }
}