

public class battleship2 {


    public static void main(String[] args) {

        int[][] table = new int[5][5];
        initTable(table);


    }


    public static void initTable(int[][] board){
        for(int row=0 ; row < 5 ; row++ )
            for(int col=0 ; col < 5 ; col++ )
                board[row][col]=-1;
    }



}
