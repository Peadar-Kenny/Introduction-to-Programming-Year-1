public class C4RandomAIPlayer extends ConnectPlayer {

    C4RandomAIPlayer(String Symbol) {
        super(Symbol);
    }

    @Override
    int selectColumn() {
        return ((int) (Math.random()*(7)));
    }
}
