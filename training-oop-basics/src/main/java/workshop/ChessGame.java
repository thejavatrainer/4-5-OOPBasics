package workshop;

import com.frequentis.training.oop.Movable;
import com.frequentis.training.oop.Position;
import com.frequentis.training.oop.exceptions.IllegalMoveException;

public class ChessGame extends Game implements Movable {

    @Override
    public void movePiece() {
        System.out.println("move from chessGame");
    }

    public void move(Position position) throws IllegalMoveException {

    }
}
