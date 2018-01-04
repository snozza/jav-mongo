package com.packtpublishing.tddjava.ch03tictactoe;

import org.junit.Test;
import java.net.UnknownHostException;
import static org.junit.Assert.*;

public class TicTacToeInteg {

    @Test
    public void givenMongoDbisRunningWhenPlayThenNoException() throws UnknownHostException {
        TicTacToe ticTacToe = new TicTacToe();
        assertEquals(TicTacToe.NO_WINNER, ticTacToe.play(1, 1));
    }
}