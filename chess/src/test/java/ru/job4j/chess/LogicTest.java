package ru.job4j.chess;

import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;


public class LogicTest {

    @Ignore
    @Test
    public void move() throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.C1, Cell.H6);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void impossibleMove() throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.F5));
        logic.add(new BishopBlack(Cell.C8));
        logic.move(Cell.C8, Cell.B8);
    }

    @Test(expected = OccupiedCellException.class)
    public void occupMove() throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.F5));
        logic.add(new BishopBlack(Cell.C8));
        logic.move(Cell.C8, Cell.F5);
    }

    @Test(expected = FigureNotFoundException.class)
    public void figureNotFoundMove() throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.F5));
        logic.add(new BishopBlack(Cell.C2));
        logic.move(Cell.C8, Cell.F5);
    }
}