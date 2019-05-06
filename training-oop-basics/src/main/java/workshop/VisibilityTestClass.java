package workshop;

import com.frequentis.training.oop.Movable;
import com.frequentis.training.oop.exceptions.IllegalMoveException;
import simplest.Simplest;

import java.util.ArrayList;
import java.util.List;

import static workshop.UnitConverter.KILOMETERS_TO_METRES;

public class VisibilityTestClass {

    private int test;

    public static void main(String[] args) throws IllegalMoveException, ConversionException {
        System.out.println(Simplest.value);
        /*final Simplest s = Simplest.createOneInstanceOfMyself();
        Game game = new ChessGame();
        Game game2 = new BackgammonGame();
 *//*       game.printStatistics();
        game2.printStatistics();*//*
        game.changeGame(new ChessGame());
        game.changeGame(game);
*/

        Unit a = Unit.LITRE;
        System.out.println(KILOMETERS_TO_METRES.convert( 1000));
    }
}
