public abstract class ConnectPlayer {
    private String symbol;
    ConnectPlayer(String Symbol){
        this.symbol=Symbol;
    }
    String getSymbol(){
        return symbol;
    }
    abstract int selectColumn();
}
