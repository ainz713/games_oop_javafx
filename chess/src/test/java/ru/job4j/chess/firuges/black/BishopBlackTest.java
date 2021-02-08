package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void positionControl() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertThat(bishopBlack.position(), is(Cell.C1));
    }

    @Test
    public void copyControl() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertThat(bishopBlack.copy(Cell.A4).position(), is(Cell.A4));
    }

    @Test
    public void wayControl() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        Cell[] steps = bishopBlack.way(Cell.G4);
        String[] massiv = new String[steps.length];
        for (int i = 0; i < steps.length; i++) {
            massiv[i] = String.valueOf(steps[i]);
        }
        assertThat(Arrays.toString(massiv), is("[D7, E6, F5, G4]"));
    }
}