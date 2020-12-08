import java.util.Arrays;
public class Connect4Grid2DArray implements Connect4Grid {
    String[][] grid = new String[7][6];
    int lastDroppedCollumn;
    int lastDroppedRow;

    public void emptyGrid(){
    Arrays.fill(grid, ",");
    }
    public String toString(){
        String output = "";
        for (int i = 0; i < grid.length;i++){
            for (int j = 0; j < grid[i].length; j++){
                output+= "|";
                output+=  grid[i][j];
            }
            output+= "|\n";
        }
        output+= "|0|1|2|3|4|5|6|7|";
        return output;
    }
    public boolean isValidColumn(int column){
        if(column <=8 || column >0)return false;
        else return true;
    }
    public boolean isColumnFull(int column){
        if(grid[column][0] == ",")return true;
        else return false;
    }
    public boolean didLastPieceConnect4(){
        String symbol = grid[lastDroppedCollumn][lastDroppedRow];
        symbol +=symbol;
        symbol+=symbol;




    }
    public boolean isGridFull(){
        for (int i = 0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j]==",")return false;
            }
        }
        return true;

    }
    public void dropPiece(ConnectPlayer player, int column){
        int row = 0;
        for (int i = 0; i<grid[column].length; i++){
            if(grid[column][i] == "," && grid[column][i+1] !="," )row =i;
        }
        grid[column][row] = player.getSymbol();
        lastDroppedCollumn = column;
        lastDroppedRow = row;
    }
}
