package pl.mg.ttt.data.model;

import javax.jws.soap.SOAPBinding;
import javax.persistence.*;

/**
 * Assocation class for ManyToMany mapping between Game and user entities
 * Created by m on 2016-01-17.
 */

@Entity
@Table(name = "user_game")
@IdClass(GameAssociationid.class)
public class GameAssociation {

    @Id
    private String username;

    @Id
    private int game_id;

    /**
     * This column describes user status in the game. Value consists of two elements connected with '_'. A_B:
     * when A is an information about game creator:
     * - MASTER - user is a master in the game - room is created by him
     * - SLAVE - user is slave in the game - he connected to already created room.
     * and B is an information about game :
     * -
     */
    @Column(name = "user_status")
    private String userStatus;

    @ManyToOne
    @PrimaryKeyJoinColumn(name = "username", referencedColumnName="username")
    private User user;

    @ManyToOne
    @PrimaryKeyJoinColumn(name = "game_id",referencedColumnName = "game_id")
    private Game game;


}
