package pl.mg.ttt.web.formobject;

/**
 * Created by m on 2016-01-24.
 */
public class StartGameFormPojo {



    private boolean createNewGame;

    public boolean isCreateNewGame() {
        return createNewGame;
    }

    public void setCreateNewGame(boolean createNewGame) {
        this.createNewGame = createNewGame;
    }

    @Override
    public String toString() {
        return "StartGameFormPojo{" +
                "createNewGame=" + createNewGame +
                '}';
    }
}
