package pl.mg.ttt.data.model;

import java.io.Serializable;

/**
 * Composite id clas required to implement GameAssociation entity as manytomany mapping with parameters
 * Created by m on 2016-01-17.
 */
public class GameAssociationid implements Serializable {

    private String username;

    private int game_id;

    @Override
    public int hashCode() {
        return username.hashCode() + game_id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof GameAssociationid) {
            GameAssociationid gameAssociationid = (GameAssociationid) obj;
            return (gameAssociationid.game_id == game_id) && (gameAssociationid.username.equals(username));
        }
        return false;
    }
}
