package pl.mg.ttt.data.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by m on 2016-01-16.
 */

@Entity
public class User {


    @Id
    private String username;

    private String password;
    private String role;


    @OneToMany(mappedBy = "username")
    private List<GameAssociation> games;


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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<GameAssociation> getGames() {
        return games;
    }

    public void setGames(List<GameAssociation> games) {
        this.games = games;
    }
}
