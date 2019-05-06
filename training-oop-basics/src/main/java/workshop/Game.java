package workshop;

public abstract class Game {

    public void printStatistics() {
        System.out.println("stats for this game " + this.getClass() + ": 0 matches");
    }

    public void movePiece(){
        System.out.println("moved from Game");
    }

    public void changeGame(Game g){
        System.out.println("changing game " + g.getClass());
    }

    public void changeGame(ChessGame g){
        System.out.println("changing chessgame " + g.getClass());
    }
}
