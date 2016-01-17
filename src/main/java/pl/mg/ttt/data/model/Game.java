package pl.mg.ttt.data.model;

import javax.persistence.*;
import java.util.List;

/**
 * Game entity class
 * Created by m on 2016-01-17.
 */

@Entity
public class Game {


    @Id
    @Column(name = "game_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int gameId;

    @Column(name = "game_status")
    private String game_status;


    @OneToMany(mappedBy = "game")
    private List<User> users;

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getGame_status() {
        return game_status;
    }

    public void setGame_status(String game_status) {
        this.game_status = game_status;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }


    @Override
    public String toString() {
        return "Game{" +
                "gameId=" + gameId +
                ", game_status='" + game_status + '\'' +
                ", users=" + users +
                '}';
    }
}
